package Conditinal_statement;

import java.util.Scanner;

public class Switch_statement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int button=sc.nextInt();
		/*if(button==1)
		{
			System.out.println("HELLO");
		}
		else if(button==2)
		{
			System.out.println("Namaste");
		}
		else if(button==3)
		{
			System.out.println(" Vaddakum");
		}
		else
		{
			System.out.println("invlid button");
		}*/
		
		switch(button) {
		case 1:System.out.println("HELLO");
		break;
		case 2:System.out.println("Namaste");
		break;
		case 3:System.out.println(" Vaddakum");
		break;
		default :System.out.println("invalid button");
		
	}
	}
}
