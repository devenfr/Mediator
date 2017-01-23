/**
 * 
 */
package com.mydomain.designpatterns.mediator;

/**
 * @author ic021075
 *
 */
public class TabletteColleague extends Colleague {

	public TabletteColleague(Mediator m) {
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
		System.out.println("Tablette Received: " + message);
	}
}
