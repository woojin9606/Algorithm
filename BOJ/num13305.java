package algo;

import java.util.Scanner;

public class num13305 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n-1];
		long[] b=new long[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i]=sc.nextInt();
		}
		long sum=0;
		for (int i = 0; i < n-1; i++) {
			if(b[i]<b[i+1]) {
				b[i+1]=b[i];
			}
			sum+=b[i]*a[i];
		}
		System.out.println(sum);
	}

}
