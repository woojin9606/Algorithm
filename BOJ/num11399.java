package algo;

import java.util.Arrays;
import java.util.Scanner;

public class num11399 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int[] a=new int[T];
		int sum=0;
		for (int tc = 0; tc < T; tc++) {
			a[tc]=sc.nextInt();
		}
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				sum+=a[j];
			}
		}
		System.out.println(sum);

	}

}
