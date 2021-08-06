package algo;

import java.util.Scanner;

public class num1010 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[][] data=new int[30][30];
		for (int i = 0; i < n; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(comb(b,a,data));
		}
		
	}
	private static int comb(int n,int r,int[][] data) {
		if(r==0|| n==r) {
			return 1;
		}
		if(data[n][r]==0) {
			data[n][r]=comb(n-1,r-1,data)+comb(n-1,r,data);
		}
		
		return data[n][r];
	}

}
