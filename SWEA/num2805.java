package algo;

import java.util.Scanner;

public class num2805 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int sum=0;
			int N=sc.nextInt();
			int[][] map=new int[N][N];
			for (int i = 0; i < N; i++) {
				String a=sc.next();
				for (int j = 0; j < N; j++) {
					map[i][j]=Character.getNumericValue(a.charAt(j));
				}
			}
			
			for (int i = 0; i < N; i++) {
				if(i<=N/2) {
					for (int j = 0; j <= i*2; j++) {
						sum+=map[i][N/2-i+j];
					}
				}
				else if(i>N/2) {
					
						for (int a = 0; a <= (N-i-1)*2; a++) {
							sum+=map[i][N/2-(N-i-1)+a];
							//System.out.println(sum+" "+i+" "+(N/2-k+a)+" "+k);
						}
					
				}
			}
			System.out.println("#"+test_case+" "+sum);
			
		}

	}

}
