package com.coffeepoweredcrew.command;

//A Concrete implementation of Command.
public class AddMemberCommand implements Command {
	
	private String emailAddress;
	
	private String listName;
	
	private EWSService receiver;
	
	// constructor, the only place where you should ask information needed by Command
	public AddMemberCommand(String email, String listName, EWSService service) {
		this.emailAddress = email;
		this.listName = listName;
		this.receiver = service; 
	}
	
	@Override
	public void execute() {
		receiver.addMember(emailAddress, listName);
	}
		

}
