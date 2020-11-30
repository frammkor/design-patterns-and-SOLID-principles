package com.coffeepoweredcrew.adapter;

/**
 * An object adapter. Using composition to translate interface
 */
public class EmployeeObjectAdapter implements Customer {

    // write a constructor that expect a Adaptee
    public EmployeeObjectAdapter(Employee adaptee) {
        this.adaptee = adaptee;
    }

    private Employee adaptee;
		
    @Override
    public String getName () {
        return adaptee.getFullName();
    }
    
    @Override
    public String getDesignation () {
        return adaptee.getJobTitle();
    }    

    @Override
    public String getAddress () {
        return adaptee.getOfficeLocation();
    }

}
