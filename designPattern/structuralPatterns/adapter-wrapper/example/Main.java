package com.coffeepoweredcrew.adapter;

public class Main {

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/ 
		EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
		// the Adapter is extending the Adaptee class so it has the same properties and values, thus can be populated as another Adaptee
		populateEmployeeData(classAdapter);
		BusinessCardDesigner designer = new BusinessCardDesigner();
		String card1 = designer.designCard(classAdapter);
		System.out.println(card1);
		
		/** Using Object Adapter **/
		Employee employee = new Employee();
		// the Adapter does not extends the Adaptee, but receives it, so the Adaptee must be created and populated before it can be pass to the adapter
		populateEmployeeData(employee);
		EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
		String card2 = designer.designCard(objectAdapter);
		System.out.println(card2);

	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
