package algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num7562 {
	static int N;

	static int[][] board;
	static boolean[][] check;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		for (int i = 0; i < tc; i++) {
			N=sc.nextInt();
			board=new int[N][N];
			check=new boolean[N][N];	
			bfs(sc.nextInt(),sc.nextInt());	
			System.out.println(board[sc.nextInt()][sc.nextInt()]);
		}
		

	}
	
	public static void bfs(int x,int y) {

		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});
		check[x][y] = true;
		int[] dx= {-2,-1,1,2,-2,-1,1,2};
		int[] dy= {-1,-2,-2,-1,1,2,2,1};
		while (!q.isEmpty()) {
			int temp[] = q.poll();
			for (int i = 0; i < dx.length; i++) {
				int newx=temp[0]+dx[i];
				int newy=temp[1]+dy[i];
				if (isNotWall(newx,newy)&&!check[newx][newy]) {
					q.add(new int[] {newx,newy});
					check[newx][newy] = true;
					board[newx][newy] = board[temp[0]][temp[1]]+1;
				}
			}
		}
	}
	
	public static boolean isNotWall(int x, int y) {
		if (x >= 0 && x < N && y >= 0 && y < N) {
			return true;
		}
		return false;

	}

}
