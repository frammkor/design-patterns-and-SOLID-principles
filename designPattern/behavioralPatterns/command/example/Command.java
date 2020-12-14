package com.coffeepoweredcrew.command;

//Interface implemented by all concrete
//command classes
public interface Command {
	
	// execute does not use any argument because all the information needed by Command is given to its instance when is created
	void execute();

}
