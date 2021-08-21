package algo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class num15657 {
	static int N;
	static int M;
	static int[] board;
	static int[] board2;
	static boolean[] check;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		board=new int[N+1];
		board2=new int[M+1];
		check=new boolean[N+1];
		for(int i=1;i<=N;i++) {
			board[i]=sc.nextInt();
		}
		Arrays.sort(board);
		int cnt=0;

		dfs(0);
		bw.flush();
		bw.close();

	}
	private static void dfs(int cnt) throws IOException {
		if(cnt==M) {
			for (int i = 1; i <= M; i++) {
				bw.write(board2[i]+" ");
			}
			bw.newLine();
			return;
		}
		cnt++;
		for (int i = 1; i <= N; i++) {
			if(!check[i]&&board2[cnt-1]<=board[i]) {
				board2[cnt]=board[i];
				dfs(cnt);
			}
		}
		
	}

}