package com.tnsif.day7.OverridingExample;

public class Triangle extends Shape{
private double base;
private double height;

public Triangle(double base,double height) {
	this.base=base;
	this.height=height;
}
@Override
public void draw() {
	System.out.println("Drawing a triangle with base "+base+" and height "+height);
}
@Override
public void erase() {
	System.out.println("Erasing a Triangle with base "+base+" and  height "+height);
}
}
