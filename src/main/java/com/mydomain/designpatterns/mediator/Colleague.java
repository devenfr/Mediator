/**
 * 
 */
package com.mydomain.designpatterns.mediator;

/**
 * @author ic021075
 *
 */
public abstract class Colleague {

	private Mediator mediator;

	/**
	 * Class constructor
	 * 
	 * @param Mediator
	 *            object
	 */
	public Colleague(Mediator m) {
		mediator = m;
	}

	/**
	 * Send a message via the Mediator
	 * 
	 * @param message
	 *            Message to be sent to the Colleague
	 */
	public void send(String message) {
		mediator.send(message, this);
	}

	/**
	 * Get access to the Mediator
	 * 
	 * @return {@link Mediator}
	 */
	public Mediator getMediator() {
		return mediator;
	}

	/**
	 * Receive a message via the Mediator
	 * 
	 * @param message
	 *            to be received by the Colleague
	 */
	public abstract void receive(String message);

}
