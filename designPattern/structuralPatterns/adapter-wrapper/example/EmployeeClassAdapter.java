package com.coffeepoweredcrew.adapter;

/**
 * A class adapter, works as Two-way adapter
 */
public class EmployeeClassAdapter extends Employee implements Customer {

    // we can access methods getFullName, getJobTitle, and getOfficeLocation because this class is extending Employee
    
    @Override
    public String getName () {
        return this.getFullName();
    }
    
    @Override
    public String getDesignation () {
        return this.getJobTitle();
    }    

    @Override
    public String getAddress () {
        return this.getOfficeLocation();
    }

}
