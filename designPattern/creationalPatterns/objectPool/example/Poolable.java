package com.coffeepoweredcrew.objectpool;

// any class that implements this interface can be pooled into our object pool
public interface Poolable {

    // reset state - All implementing classes will reset their state when this method is called
    void reset();

}
