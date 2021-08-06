package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class num1946 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(in.readLine());
		for (int o = 0; o < t; o++) {
			int n=Integer.parseInt(in.readLine());
			int[][] arr=new int[n][2];
			StringTokenizer st;
			for (int i = 0; i < n; i++) {
				st=new StringTokenizer(in.readLine()," ");
				arr[i][0]=Integer.parseInt(st.nextToken());
				arr[i][1]=Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr,new Comparator<int[]>() {
				
				public int compare(int[] o1,int[] o2) {
					if(o1[0]==o2[0]) {
						return o1[1]-o2[1];
					}else {
						return o1[0]-o2[0];
					}
				}
			});
			
			int a=0;
			int cnt=1;
			for (int i = 1; i < n; i++) {
				if(arr[i][1]<=arr[a][1]) {
					cnt++;
					a=i;
				}
			}
			System.out.println(cnt);
		}
		
	}

}
