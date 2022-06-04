package Conditinal_statement;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of 1st Number");
		float a=sc.nextFloat();
		System.out.println("enter the value of 2nd Number");
		float b=sc.nextFloat();
		System.out.println("Select Opration");
		System.out.println("Addition-a:Subtraction-s:multification-m:Division-d");
		char ch=sc.next().charAt(0);
		switch(ch) 
		{
		case 'a' :
			System.out.println("sum of the Given two numbers : "+(a+b));
			break;
		case 's' :
			System.out.println(" Subtraction of given two numbers : "+(a-b));
			break;
		case 'd' :
			System.out.println(" Division of given two Numbers : "+(a/b));
			break;
		case'm' :
			System.out.println("Multification of given two Numbers "+(a*b));
			break;
			default :
				System.out.println("Invalid Calculation ");
	
		}
	}

}
