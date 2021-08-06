package algo;

import java.util.Scanner;

public class num1075 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=sc.nextInt();
		int a=n/100;
		int b=a*100;
		int c=b%f;
		if(c==0) {
			c=f;
		}
		int d=f-c;

		int e=d/10;

		int g=d%10;
		if(g==f) {
			g=0;
		}
		
		
		System.out.println(e+""+g);
	}

}
