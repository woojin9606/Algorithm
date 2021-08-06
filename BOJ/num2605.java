package algo;

import java.util.Scanner;

public class num2605 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] tmp=new int[n];
		for (int i = 1; i <= arr.length; i++) {
			int a=sc.nextInt();
			if(arr[a]==0) {
				arr[a]=i;
			}else {
				for (int j = 0; j < tmp.length; j++) {
					if(j<a) {
						tmp[j]=arr[j];
					}else if(j==a) {
						tmp[j]=i;
					}else {
						tmp[j]=arr[j-1];
					}
				}
				for (int j = 0; j < tmp.length; j++) {
					arr[j]=tmp[j];
				}
			}
		}
		for (int i = n-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
