package algo;

import java.util.Scanner;

public class num12927 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int[] board=new int[a.length()+1];
		for (int i = 1; i < board.length; i++) {
			if(a.charAt(i-1)=='Y') {
				board[i]=1;
			}else {
				board[i]=0;
			}
		}
		
		int cnt=0;
		for (int i = 1; i < board.length; i++) {
			if(board[i]==1) {
				for (int j = i; j < board.length; j+=i) {
					if(board[j]==0){
						board[j]=1;
					}else {
						board[j]=0;
					}
				}
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
