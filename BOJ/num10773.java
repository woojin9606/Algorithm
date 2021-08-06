package algo;

import java.util.Scanner;

public class num10773 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==0) {
				arr[i-1]=0;
				n=n-2;
				i=i-2;
			}
		}
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);

	}

}
