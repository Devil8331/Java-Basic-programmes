package Pattern_question;

public class Solid_rombus {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {

			//spaces
		for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) 
			{

				System.out.print("*");
			}
			System.out.println();

		}
	}
}