package day3;

import day2.entity.customer;

public class customerdemo {
	public static void main(String[] args) {
		customer c1=new customer(); 
		System.out.println(c1);
		
		customer c2=new customer(); 
		c2.setCname("Kumari");
		c2.setCid(53);
		c2.setCity("kerala");
		System.out.println(c2);
		
		
	}
}
