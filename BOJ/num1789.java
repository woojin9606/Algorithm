package algo;

import java.util.Scanner;

public class num1789 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int i=1;
		while(true) {
			sum=sum+i;
			if(sum>n) {
				break;
			}
			i++;
		}
		System.out.println(i);

	}

}
