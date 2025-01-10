package org.myapp.solid.principls.open_close_principle;

public class AreaCalculator {
	
	public double calculateArea(Rectangle rectangle) {
		return rectangle.getWidth() * rectangle.getHeight();
	}

	public double calculateArea(Circle circle) {
		return Math.PI * circle.getRadius() * circle.getRadius();
	}
}
