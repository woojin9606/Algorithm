package algo;

import java.util.Scanner;

public class num5585 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a=1000-n;
		int result=0;
		result+=a/500;
		a%=500;
		result+=a/100;
		a%=100;
		result+=a/50;
		a%=50;
		result+=a/10;
		a%=10;
		result+=a/5;
		a%=5;
		result+=a/1;
		System.out.println(result);

	}

}
