package Programs;

import java.util.Scanner;

public class PrintReveseNto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value n: ");
		int n = sc.nextInt();
		
		for(int i=n;i>=0;i--)
		{
			System.out.println(i);
		}

	}

}
