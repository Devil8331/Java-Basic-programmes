package Functions_Methods;

import java.util.Scanner;

public class Sum_function {
public static int CalculateSum(int a,int b) {
	int sum=a+b;
	return sum;
}
	public static void main(String[] args) {
		System.out.println("please enter the number for a & b ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=CalculateSum(a,b);
		System.out.println(" sum of given two numbers are  : "+sum);
	}

}
