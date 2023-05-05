package Programs;

import java.util.Scanner;

public class PaliendramNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		
		int t = n;
		int rev = 0;
		while(n!= 0)
		{
			rev = rev*10+(n%10);
			n=n/10;
		}
			if(rev==t)
			{
				System.out.println(t+ " palindram number");
			}
			else
			{
				System.out.println(t+ " not palindram number");
			}
			

	}

	}

