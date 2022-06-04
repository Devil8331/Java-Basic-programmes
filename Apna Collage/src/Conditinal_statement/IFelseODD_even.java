package Conditinal_statement;

import java.util.Scanner;

public class IFelseODD_even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x % 2==0)
		{
			System.out.println("You enterd Even Number");
		}
		else
		{
			System.out.println("You enterd ODD number");
		}
	}

}
