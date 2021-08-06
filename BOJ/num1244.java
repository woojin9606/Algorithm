package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class num1244 {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		int[] arr=new int[n];
		StringTokenizer st=new StringTokenizer(in.readLine()," ");
		for (int i = 0; i < n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int a=Integer.parseInt(in.readLine());
		for (int i = 0; i < a; i++) {
			st=new StringTokenizer(in.readLine()," ");
			int sex=Integer.parseInt(st.nextToken());
			int num=Integer.parseInt(st.nextToken());
			int l=num;
			if(sex==1) {
				while(num<=n) {
						if(arr[num-1]==0) {
							arr[num-1]=1;
						}else {
							arr[num-1]=0;
						}
						num+=l;
				}
			}else {
				int k=0;
				while(num-k>0&&num+k<=n) {
						if(arr[num-1-k]==arr[num-1+k]) {
							if(arr[num-1-k]==0) {
								arr[num-1-k]=1;
								arr[num-1+k]=1;
							}else {
								arr[num-1-k]=0;
								arr[num-1+k]=0;
							}
							k++;
						}else {
							break;
						}
					
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			if(i%20==19) {
				System.out.println();
			}
		}

	}

}
