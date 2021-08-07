package algo;

import java.util.Scanner;

public class num2667 {
	static int N;
	static int[][] board;
	static boolean[][] check;
	static int cnt;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		board=new int[N][N];
		check=new boolean[N][N];
		cnt=1;
		for (int i = 0; i < N; i++) {
			String a=sc.next();
			for (int j = 0; j < N; j++) {
				board[i][j]=(int)(a.charAt(j)-48);
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(board[i][j]==1&&!check[i][j]) {
					dfs(i,j);
					cnt++;
				}
			}
		}
		System.out.println(cnt-1);
		int[] s=new int[cnt];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 1; k <= cnt-1; k++) {
					if(board[i][j]==k) {
						s[k]++;
					}
				}
			}
		}
		
		for (int i = 1; i<=cnt-1; i++) {
			System.out.println(s[i]);
		}

	}
	public static void dfs(int x, int y) {
		check[x][y] = true;
		board[x][y] = cnt;

		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		for (int i = 0; i < dy.length; i++) {

			int newx = x + dx[i];
			int newy = y + dy[i];
			if (isNotWall(newx, newy) && !check[newx][newy] && board[newx][newy] == 1) {
				dfs(newx, newy);
			}
		}
	}

	public static boolean isNotWall(int x, int y) {

		if (x>=0&&x<N&&y>=0&&y<N) {
			return true;
		}
		return false;
	}

}
