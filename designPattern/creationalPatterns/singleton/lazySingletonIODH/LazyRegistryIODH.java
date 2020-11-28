package com.coffeepoweredcrew.singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {

	// prevents instance creation and inheritance
	private LazyRegistryIODH() {
		// System.out.println("In LazyRegistryIODH singleton");
	}
	
	// this RegistryHolder wont run until someone calls the getInstance method, therefore is a kind of lazy initialization
	private static class RegistryHolder {
		static LazyRegistryIODH INSTANACE = new LazyRegistryIODH();
	}
	
	public static LazyRegistryIODH getInstance() {
		return RegistryHolder.INSTANACE;
	}
}
