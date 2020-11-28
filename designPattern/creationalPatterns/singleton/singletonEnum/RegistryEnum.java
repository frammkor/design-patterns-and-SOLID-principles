package com.coffeepoweredcrew.singleton;

/**
 * (Ref. Google I/O 2k8 Joshua Bloch)
 * Since Java 1.5 using enum is clean way to create a singleton. It handles serialization using java's in-built
 * mechanism and still ensure single instance
 */

// you can not extend form enums, you can not create objects form a enum
public enum RegistryEnum {

    INSTANCE;

    public void someMethod() {
        //Do actual work here.
    }
}