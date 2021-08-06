package algo;

import java.util.Scanner;

public class num1453 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		int[] com=new int[101];
		for (int i = 0; i < n; i++) {
			int a=sc.nextInt();
			if(com[a]==0) {
				com[a]++;
			}else {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
