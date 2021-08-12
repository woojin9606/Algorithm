package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class num2206 {
	static int N;
	static int M;
	static int[][][] board;

	static boolean[][][] check;

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(in.readLine()," ");
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		board=new int[N][M][2];
		check=new boolean[N][M][2];
		for (int i = 0; i < N; i++) {
			String a=in.readLine();
			for (int j = 0; j < M; j++) {
				board[i][j][0]=(int)(a.charAt(j)-48);
			}
		}
		
		
		
		
		
		System.out.println(bfs(0,0));
		
		
		
	}
	
	public static int bfs(int x,int y) {
		
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {0,0,0});
		check[0][0][0] = true;
		board[0][0][0]=1;
		int[] dx= {-1,1,0,0};
		int[] dy= {0,0,-1,1};
		while (!q.isEmpty()) {
			int temp[] = q.poll();
			for (int i = 0; i < dx.length; i++) {
				int newx=temp[0]+dx[i];
				int newy=temp[1]+dy[i];
				if(temp[2]==0) {
					if (isNotWall(newx,newy)&&!check[newx][newy][0] &&board[newx][newy][0] == 0) {
						q.add(new int[] {newx,newy,0});
						check[newx][newy][0] = true;
						board[newx][newy][0] = board[temp[0]][temp[1]][0]+1;
					}else if(isNotWall(newx,newy)&&!check[newx][newy][1] &&board[newx][newy][0] == 1) {
						q.add(new int[] {newx,newy,1});
						check[newx][newy][1] = true;

						board[newx][newy][1] = board[temp[0]][temp[1]][0]+1;
					}
				}else if(temp[2]==1) {
					if (isNotWall(newx,newy)&&!check[newx][newy][1] &&board[newx][newy][0] == 0) {
						q.add(new int[] {newx,newy,1});
						check[newx][newy][1] = true;
						board[newx][newy][1] = board[temp[0]][temp[1]][1]+1;
					}
				}
				
			}
		}

		
		
		
		if(board[N-1][M-1][0]==0&&board[N-1][M-1][1]==0) {
			return -1;
		}
		int a=0;
		if(board[N-1][M-1][0]==0) {
			return board[N-1][M-1][1];
		}else if(board[N-1][M-1][1]==0) {
			return board[N-1][M-1][0];
		}
		
		
		
		
		return board[N-1][M-1][1];
			
		
		
		
	}
	
	public static boolean isNotWall(int x, int y) {
		if (x >= 0 && x < N && y >= 0 && y < M) {
			return true;
		}
		return false;

	}

}
