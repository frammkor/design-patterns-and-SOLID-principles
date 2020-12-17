package com.coffeepoweredcrew.interpreter;

//Abstract expression
public interface PermissionExpression {

	// Interpreter needs a context as an argument, in this case, a User
	boolean interpret(User user);

}
