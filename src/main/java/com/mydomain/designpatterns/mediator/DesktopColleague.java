/**
 * 
 */
package com.mydomain.designpatterns.mediator;

/**
 * @author ic021075
 *
 */
public class DesktopColleague extends Colleague {

	public DesktopColleague(Mediator m) {
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
		System.out.println("Desktop Received: " + message);
	}
}
