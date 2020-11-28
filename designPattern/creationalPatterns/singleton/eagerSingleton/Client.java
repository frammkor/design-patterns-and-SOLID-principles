package com.coffeepoweredcrew.singleton;

public class Client {

	public static void main(String[] args) {

		// wont work
		// EagerRegistry registry = new EagerRegistry();

		EagerRegistry registry = EagerRegistry.getInstance();


	}

}
