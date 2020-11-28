package com.coffeepoweredcrew.singleton;
/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerRegistry {
	
    // make sure that there is only one instance created. Prevent anyone from creating instances.

    // private constructor that also prevents inheritance
    private EagerRegistry() {

    }

    // create singleton instance
    private static final EagerRegistry INSTANCE = new EagerRegistry();

    // publicly accessible static method
    public static EagerRegistry getInstance() {
        return INSTANCE
    }
}