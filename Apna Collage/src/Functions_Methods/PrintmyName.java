package Functions_Methods;

import java.util.Scanner;

			public class PrintmyName 
{
				public static void  printMyName(String name)
	{
					System.out.println(name);

					return ;
	}
				public static void main(String[] args) 
		{
					System.out.println("please  type your name");
					Scanner sc=new Scanner(System.in);
					String name=sc.next();
					System.out.println("  You typed your name : "+(name));
		}
}
