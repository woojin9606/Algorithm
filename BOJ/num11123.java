package algo;

import java.util.Scanner;

public class num11123 {
	static int n;
	static int m;
	static char[][] board;
	static boolean[][] check;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i = 0; i < t; i++) {
			n=sc.nextInt();
			m=sc.nextInt();
			board=new char[n][m];
			check=new boolean[n][m];
			int cnt=0;
			//값 삽입
			for (int j = 0; j < n; j++) {
				String a=sc.next();
				for (int k = 0; k < m; k++) {
					board[j][k]=a.charAt(k);
				}
			}
			//dfs로 양무리 찾기
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if(board[j][k]=='#'&&!check[j][k]) {
						dfs(j,k);
						cnt++;
					}
				}
			}
			//양 무리 출력
			System.out.println(cnt);
		}

	}
	private static void dfs(int x, int y) {
		check[x][y]=true;
		for (int i = 0; i < dx.length; i++) {
			int newx=x+dx[i];
			int newy=y+dy[i];
			if(isNotWall(newx,newy)&&!check[newx][newy]&&board[newx][newy]=='#') {
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
