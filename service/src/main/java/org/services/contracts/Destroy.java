package org.services.contracts;

/**
 * This interface introduces methods that will allow you to be executed before
 * disposal of object.
 * 
 * @author Anish Singh
 *
 */
public interface Destroy {

	/**
	 * This method allow you to executed when the object is going to destroyed.
	 */
	public void destroy();

}
