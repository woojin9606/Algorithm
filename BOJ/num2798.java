package algo;

import java.util.Arrays;
import java.util.Scanner;

public class num2798 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr=new int[n];
		int mid=100000;
		int tmp=0;
		int tmp2=0;
		int tmp3=0;
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < n-2; i++) {
			for (int j = i+1; j <= n-1; j++) {
				for (int k = j+1; k < n; k++) {
					int sum=arr[i]+arr[j]+arr[k];
					if(mid>m-sum&&sum<=m) {
						mid=Math.abs(m-sum);
						tmp=i;
						tmp2=j;
						tmp3=k;
					}
				}
			}
		}
		int sum=arr[tmp]+arr[tmp2]+arr[tmp3];
		System.out.println(sum);
	}

}
