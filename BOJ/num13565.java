package algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num13565 {
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
		
		
		for (int i = 0; i < N; i++) {
			String a=sc.next();
			for (int j = 0; j < M; j++) {
				board[i][j]=(int)(a.charAt(j)-48);
			}
		}
		
		
			for (int j = 0; j < M; j++) {
				if(board[0][j]==0) {
					bfs(0,j);
				}
			}
		
			int a=0;
			for (int j = 0; j < M; j++) {
				if(board[N-1][j]==2) {
					a++;
				}
			}
			if(a==0) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		
		
		

	}
	
	private static void bfs(int x, int y) {
		Queue<int[]> q=new LinkedList<>();
		q.add(new int[] {x,y});
		check[x][y]=true;
		board[x][y]=2;
		while(!q.isEmpty()) {
			int[] temp=q.poll();
			for (int i = 0; i < dx.length; i++) {
				int newx=temp[0]+dx[i];
				int newy=temp[1]+dy[i];
				if(isNotWall(newx,newy)&&!check[newx][newy]&&board[newx][newy]==0) {
					q.add(new int[] {newx,newy});
					check[newx][newy]=true;
					board[newx][newy]=2;
				}
			}
			
		}
	}

	private static boolean isNotWall(int x, int y) {
		if(x>=0&&x<N&&y>=0&&y<M) {
			return true;
		}
		return false;
	}

}
