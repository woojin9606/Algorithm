package algo;

import java.util.Scanner;

public class num11659 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] map=new int[n+1];
		int[] sum=new int[n+1];
		for (int i = 1; i <= n; i++) {
			map[i]=sc.nextInt();
			sum[i]=sum[i-1]+map[i];

		}
		
		for (int i = 0; i < m; i++) {

			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(sum[b]-sum[a-1]);

		}

	}

}
