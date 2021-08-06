package algo;

import java.util.Scanner;

public class num2847 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int cnt=0;
		for (int i = arr.length-1; i > 0 ; i--) {
			if(arr[i]<=arr[i-1]) {
				while(arr[i]<=arr[i-1]) {
					cnt++;
					arr[i-1]--;
				}
			}
		}
		System.out.println(cnt);

	}

}
