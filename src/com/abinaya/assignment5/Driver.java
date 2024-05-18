package com.abinaya.assignment5;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) 
	{
		int n=10;
		int a[]; //declaration
		a= new int[n];//Instantiation

		ArrayOperation.printArray(a); //Displaying the array
		
		
		//assigning the values of A 
		for(int i=0;i<a.length;i++)
		{
			a[i]=5*i;
		}
		ArrayOperation.printArray(a); //Displaying the array
		
		int b[]= {10,20,30,40,50}; //Initialization
		ArrayOperation.printArray(b); //Displaying the array
		System.out.println(ArrayOperation.getOddCount(b));
		System.out.println(ArrayOperation.getEvenCount(b));
	}
}


