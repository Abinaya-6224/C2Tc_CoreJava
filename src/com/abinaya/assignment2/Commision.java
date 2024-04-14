package com.abinaya.assignment2;
import java.util.Scanner;

public class Commision {
	Scanner s=new Scanner(System.in);
	String Name,Address;
	long Phone,Sales_amount;
	float c;
	void getEmployeeDetails()
	{
		System.out.println("Enter your Name:");
		Name=s.next();
		System.out.println("Enter your Address:");
		Address=s.next();
		System.out.println("Enter your Phone:");
		Phone=s.nextLong();
		System.out.println("Enter your SalesAmount:");
		Sales_amount=s.nextLong();
		
	}
	float calculateCommision()
	{
		
	
		if(Sales_amount>=100000)
		{
			c=0.1f*Sales_amount;
			return c;
		}
		else if(50000<=Sales_amount&&Sales_amount<100000)
		{
			c=0.05f*Sales_amount;
			return c;
		}
		else if(30000<=Sales_amount&&Sales_amount<50000)
		{
			c=0.03f*Sales_amount;
			return c;
		}
		else 
		{
			return Sales_amount;
		}
			
		
	}
	public static void main(String[] args)
	{
		float c;
		Commision c1=new Commision();
		c1.getEmployeeDetails();
		c=c1.calculateCommision();
		System.out.println("Commision="+c );
	}
	

}
