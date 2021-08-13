package algo;

import java.util.Scanner;

public class num1780 {
	static int paper1=0;
	static int paper2=0;
	static int paper3=0;
	static int[][] board;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		board=new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j]=sc.nextInt();
			}
		}
		
		paper(0,0,n);
		System.out.println(paper1);
		System.out.println(paper2);
		System.out.println(paper3);
	}

	private static void paper(int i, int j, int n) {
		
		if(check(i,j,n)) {
			if(board[i][j]==-1) {
				paper1++;
			}else if(board[i][j]==0) {
				paper2++;
			}else {
				paper3++;
			}
			return;
		}
		
		int newn=n/3;
		paper(i,j,newn);
		paper(i+newn,j,newn);
		paper(i+newn*2,j,newn);
		paper(i,j+newn,newn);
		paper(i+newn,j+newn,newn);
		paper(i+newn*2,j+newn,newn);
		paper(i,j+newn*2,newn);
		paper(i+newn,j+newn*2,newn);
		paper(i+newn*2,j+newn*2,newn);
		
		
	}
	
	private static boolean check(int i,int j,int n) {
		int color=board[i][j];
		
		for (int a=i; a<i+n; a++) {
			for (int b=j; b<j+n; b++) {
				if(board[a][b]!=color) {
					return false;
				}
			}
		}
		return true;
	}

}