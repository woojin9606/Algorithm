package algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num1697 {
	static int N;
	static int[] board;
	static boolean[] check;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		board=new int[200000];
		check=new boolean[200000];
		int x=sc.nextInt();
		int y=sc.nextInt();
		bfs(x,y);
		System.out.println(board[y]);
		
		
		
				

	}
	public static void bfs(int x,int y) {
		Queue<Integer> q = new LinkedList<>();
		q.add(x);
		check[x]=true;
		while (!q.isEmpty()) {
			int temp = q.poll();
			int[] dx= {2,1,-1};
			int newx=-1;
			if(newx==y) {
				return;
			}
			for (int i = 0; i < dx.length; i++) {
				
				if(dx[i]==2) {
					newx=temp*2;
				}else {
					newx=temp+dx[i];
				}
				
				if(isNotWall(newx)&&!check[newx]) {		
					q.add(newx);
					check[newx]=true;
					board[newx]=board[temp]+1;
				}
			}
					
					
			}
			
		}
	
	
	public static boolean isNotWall(int x) {
		if (x >= 0 && x < 200000) {
			return true;
		}
		return false;

	}
}
