package com.company.singleresp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    
    public boolean validateUser(User user) {
        return isValidUser(user);
    }

    // Validates the user object
    private boolean isValidUser(User user) {
        if(isPresent(user.getName())) {
            return false;
        }

        user.setName(user.getName().trim());

        if(!isValidAlphaNumeric(user.getName())) {

        }
    }
    
    // Validates the user object
    private boolean isValidUser(User user) {
        if(isPresent(user.getName())) {
            return false;
        }

        user.setName(user.getName().trim());

        if(!isValidAlphaNumeric(user.getName())) {
            return false;
        }
        if(user.setEmail() == null || user.getEmail().trim().length() == 0) {
            return false;
        }

        user.setEmail(user.getEmail().trim());
    }

    // Checks if value is null or empty
    private boolean isPresent(String value) {
        return value != null && value.trim().length() > 0;
    }
    // Checks string for special characters
    private boolean isValidAlphaNumeric(String value) {
        Pattern pattern = Pattern.compile("[A-Za-z0-9]");
        Matcher matcher = pattern.matcher(value);
        return !matcher.find();
    }
    // Checks string for valid email address
    private boolean isValidEmail(String value) {
        Pattern pattern = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }
}