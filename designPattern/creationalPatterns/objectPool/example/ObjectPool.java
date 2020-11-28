package com.coffeepoweredcrew.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

    // cache objects in memory
    private BlockingQueue<T> availablePool;

    // constructor
    // when the object pool is created we will generate some objects
    public ObjectPool(Supplier<T> creator, int count) {
        availablePool = new LinkedBlockingQueue<>();
        for(int i = 0; i < count; i++) {
            availablePool.offer(creator.get());
        }
    }

    // method that allows to get objects form the object pool
    public T get() {
        try {
            return availablePool.take();
        } catch (InterruptedException ex) {
            // if the queue is empty is going to block and throw and exception and wait

            // TODO: here we would decide what to do if the object pool is empty

            // A) Create a new object
            // B) Wait for available resources

            System.err.println("take() was interrupted")
        }
        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException ex) {
            System.err.println("put() was interrupted")
        }
    }

}
