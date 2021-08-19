package algo;

import java.util.Scanner;

public class num14716 {
	static int n;
	static int m;
	static int[][] board;
	static boolean[][] check;
	static int[] dx= {-1,1,0,0,-1,-1,1,1};
	static int[] dy= {0,0,-1,1,-1,1,-1,1};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		m=sc.nextInt();
		board=new int[n][m];
		check=new boolean[n][m];
		int cnt=0;
		//값 삽입
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				board[i][j]=sc.nextInt();
			}
		}
		//dfs로 글자수 찾기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(!check[i][j]&&board[i][j]==1) {
					dfs(i,j);
					cnt++;
				}
			}
		}
		//글자 수 출력
		System.out.println(cnt);
		

	}
	private static void dfs(int x, int y) {
		check[x][y]=true;
		for (int i = 0; i < dx.length; i++) {
			int newx=x+dx[i];
			int newy=y+dy[i];
			if(isNotWall(newx,newy)&&!check[newx][newy]&&board[newx][newy]==1) {
				dfs(newx,newy);
			}
		}
		
	}
	private static boolean isNotWall(int x, int y) {
		if(x>=0&&x<n&&y>=0&&y<m) {
			return true;
		}
		return false;
	}
}
