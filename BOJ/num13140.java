package algo;

import java.util.Scanner;

public class num13140 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;		
		L:for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				for (int j2 = 0; j2 <= 9; j2++) {
					for (int k = 0; k <= 9; k++) {
						for (int k2 = 0; k2 <= 9; k2++) {
							for (int l = 0; l <= 9; l++) {
								for (int l2 = 0; l2 <= 9; l2++) {
									if(i!=j&&i!=j2&&i!=k&&i!=k2&&i!=l&&i!=l2&&j!=j2&&j!=k&&j!=k2&&j!=l&&j!=l2&&j2!=k&&j2!=k2&&j2!=l&&j2!=l2&&k!=k2&&k!=l&&k!=l2&&k2!=l&&k2!=l2&&l!=l2) {
										if(check(i,j,j2,k,k2,l,l2,n)==true) {
											cnt++;
											break L;
										}
									}
								}
							}
							
						}
					}
				}
			}
		}
		if(cnt==0) {
			System.out.println("No Answer");
		}		
	}

	private static boolean check(int i, int j, int j2, int k, int k2, int l, int l2,int n) {
		if((i*10000+j2*1000+k*100+k*10+k2)+(j*10000+k2*1000+l*100+k*10+l2)==n) {
			System.out.println("  "+(i*10000+j2*1000+k*100+k*10+k2));
			System.out.println("+ "+(j*10000+k2*1000+l*100+k*10+l2));
			System.out.println("-------");
			if(n<100000)
				System.out.println("  "+n);
			else
				System.out.println(" "+n);
			return true;
		}
		return false;
		
	}
	

}
