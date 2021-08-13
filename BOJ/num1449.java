package algo;

import java.util.Arrays;
import java.util.Scanner;

public class num1449 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] board=new int[n];
		for (int i = 0; i < n; i++) {
			board[i]=sc.nextInt();
		}
		Arrays.sort(board);
		int cnt=1;
		int a=board[0]+m;
		for (int i = 1; i < n; i++) {
			if(board[i]>=a) {
				cnt++;
				a=board[i]+m;
			}
		}
		System.out.println(cnt);
	}

}
