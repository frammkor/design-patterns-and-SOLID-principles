

import java.io.IOException;

public class UserController {

    private Store store = new Store();

    // Create a new user
    public String createUser(String userJason) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(userJason, User.class);

        //! VALIDATION IS SOMETHING THAT THE CONTROLLER SHOULD NOT DO!
        if(!isValidUser(user)) {
            return "ERROR";
        }

        store.store(user);

        return "SUCCESS";
    }

    //! THE FOLLOWING CODE SHOULD NOT BE HERE, BUT IN A CLASS FOR INPUT VALIDATION
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