package com.company.liskov_1;

public class Square implements Shape {

	//? because the stop extending the Rectangle class we need to provide a property to store the side length
	private int side;
	
	public Square(int side) {
		this.side = side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	@Override
	public int computeArea() {
		return side*sede;
	}
}
