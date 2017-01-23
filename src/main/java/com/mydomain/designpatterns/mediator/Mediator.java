/**
 * 
 */
package com.mydomain.designpatterns.mediator;

/**
 * @author ic021075
 *
 */
public interface Mediator {
	/**
	 * Mediator interface which encapsulates communication between Colleagues.
	 */
	void send(String message, Colleague colleague);
}
