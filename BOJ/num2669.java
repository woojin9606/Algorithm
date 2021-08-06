package algo;

import java.util.Scanner;

public class num2669 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] map=new int[101][101];
		int cnt=0;
		for (int i = 1; i <= 4; i++) {
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			
			for (int j = x1; j < x2; j++) {
				for (int j2 = y1; j2 < y2; j2++) {
					map[j][j2]=1;
				}
			}
		}
		
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				if(map[i][j]==1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);

	}

}
