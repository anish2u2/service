package org.services.mq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.services.contracts.Destroy;
import org.services.contracts.Init;

public class MQServer implements Init, Destroy {

	private static MQServer server;

	private ConnectionFactory connectionFactory;

	private Connection connection;

	static {
		getInstance().init();
	}

	public static MQServer getInstance() {
		if (server == null)
			server = new MQServer();
		return server;
	}

	public void init() {
		try {
			connectionFactory = new ActiveMQConnectionFactory("vm://localhost");
			System.out.println("Server Started..");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public Connection getConnection() {
		try {
			if (connectionFactory != null) {

				connection = connectionFactory.createConnection();
			}
			return connection;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public void test() {
		try {
			Connection connection = getConnection();
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Queue queue = session.createQueue("exampleQueue");
			MessageProducer producer = session.createProducer(queue);
			TextMessage message = session.createTextMessage("Hi tetsing message!");
			producer.send(message);
			System.out.println("message sent");
			MessageConsumer consumer = session.createConsumer(queue);
			connection.start();
			TextMessage textMessage = (TextMessage) consumer.receive(5000);
			System.out.println("Recieved :" + textMessage.getText());
			connection.stop();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void destroy() {
		try {
			connectionFactory = null;
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
