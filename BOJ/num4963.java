package algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num4963 {
	static int N;
	static int M;
	static int[][] board;
	static boolean[][] check;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			N=sc.nextInt();
			M=sc.nextInt();
			if(N==0&&M==0) {
				break;
			}
			board=new int[M][N];
			check=new boolean[M][N];
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					board[i][j]=sc.nextInt();
				}
			}
			int cnt=0;
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if(board[i][j]==1&&!check[i][j]) {
						bfs(i,j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}

	}
	private static void bfs(int i, int j) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {i,j});
		check[i][j]=true;
		int[] dx= {-1,1,0,0,-1,-1,1,1};
		int[] dy= {0,0,-1,1,-1,1,-1,1};
		
		while(!q.isEmpty()) {
			int[] temp=q.poll();

			for (int k = 0; k < dy.length; k++) {
				int newx=temp[0]+dx[k];
				int newy=temp[1]+dy[k];
				if(isNotWall(newx,newy)&&!check[newx][newy]&&board[newx][newy]==1) {
					q.add(new int[] {newx,newy});
					check[newx][newy]=true;
				}
			}
		}
		
	}
	
	private static boolean isNotWall(int x,int y) {
		if(x>=0&&x<M&&y>=0&&y<N) {
			return true;
		}
		
		return false;
	}

}
