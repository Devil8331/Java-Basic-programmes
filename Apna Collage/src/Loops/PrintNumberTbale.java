package Loops;

import java.util.Scanner;

public class PrintNumberTbale {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of B");
		int n=sc.nextInt();
		for (int i=1;i<11;i++)
		{
			System.out.println(i*n);
		}
	}

}
