package com.coffeepoweredcrew.abstractfactory2;

//Represents an abstract product. A compute resource that is available from a cloud provider.
public interface Instance {
    enum Capacity{micro, small, large}

    void start();

    void attachStorage(Storage storage);

    void stop();
}
 