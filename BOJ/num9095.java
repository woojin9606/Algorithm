package algo;

import java.util.Scanner;

public class num9095 {
	static int[] board;
	static int N;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		
		board=new int[11];
		board[1]=1;
		board[2]=2;
		board[3]=4;
		for (int i = 0; i < tc; i++) {
			int cnt=4;
			N=sc.nextInt();
			if(N==1) {
				System.out.println(1);
			}else if(N==2) {
				System.out.println(2);
			}else if(N==3){
				System.out.println(4);
			}else {
				solution(cnt);
			}
		}
		

	}

	private static void solution(int cnt) {
		board[cnt]=board[cnt-1]+board[cnt-2]+board[cnt-3];
		if(cnt==N) {
			System.out.println(board[cnt]);
			return;
		}
		cnt++;
		solution(cnt);		
	}

}
