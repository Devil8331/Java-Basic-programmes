package Functions_Methods;

import java.util.Scanner;

public class Multification_function {
public static int  calculateProduct (int a, int b)
{
	return a*b;
}
	public static void main(String[] args) {
		System.out.println("please enter the number for a & b ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(" product of 2 numbers  is : "+calculateProduct (a,b) );

	}

}
