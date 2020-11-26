package com.coffeepoweredcrew.abstractfactory2;

import com.coffeepoweredcrew.abstractfactory2.aws.AwsResourceFactory;
import com.coffeepoweredcrew.abstractfactory2.gcp.GoogleResourceFactory;

public class Client {

    public ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    // this method is going to provision the compute resource as well as storage. Created on a single cloud provider based upon the factory instance that we actually provide.
    public Instance createServer(Instance.Capacity cap, int storageMib) {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main (String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Capacity.micro, 20480);
        i1.start();
        i1.stop();

        System.out.printLn("**********************")
        Client gcp = new Client(new GoogleResourceFactory());
        Instance i2 = gcp.createServer(Capacity.micro, 20480);
        i2.start();
        i2.stop();
    }

}
