package algo;

import java.util.Arrays;
import java.util.Scanner;

public class num2309 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int[] arr=new int[9];
		int[] arr2=new int[7];

		for (int i = 0; i < 9; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = i+1; j <= 4; j++) {
				for (int k = j+1; k < 5; k++) {
					for (int k2 = k+1; k2 < 6; k2++) {
						for (int l = k2+1; l < 7; l++) {
							for (int l2 = l+1; l2 < 8; l2++) {
								for (int o = l2+1; o < 9; o++) {
									if(arr[i]+arr[j]+arr[k]+arr[k2]+arr[l]+arr[l2]+arr[o]==100) {
										arr2[0]=arr[i];
										arr2[1]=arr[j];
										arr2[2]=arr[k];
										arr2[3]=arr[k2];
										arr2[4]=arr[l];
										arr2[5]=arr[l2];
										arr2[6]=arr[o];
										Arrays.sort(arr2);
										break;
									}
								}
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

}
