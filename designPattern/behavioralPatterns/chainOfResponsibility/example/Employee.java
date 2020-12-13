package com.coffeepoweredcrew.chainofresponsibility;

// Abstract handler
public abstract class Employee implements LeaveApprover{

	private String role;
	
	private LeaveApprover successor;
	
	// constructor
	public Employee(String role, LeaveApprover successor) {
		this.role = role;
		this.successor = successor;
	}
	
	@Override 
	public void processLeaveApplication(LeaveApplication application) {
		if(!processRequest(application) && successor != null) {
			successor.processLeaveApplication(application);
		}
	}

	// any subclass that extend will need to provide an implementation of processRequest
	// this is done so to provide in this interface an implementation of processLeaveApplication
	protected abstract boolean processRequest(LeaveApplication application);
	
	@Override
	public String getApproverRole() {
		return role;
	}

	
}