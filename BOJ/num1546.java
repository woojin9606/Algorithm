package algo;

import java.util.Scanner;

public class num1546 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		double max=0;
		double sum=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			double a=arr[i]/max*100;
			sum+=a;
		}
		System.out.println(sum/n);
		
	}

}
