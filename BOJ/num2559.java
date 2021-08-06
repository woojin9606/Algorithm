package algo;

import java.util.Scanner;

public class num2559 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int a=sc.nextInt();
		int max=-1000000000;
		int sum=0;
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i <= n-a; i++) {
			sum=0;
			for (int j = i; j < i+a; j++) {
				sum+=arr[j];
			}
			if(max<sum) {
				max=sum;
			}
		}
		System.out.println(max);
	}

}
