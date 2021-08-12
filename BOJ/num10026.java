package algo;

import java.util.Scanner;

public class num10026 {
	static int N;
	static int[][] board;
	static boolean[][] check;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		board=new int[N][N];
		check=new boolean[N][N];
		//RGB값에 따른 board에 숫자 삽입
		for (int i = 0; i < N; i++) {
			String a=sc.next();
			for (int j = 0; j < N; j++) {
				if(a.charAt(j)=='R') {
					board[i][j]=1;
				}else if(a.charAt(j)=='G') {
					board[i][j]=2;
				}else {
					board[i][j]=3;
				}
			}
		}
		
		
		
		//적록색약이 아닌사람이 봤을 때
		int cnt=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(board[i][j]==1&&!check[i][j]) {
					dfs(i,j,1);
					cnt++;
				}else if(board[i][j]==2&&!check[i][j]) {
					dfs(i,j,2);
					cnt++;
				}else if(board[i][j]==3&&!check[i][j]){
					dfs(i,j,3);
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
		//check 초기화
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				check[i][j]=false;
			}
		}
		
		
		
		//적록색약이 봤을 때
		cnt=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if((board[i][j]==2||board[i][j]==1)&&!check[i][j]) {
					dfs(i,j,4);
					cnt++;
				}else if(board[i][j]==3&&!check[i][j]){
					dfs(i,j,3);
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
		
		

	}
	private static void dfs(int x, int y, int k) {
		check[x][y]=true;
		int[] dx= {-1,1,0,0};
		int[] dy= {0,0,-1,1};
		for (int i = 0; i < dy.length; i++) {
			int newx=x+dx[i];
			int newy=y+dy[i];
			if(k==4) {
				if(isNotWall(newx,newy)&&!check[newx][newy]&&(board[newx][newy]==1||board[newx][newy]==2)) {
					dfs(newx,newy,k);
				}
			}else {
				if(isNotWall(newx,newy)&&!check[newx][newy]&&board[newx][newy]==k) {
					dfs(newx,newy,k);
				}
			}
			
		}
		
	}
	
	private static boolean isNotWall(int x,int y) {
		if(x>=0&&x<N&&y>=0&&y<N) {
			return true;
		}
		
		return false;
	}

}
