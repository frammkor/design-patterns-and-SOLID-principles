package com.coffeepoweredcrew.singleton;

public class Client {

	public static void main(String[] args) {
		
		LazyRegistryWhitDLC singleton1 = LazyRegistryWhitDLC.getInstance();
		LazyRegistryWhitDLC singleton2 = LazyRegistryWhitDLC.getInstance();
		System.out.println(singleton1 == singleton2); // true
	}

}
