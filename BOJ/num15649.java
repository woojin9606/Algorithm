package algo;

import java.util.Scanner;

public class num15649 {
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
		board2=new int[M];
		check=new boolean[N+1];
		for(int i=1;i<=N;i++) {
			board[i]=i;
		}
		int cnt=0;
		for (int i = 1; i <= N; i++) {
			check[i]=true;
			dfs(i,cnt);
			check[i]=false;
		}

	}
	private static void dfs(int x,int cnt) {
		board[cnt]=x;
		cnt++;
		if(cnt==M) {
			for (int i = 0; i < M; i++) {
				System.out.print(board[i]+" ");
			}
			System.out.println();
			return;
		}
		for (int i = 1; i <= N; i++) {
			if(!check[i]) {
				check[i]=true;
				dfs(i,cnt);
				check[i]=false;
			}
		}
		
	}

}
