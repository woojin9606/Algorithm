package algo;

import java.util.Scanner;

public class num2573 {
	static int N;
	static int M;
	static int[][] board;
	static boolean[][] check;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		board=new int[N][M];
		check=new boolean[N][M];
		
		
		int max=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				board[i][j]=sc.nextInt();
			}
		}
		int cnt=0;
		while(true) {
			int cnt1=0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if(board[i][j]>0) {
						check[i][j]=true;
						for (int k = 0; k < dx.length; k++) {
							if(!check[i+dx[k]][j+dy[k]]&&board[i+dx[k]][j+dy[k]]==0&&board[i][j]>0) {
								board[i][j]--;
							}
						}
						
					}
				}
			}
			
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					check[i][j]=false;
				}
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {			
					if(board[i][j]>0&&!check[i][j]) {
						dfs(i,j);
						cnt1++;
					}
				}
			}
			
			cnt++;
			
			if(cnt1>1) {
				break;
			}
			
			
			
			int sum=0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					sum+=board[i][j];
					check[i][j]=false;
				}
			}
			
			if(sum==0) {
				cnt=0;
				break;
			}
		}
		
		
		
		
		
		System.out.println(cnt);

	}
	private static void dfs(int x, int y) {
		check[x][y]=true;

		for (int i = 0; i < dy.length; i++) {
			int newx=x+dx[i];
			int newy=y+dy[i];
			if(isNotWall(newx,newy)&&!check[newx][newy]&&board[newx][newy]>0) {
				dfs(newx,newy);
			}
		}
	}
	
	private static boolean isNotWall(int x,int y) {
		if(x>=0&&x<N&&y>=0&&y<M) {
			return true;
		}
		
		return false;
	}

}
