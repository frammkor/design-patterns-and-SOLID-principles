package com.coffeepoweredcrew.templatemethod;

// Abstract base class defines the template method
public abstract class OrderPrinter {

    // here the algorithm is defined and is label "final" so it can not be overridden
    // Client has only freedom on the "how the steps are implemented"
    public final void printOrder (Order, order, String filename) {

        try (PrintWriter writer = new PrintWriter(filename)) {

            writer.println(start());

            writer.println(formatOrderNumber(order));

            writer.println(formatItems(order));

            writer.println(formatTotal(order));

            writer.println(end(order));

        }

    }

    protected abstract String start ();

    protected abstract String formatOrderNumber (Order order);

    protected abstract String formatItems (Order order);

    protected abstract String formatTotal (Order order);

    protected abstract String end();

}
