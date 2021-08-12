package algo;

import java.util.Scanner;

public class num2468 {
	static int N;
	static int[][] board;
	static boolean[][] check;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		board=new int[N][N];
		check=new boolean[N][N];
		int max=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j]=sc.nextInt();
				if(board[i][j]>max) {
					max=board[i][j];
				}
			}
		}
		int max2=0;
		for (int i = 0; i < max; i++) {
			int cnt=0;
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if(board[j][k]>i&&!check[j][k]) {
						dfs(j,k,i);
						cnt++;
					}
				}
			}
			if(max2<cnt) {
				max2=cnt;
			}
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					check[j][k]=false;
				}
			}
		}
		System.out.println(max2);
		
		
	}
	
	private static void dfs(int x, int y, int z) {
		check[x][y]=true;
		
		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };

		for (int i = 0; i < dy.length; i++) {

			int newx = x + dx[i];
			int newy = y + dy[i];
			if (isNotWall(newx, newy) && !check[newx][newy] && board[newx][newy]>z) {
				dfs(newx, newy,z);
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
