package org.services.contracts.mq;

import javax.jms.Connection;

/**
 * This interface allows method to retrieve connections.
 * 
 * @author Anish Singh
 *
 */
public interface MQConnectionFactory {

	/**
	 * This method will return a new connection from the connection factory.
	 * 
	 * @return
	 */
	Connection getConnection();

}
