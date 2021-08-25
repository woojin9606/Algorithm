package algo;

import java.util.Scanner;

public class num2748 {
	static long[] board;
	static int N;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		board=new long[91];
		board[0]=0;
		board[1]=1;
		int cnt=2;
		if(N==0) {
			System.out.println(0);
		}else if(N==1) {
			System.out.println(1);
		}else {
			fibo(cnt);
		}
		

	}

	private static void fibo(int cnt) {
		board[cnt]=board[cnt-1]+board[cnt-2];
		if(cnt==N) {
			System.out.println(board[cnt]);
			return;
		}
		cnt++;
		fibo(cnt);
		
	}

}