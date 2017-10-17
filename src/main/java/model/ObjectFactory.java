package model;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

	public Greeting createGreeting() {
		return new Greeting();
	}

}