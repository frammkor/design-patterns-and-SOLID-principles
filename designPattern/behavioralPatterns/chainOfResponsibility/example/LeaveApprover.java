package com.coffeepoweredcrew.chainofresponsibility;

// This Abstract Handler represents a handler in chain of responsibility
public interface LeaveApprover {

	void processLeaveApplication(LeaveApplication application);
	
	String getApproverRole(); // to get who approved the Application

}
