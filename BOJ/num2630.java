package algo;

import java.util.Scanner;

public class num2630 {
	static int white=0;
	static int black=0;
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
		System.out.println(white);
		System.out.println(black);

	}

	private static void paper(int i, int j, int n) {
		
		if(check(i,j,n)) {
			if(board[i][j]==0) {
				white++;
			}else {
				black++;
			}
			return;
		}
		
		int newn=n/2;
		paper(i,j,newn);
		paper(i+newn,j,newn);
		paper(i,j+newn,newn);
		paper(i+newn,j+newn,newn);
		
		
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
