package algo;

import java.util.Scanner;

public class num14659 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int max=0;
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < n-1; i++) {
			int cnt=0;
			for (int j = i+1; j < n; j++) {
				if(arr[i]>arr[j]) {
					cnt++;
				}else {
					break;
				}
			}
			if(max<cnt) {
				max=cnt;
			}
			
		}
		System.out.println(max);

	}

}
