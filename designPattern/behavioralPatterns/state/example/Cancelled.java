package com.coffeepoweredcrew.state;

public class Cancelled implements OrderState {

   @Override
   public double handleCancellation() {
        throw new IllegalStateException("Cancelled order. Can not be cancelled again");
   }

}
