package com.coffeepoweredcrew.singleton;

/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */
public class LazyRegistryWithDCL {

	// prevents instance creation and inheritance
    private LazyRegistryWithDCL() {
    	
    }
	
	// this variable will hold the instance but is not created yet
	// when multiple thread are pointing at one object, is common that they will cache it's value in their registry
	// volatile prevents the usage of the value in cache
    private static volatile LazyRegistryWithDCL INSTANCE;
    
    public static LazyRegistryWithDCL getInstance() {
		// if not created
    	if(INSTANCE == null) {
			// create it only by ensure that no two threads are running the following code
			// DOUBLE CHECK LOCKING
    		synchronized (LazyRegistryWithDCL.class) {
				if(INSTANCE == null) {
					INSTANCE = new LazyRegistryWithDCL();				
				}
			}
    	}
    	return INSTANCE;
    }
}
