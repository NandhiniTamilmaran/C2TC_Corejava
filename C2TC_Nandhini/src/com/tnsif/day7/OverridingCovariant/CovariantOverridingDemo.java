package com.tnsif.day7.OverridingCovariant;

public class CovariantOverridingDemo {
	public static void main(String arg[])
			throws CloneNotSupportedException
		{
			// new student object created
			Student student1 = new Student(1, "Btech", "Nandhini");
			student1.printData();

			// Student object created using clone method
			// assuming type casting is required
			Student student2 = (Student) student1.clone();
			student2.printData();
		
		
		}
}
