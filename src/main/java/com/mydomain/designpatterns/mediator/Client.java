package com.mydomain.designpatterns.mediator;

/**
 * Implementation of Mediator Design Pattern
 *
 */
public class Client {
	public static void main(String[] args) {
		// Create Mediator who facilitates communication between colleagues			
		ConcreteMediator mediator = new ConcreteMediator();

		// Create colleagues who need to communicate
		Colleague desktop = new DesktopColleague(mediator);
		Colleague mobile = new MobileColleague(mediator);
		Colleague tablette = new TabletteColleague(mediator);

		// Adds colleagues to the list of colleagues maintained by the
		// ConreteMediator
		mediator.addColleague(desktop);
		mediator.addColleague(mobile);
		mediator.addColleague(tablette);

		desktop.send("Hello from Desktop!");
		mobile.send("Hello from Mobile!");
		tablette.send("Hello from Tablette!");
	}	
}
