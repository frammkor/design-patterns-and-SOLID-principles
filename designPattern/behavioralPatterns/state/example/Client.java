package com.coffeepoweredcrew.state;

public class Client {

    public static void main(String[] args) {
        Order order = new Order();
        // the Context is defining its initial state by it self

        order.paymentSuccessful();

        order.dispatched();

        order.delivered();

        order.cancel();
    }
}
