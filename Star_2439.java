package stepbystep;

import java.util.Scanner;

public class Star_2439 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for (int i = 0; i < N; i++)
		{				
			for (int j = N; j > i+1; j--)
			{
				System.out.print(" ");
			}
			for (int k = 0; k < i+1; k++)
			{
				System.out.print("*");
			}
			
			System.out.print("\n");	
		}
		
	}
	
}