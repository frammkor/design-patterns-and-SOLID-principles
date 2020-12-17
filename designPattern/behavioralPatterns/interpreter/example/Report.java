package com.coffeepoweredcrew.interpreter;

// the application has reports, each will be an instance of this class, and their access is granted based on permissions
public class Report {

	private String name;
	//"NOT ADMIN", "FINANCE_USER AND ADMIN"
	private String permission;
	
	public Report(String name, String permissions) {
		this.name = name;
		this.permission = permissions;
	}

	public String getName() {
		return name;
	}

	public String getPermission() {
		return permission;
	}
	
}
