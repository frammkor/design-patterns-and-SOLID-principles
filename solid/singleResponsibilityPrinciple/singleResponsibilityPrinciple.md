/*
There should never be more than one reason for a class to change

A class provide addresses a single or specific functionality

When ever you are trying to check that a class satisfies the SRP, you have to ask:
1 - "What is this class supposed to do?"
2 - "What is this class doing right now?"

The example of UserController class should receive the request form the client and hand it to the rest of the application, get the results of the processed request and send it back to the client.
But in this case is doing multiple things (business logic that should be done somewhere else), creating a user object, validating the object, and storing it.

The best thing to ensure that you are following the principle is to have a GOOD TEST CASE
*/