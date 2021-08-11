package algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num7569 {
	static int N;
	static int M;
	static int O;
	static int[][][] board;
	static boolean[][][] check;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		O=sc.nextInt();
		board=new int[O][M][N];
		check=new boolean[O][M][N];
		for (int k = 0; k < O; k++) {
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					board[k][i][j]=sc.nextInt();
				}
				
			}
		}
		
		
		
		
		System.out.println(bfs());
		
		
		
	}

	public static int bfs() {
		
		Queue<int[]> q = new LinkedList<>();
		for (int k = 0; k < O; k++) {
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if(board[k][i][j]==1) {
						q.add(new int[] {k,i,j});
						check[k][i][j] = true;
					}
				}
			}
		}
		
		
		int[] dx= {-1,1,0,0};
		int[] dy= {0,0,-1,1};
		int[] dz= {-1,1};
		while (!q.isEmpty()) {
			int temp[] = q.poll();
			for (int i = 0; i < dx.length; i++) {
				int newx=temp[1]+dx[i];
				int newy=temp[2]+dy[i];
				if (isNotWall(temp[0],newx,newy)&&!check[temp[0]][newx][newy] &&board[temp[0]][newx][newy] == 0) {
					q.add(new int[] {temp[0],newx,newy});
					check[temp[0]][newx][newy] = true;
					board[temp[0]][newx][newy] = board[temp[0]][temp[1]][temp[2]]+1;
				}
			}
			for (int i = 0; i < dz.length; i++) {
				int newz=temp[0]+dz[i];
				if (isNotWall(newz,temp[1],temp[2])&&!check[newz][temp[1]][temp[2]] &&board[newz][temp[1]][temp[2]] == 0) {
					q.add(new int[] {newz,temp[1],temp[2]});
					check[newz][temp[1]][temp[2]] = true;
					board[newz][temp[1]][temp[2]] = board[temp[0]][temp[1]][temp[2]]+1;
				}
			}
			
		}
		
		
		
		
		int max=0;
		for (int k = 0; k < O; k++) {
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if(board[k][i][j]==0) {
						return -1;
					}
					if(board[k][i][j]>max) {
						max=board[k][i][j];
					}
				}
			}
		}
		
		return max-1;
		
		
		
	}
	
	public static boolean isNotWall(int z, int x, int y) {
		if (x >= 0 && x < M && y >= 0 && y < N&& z >= 0 && z < O) {
			return true;
		}
		return false;
	}
	
}
