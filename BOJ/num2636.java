package algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num2636 {
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
			for (int j = 0; j < M; j++) {
				board[i][j]=sc.nextInt();
			}
		}
		int cnt=0;
		int b=0;
		while(true) {
			int a=bfs(0,0);
			if(a!=0) {
				b=a;
			}else if(a==0) {
				break;
			}
			
			cnt++;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					check[i][j]=false;
				}
			}
			
			
			
		}
		System.out.println(cnt+" "+b);
		

	}
	private static int bfs(int x, int y) {
		Queue<int []> q=new LinkedList<>();
		q.add(new int[] {x,y});
		check[x][y]=true;
		int cnt1=0;
		while(!q.isEmpty()) {
			int[] temp=q.poll();
			for (int i = 0; i < dx.length; i++) {
				int newx=temp[0]+dx[i];
				int newy=temp[1]+dy[i];
				if(isNotWall(newx,newy)&&!check[newx][newy]&&board[newx][newy]==0) {
					q.add(new int[] {newx,newy});
					check[newx][newy]=true;
				}else if(isNotWall(newx,newy)&&!check[newx][newy]&&board[newx][newy]==1) {
					board[newx][newy]=0;
					check[newx][newy]=true;
					cnt1++;
				}
			}
		}
		
		
		return cnt1;
	}
	
	private static boolean isNotWall(int x, int y) {
		if(x>=0&&x<N&&y>=0&&y<M) {
			return true;
		}
		return false;
	}
	
	
	
	

}
