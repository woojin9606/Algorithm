package algo;

import java.util.Scanner;

public class num2606 {
	static int N;
	static int M;
	static int[][] board;
	static boolean[] check;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		board=new int[N+1][N+1];
		check=new boolean[N+1];
		for (int i = 0; i < M; i++) {
			board[sc.nextInt()][sc.nextInt()]=1;
		}
		bfs(1);
		
		int cnt=0;
		for (int i = 2; i < check.length; i++) {
			if(check[i]==true) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}
	private static void bfs(int i) {
		check[i]=true;
		for (int j = 1; j < board.length; j++) {
			if(!check[j]&&(board[i][j]==1||board[j][i]==1)) {
				bfs(j);
			}
		}
		
	}

}
