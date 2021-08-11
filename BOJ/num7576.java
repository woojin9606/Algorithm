package algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num7576 {
	static int N;
	static int M;
	static int[][] board;
	static boolean[][] check;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		board=new int[M][N];
		check=new boolean[M][N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j]=sc.nextInt();
			}
			
		}
		
		
		
		System.out.println(bfs());
		
		
		
	}

	public static int bfs() {
		
		Queue<int[]> q = new LinkedList<>();
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if(board[i][j]==1) {
					q.add(new int[] {i,j});
					check[i][j] = true;
				}
			}
		}
		
		
		int[] dx= {-1,1,0,0};
		int[] dy= {0,0,-1,1};
		while (!q.isEmpty()) {
			int temp[] = q.poll();
			for (int i = 0; i < dx.length; i++) {
				int newx=temp[0]+dx[i];
				int newy=temp[1]+dy[i];
				if (isNotWall(newx,newy)&&!check[newx][newy] &&board[newx][newy] == 0) {
					q.add(new int[] {newx,newy});
					check[newx][newy] = true;
					board[newx][newy] = board[temp[0]][temp[1]]+1;
				}
			}
		}
		int max=0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if(board[i][j]==0) {
					return -1;
				}
				if(board[i][j]>max) {
					max=board[i][j];
				}
			}
		}
		
		return max-1;
		
		
		
	}
	
	public static boolean isNotWall(int x, int y) {
		if (x >= 0 && x < M && y >= 0 && y < N) {
			return true;
		}
		return false;
	}
	
}
