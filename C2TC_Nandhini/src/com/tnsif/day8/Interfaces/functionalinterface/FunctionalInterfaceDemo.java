package com.tnsif.day8.Interfaces.functionalinterface;

public class FunctionalInterfaceDemo {
public static void main(String[] args) {
	Greetclass g=new Greetclass();
	
	System.out.println(g.greet());
	GreetInterface g1=()->{
		return "Good Afternoon";
	};
	
	System.out.println(g1.greet());
}
}
