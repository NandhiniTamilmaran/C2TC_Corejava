package com.tnsif.day7.Overriding;

public class OverridingDemo {
public static void main(String[] args) {
	RBI rbi;
	rbi=new SBI();
	System.out.println(rbi.getRateOfInterest());
	
	rbi=new ICICI();
	System.out.println(rbi.getRateOfInterest());
	
	rbi=new HDFC();
	System.out.println(rbi.getRateOfInterest());
}
}
