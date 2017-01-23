/**
 * 
 */
package com.mydomain.designpatterns.mediator;

/**
 * @author ic021075
 *
 */
public class MobileColleague extends Colleague {

	public MobileColleague(Mediator m) {
		super(m);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mydomain.designpatterns.mediator.Colleague#receive(java.lang.String)
	 */
	@Override
	public void receive(String message) {
		System.out.println("Mobile Received: " + message);
	}
}
