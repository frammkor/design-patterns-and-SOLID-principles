package com.coffeepoweredcrew.interpreter;

public class Client {

	public static void main(String[] args) {
		// create a report
		Report report1 = new Report("Cashflow report", "NOT ADMIN");

		ExpressionBuilder builder = new ExpressionBuilder();

		// give the report to the builder to build the syntax tree
		PermissionExpression exp = builder.build(report1);
		System.out.println(exp);

		User user1 = new User("Dave", "USER", "ADMIN");

		System.out.prinln("User access report:", exp.interpret(user1));
	}

}
