package Conditinal_statement;

import java.util.Scanner;

public class IFelse_equalgraterlesser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("please enter a");
		int b=sc.nextInt();
		System.out.println("please enter B");
		if (a==b){
			System.out.println("you Enterd a equal number");
		}
		else if(a>b){
				System.out.println(" A is grater than B ");
		}
			else{
				System.out.println(" A is lesser than b");
		}
		
	}

}
