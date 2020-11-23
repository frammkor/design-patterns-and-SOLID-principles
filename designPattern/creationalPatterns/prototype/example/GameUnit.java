package com.coffeepoweredcrew.prototype;

import javafx.geometry.Point3D;

/**
 * This class represents an abstract prototype & defines the clone method
 * 
 * cloneable is a in-build java interface
 */
public abstract class GameUnit implements Cloneable {
	
	private Point3D position;
	
	public GameUnit() {
		position = Point3D.ZERO;
	}
	
	// having this clone methods as public will make it accessible to the client, and the CloneNotSupportedException will be used by subclasses that do not support cloning
	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		// this is a shallow copy, because of the Point3D properties and that is the only property of this class (GameUnit) a shallow copy is enough
		GameUnit unit = (GameUnit)super.clone();
		// reset the position property state before returning the cloned class
		unit.initialize();
		return unit;
	}

	protected void initialize() {
		// reset base class property
		this.position = Point3D.ZERO;
		// reset subclasses properties if any
		reset();
	}
	
	// to be override by the subclasses so to give them a way to reset their own properties
	protected abstract void reset();
	
	public GameUnit(float x, float y, float z) {
		position = new Point3D(x, y, z);
	}

	public void move(Point3D direction, float distance) {
		Point3D finalMove = direction.normalize();
		finalMove = finalMove.multiply(distance);
		position = position.add(finalMove);
	}
	
	public Point3D getPosition() {
		return position;
	}
}
