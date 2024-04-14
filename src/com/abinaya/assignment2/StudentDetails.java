package com.abinaya.assignment2;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Rollno:");
		int roll_no=s.nextInt();
		System.out.println("Enter Your Name:");
		String name=s.next();
		System.out.println("Enter Your initial:");
		char initial=s.next().charAt(0);
		System.out.println("Enter Your Grade:");
		char grade=s.next().charAt(0); 
		System.out.println("Enter Your Percentage:");
		float percentage=s.nextFloat();
		
		System.out.println("View Details:");
		System.out.println("\tRoll_no:"+roll_no);
		System.out.print("\tName(with initial):"+name);
		System.out.println(" "+initial);
		System.out.println("\tGrade:"+grade);
		System.out.println("\t1Percentage:"+percentage);
	}
}
		
		
	
	



