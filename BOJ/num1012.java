package algo;

import java.util.Scanner;

public class num1012 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		
		for (int o = 0; o < t; o++) {
			int cnt=0;
			int m=sc.nextInt();
			int n=sc.nextInt();
			int k=sc.nextInt();
			int[][] map=new int[n+2][m+2];
			for (int i = 0; i < k; i++) {
				int a=sc.nextInt()+1;
				int b=sc.nextInt()+1;
				map[b][a]=1;
			}
			
				
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					if(map[i][j]==1) {
						map[i][j]=0;
						int a=i;
						int b=j;
						check(a,b,map);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
		
		

	}

	private static void check(int a, int b, int[][] map) {
		while(true) {
			int check=0;
			
			if(map[a][b-1]==1) {
				map[a][b-1]=0;
				check++;
				check(a,b-1,map);
			}
			if(map[a][b+1]==1) {
				map[a][b+1]=0;
				check++;
				check(a,b+1,map);
			}
			if(map[a-1][b]==1) {
				map[a-1][b]=0;
				check++;
				check(a-1,b,map);
			}
			if(map[a+1][b]==1) {
				map[a+1][b]=0;
				check++;
				check(a+1,b,map);
			}
			
			if(check==0) {
				break;
			}
			
		}
		
	}

}
