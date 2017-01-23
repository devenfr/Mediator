/**
 * 
 */
package com.mydomain.designpatterns.mediator;

import java.util.ArrayList;

/**
 * @author ic021075
 *
 */
public class ConcreteMediator implements Mediator {

	private ArrayList<Colleague> colleagues;

	/**
	 * Constructor
	 */
	public ConcreteMediator() {
		colleagues = new ArrayList<Colleague>();
	}

	/**
	 * Adds a colleague to the list
	 * 
	 * @param colleague
	 *            added to the list
	 */
	public void addColleague(Colleague colleague) {
		colleagues.add(colleague);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mydomain.designpatterns.mediator.Mediator#send(java.lang.String,
	 * com.mydomain.designpatterns.mediator.Colleague)
	 */
	public void send(String message, Colleague originator) {
	
		for (Colleague colleague : colleagues) {					
			// don't tell ourselves
			if (colleague != originator) {
				colleague.receive(message);
			}			
		}
	}
}
