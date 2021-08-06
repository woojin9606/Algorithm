package algo;

import java.util.Scanner;

public class num14696 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a=sc.nextInt();
			int[] ad=new int[4];
			for (int j = 0; j < a; j++) {
				int aa=sc.nextInt();
				if(aa==4) {
					ad[0]++;
				}else if(aa==3) {
					ad[1]++;
				}else if(aa==2) {
					ad[2]++;
				}else {
					ad[3]++;
				}
			}
			int b=sc.nextInt();
			int[] bd=new int[4];
			for (int j = 0; j < b; j++) {
				int bb=sc.nextInt();
				if(bb==4) {
					bd[0]++;
				}else if(bb==3) {
					bd[1]++;
				}else if(bb==2) {
					bd[2]++;
				}else {
					bd[3]++;
				}
			}
			if(ad[0]>bd[0]) {
				System.out.println("A");
			}else if(ad[0]<bd[0]) {
				System.out.println("B");
			}else {
				if(ad[1]>bd[1]) {
					System.out.println("A");
				}else if(ad[1]<bd[1]) {
					System.out.println("B");
				}else {
					if(ad[2]>bd[2]) {
						System.out.println("A");
					}else if(ad[2]<bd[2]) {
						System.out.println("B");
					}else {
						if(ad[3]>bd[3]) {
							System.out.println("A");
						}else if(ad[3]<bd[3]) {
							System.out.println("B");
						}else {
							System.out.println("D");
						}
					}
				}
			}
			
			
			
			
			
		}

	}

}
