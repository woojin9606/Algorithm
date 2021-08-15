package algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class num2583 {
	static int N;
	static int M;
	static int K;
	static int cnt;
	static int[][] board;
	static boolean[][] check;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		K=sc.nextInt();
		board=new int[N][M];
		check=new boolean[N][M];
		ArrayList<Integer> arr=new ArrayList<>();
		for (int i = 0; i < K; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			for (int j = b; j < d; j++) {
				for (int k = a; k < c; k++) {
					board[j][k]=1;
				}
			}
		}
		int cnt2=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(!check[i][j]&&board[i][j]==0) {
					cnt=0;
					cnt2++;
					dfs(i,j);
					arr.add(cnt);
				}
			}
		}
		Collections.sort(arr);
		System.out.println(cnt2);
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}

	}
	private static void dfs(int x, int y) {
		check[x][y]=true;
		
		for (int i = 0; i < dx.length; i++) {
			int newx=x+dx[i];
			int newy=y+dy[i];
			if(isNotWall(newx,newy)&&!check[newx][newy]&&board[newx][newy]==0) {
				dfs(newx,newy);
			}
		}
		cnt++;
	}
	
	private static boolean isNotWall(int x, int y) {
		if(x>=0&&x<N&&y>=0&&y<M) {
			return true;
		}
		return false;
	}

}
