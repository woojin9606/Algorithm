package algo;

import java.util.Scanner;

public class num15650 {
	static int N;
	static int M;
	static int[] board;
	static int[] board2;
	static boolean[] check;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		board=new int[N+1];
		board2=new int[M+1];
		check=new boolean[N+1];
		for(int i=1;i<=N;i++) {
			board[i]=i;
		}
		int cnt=0;

		dfs(0);


	}
	private static void dfs(int cnt) {
		if(cnt==M) {
			for (int i = 1; i <= M; i++) {
				System.out.print(board2[i]+" ");
			}
			System.out.println();
			return;
		}
		cnt++;
		for (int i = 1; i <= N; i++) {
			if(!check[i]&&board2[cnt-1]<i) {
				check[i]=true;
				board2[cnt]=i;
				dfs(cnt);
				check[i]=false;
			}
		}
		
	}

}