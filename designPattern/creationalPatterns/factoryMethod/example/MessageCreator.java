package com.coffeepoweredcrew.factorymethod;

import com.coffeepoweredcrew.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses / concrete creator.
 */
public abstract class MessageCreator {

	public Message getMessage() {
		Message msg = createMessage();
		
		msg.addDefaultHeaders();
		msg.encrypt();
		
		return msg;
	}
	
	//Factory method
	/*
	Subclasses must provide implementation for this & return a specific Message subclass
	*/
	protected abstract Message createMessage();
}
