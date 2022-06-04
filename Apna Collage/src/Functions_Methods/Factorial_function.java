package Functions_Methods;

import java.util.Scanner;

public class Factorial_function {
public static void  FactorialNumber(int n)
{
	if (n<0)
	{
		System.out.println("Invlid Number");
		return;
	}
	int factorial=1;
	for(int i=n;i>=1;i--)
	{
		factorial=factorial*i;		
	}
	System.out.println(factorial);
}
	public static void main(String[] args) {
		System.out.println("please enter the number for print Factorial of number : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		FactorialNumber(n);
	}

}
