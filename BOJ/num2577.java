package algo;

import java.util.Scanner;

public class num2577 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		int[][] map=new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				map[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < 25; i++) {
			int a=sc.nextInt();
			for (int k = 0; k < 5; k++) {
				for (int j = 0; j < 5; j++) {
					if(map[k][j]==a) {
						map[k][j]=0;
						cnt++;
					}
				}
			}

		}

	}



	
	

}
