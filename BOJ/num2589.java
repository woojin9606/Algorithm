package algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num2589 {
	static int N;
	static int M;
	static int[][] board;
	static int[][] boardtmp;
	static boolean[][] check;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		board=new int[N][M];
		boardtmp=new int[N][M];
		check=new boolean[N][M];
		for (int i = 0; i < N; i++) {
			String a=sc.next();
			for (int j = 0; j < M; j++) {
				if(a.charAt(j)=='W') {
					board[i][j]=0;
					boardtmp[i][j]=0;
				}else {
					board[i][j]=1;
					boardtmp[i][j]=1;
				}
			}
		}
		
		
		int max=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(board[i][j]==1) {
					int a=bfs(i,j);
					if(max<a) {
						max=a;
					}
				}
			}
		}
		
		
		System.out.println(max);
		
		

	}
	
	public static int bfs(int x,int y) {

		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});
		check[x][y] = true;
		int[] dx= {-1,1,0,0};
		int[] dy= {0,0,-1,1};
		while (!q.isEmpty()) {
			int temp[] = q.poll();
			for (int i = 0; i < dx.length; i++) {
				int newx=temp[0]+dx[i];
				int newy=temp[1]+dy[i];
				if (isNotWall(newx,newy)&&!check[newx][newy] &&board[newx][newy] == 1) {
					q.add(new int[] {newx,newy});
					check[newx][newy] = true;
					board[newx][newy] += board[temp[0]][temp[1]];
				}
			}
		}
		
			
		
		int max=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				check[i][j]=false;
				if(max<board[i][j]) {
					max=board[i][j];
				}
				board[i][j]=boardtmp[i][j];
			}
		}
		
		
		return max-1;
		
		
		
	}
	
	public static boolean isNotWall(int x, int y) {
		if (x >= 0 && x < N && y >= 0 && y < M) {
			return true;
		}
		return false;

	}

}
