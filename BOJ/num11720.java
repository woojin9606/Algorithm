package algo;

import java.util.Scanner;

public class num11720 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		String a=sc.next();
		int sum=0;
		for (int i = 0; i < n; i++) {
			arr[i]=Character.getNumericValue(a.charAt(i));
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
