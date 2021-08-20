package algo;

import java.util.Scanner;

public class num2638 {
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
		//값 삽입
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				board[i][j]=sc.nextInt();
			}
		}
		int cnt=0;
		//모든 값이 0이 될 때 까지 반복
		
		while(true) {
			if(allMelt()) {
				break;
			}

			dfs(0,0);

			cnt++;			
			init();		
		}
		System.out.println(cnt);
		
		
	}
	private static void dfs(int x, int y) {
		check[x][y]=true;
		for (int i = 0; i < dx.length; i++) {
			int newx=x+dx[i];
			int newy=y+dy[i];
			if(isNotWall(newx,newy)&&!check[newx][newy]&&board[newx][newy]==0) {
				dfs(newx,newy);
			}else if(isNotWall(newx,newy)&&!check[newx][newy]&&board[newx][newy]==1) {
				check[newx][newy]=true;
			}else if(isNotWall(newx,newy)&&check[newx][newy]&&board[newx][newy]==1) {
				board[newx][newy]=0;
			}
		}
		
	}
	//범위 확인
	private static boolean isNotWall(int x, int y) {
		if(x>=0&&y>=0&&x<N&&y<M) {
			return true;
		}
		return false;
	}
	//방문체크 초기화
	private static void init() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				check[i][j]=false;
			}
		}
	}
	//다 녹았는지 확인
	private static boolean allMelt() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(board[i][j]==1) {
					return false;
				}
			}
		}
		return true;
	}

}
