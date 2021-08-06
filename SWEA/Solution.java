package algo;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int cnt=0;
			String a=sc.next();
			int[] arr=new int[a.length()];
			int[] arr2=new int[a.length()];
			for (int i = 0; i < a.length(); i++) {
				arr[i]=(int)(a.charAt(i)-48);
			}
			
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]!=arr2[i]) {
					for (int j = i; j < arr.length; j++) {
						if(arr[i]==1) {
							arr2[j]=1;
						}else {
							arr2[j]=0;
						}
					}
					cnt++;
				}
			}

			System.out.println("#"+test_case+" "+cnt);
		}

	}

}
