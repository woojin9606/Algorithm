package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

//회의실 배정
//시간초과
public class num1931 {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
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
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0];
				}else {
					return o1[1]-o2[1];
				}
			}
		});
		
		
		
		int cnt=1;
		int a=0;
		for (int i = 1; i < n; i++) {
			if(arr[a][1]<=arr[i][0]) {
				cnt++;
				a=i;
			}
		}
		System.out.println(cnt);
		

	}

}
