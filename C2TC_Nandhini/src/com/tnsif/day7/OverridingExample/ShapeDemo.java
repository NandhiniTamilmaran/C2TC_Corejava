package com.tnsif.day7.OverridingExample;

public class ShapeDemo {
public static void main(String[] args) {
	Shape[]shapes=new Shape[3];
	
	shapes[0]=new Circle(5.0);
	shapes[1]=new Triangle(5.0,6.0);
	shapes[2]=new Square(7.0);
	
	for(Shape shape:shapes) {
		shape.draw();
		shape.erase();
		System.out.println("-----------");
		
	}
}
}
