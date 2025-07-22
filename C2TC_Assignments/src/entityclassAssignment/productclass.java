package entityclassAssignment;

import java.util.Scanner;

public class productclass {
public static void main(String[] args) {
	Scanner  nand=new Scanner(System.in);
	System.out.println("Enter the product name:");
	String name=nand.nextLine();
	System.out.println("Enter the quantity");
	int quantity=nand.nextInt();
	System.out.println("Enter the price:");
	float price=nand.nextFloat();
	
	System.out.println("Enter the Amount:");
	int amount=nand.nextInt();
	}
}

