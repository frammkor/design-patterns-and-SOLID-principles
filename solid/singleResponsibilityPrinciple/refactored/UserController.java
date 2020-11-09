import java.io.IOException;

public class UserController {

    private UserPersistanceService persistenceService = new UserPersistanceService();

    // Create a new user
    public String createUser(String userJason) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(userJason, User.class);

        //? UserValidator class created and logic was moved over there
        UserValidator validator = new UserValidator();
        boolean valid = validator.validateUser(user);

        if(!valid) {
            return "ERROR";
        }

        persistenceService.store(user);

        return "SUCCESS";
    }

}