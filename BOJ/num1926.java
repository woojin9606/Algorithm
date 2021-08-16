package algo;

import java.util.Scanner;

public class num1926 {
	static int N;
	static int M;
	static int[][] board;
	static boolean[][] check;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	static int cnt2;
	static int max=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		board=new int[N][M];
		check=new boolean[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				board[i][j]=sc.nextInt();
			}
		}
		int cnt=0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(!check[i][j]&&board[i][j]==1) {
					cnt2=0;
					dfs(i,j);
					cnt++;
					System.out.println(cnt2);
					if(max<cnt2) {
						max=cnt2;
					}
				}
			}
		}
		
		System.out.println(cnt);
		System.out.println(max);

	}
	private static void dfs(int x, int y) {
		check[x][y]=true;
		for (int i = 0; i < dx.length ; i++) {
			int newx=x+dx[i];
			int newy=y+dy[i];
			if(isNotWall(newx,newy)&&!check[newx][newy]&&board[newx][newy]==1) {
				dfs(newx,newy);
				
			}
			
		}
		cnt2++;
		
	}
	private static boolean isNotWall(int x, int y) {
		if(x>=0&&x<N&&y>=0&&y<M) {
			return true;
		}
		return false;
	}

}
