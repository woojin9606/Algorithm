package algo;

import java.util.Scanner;

public class num17626 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] board=new int[225];
		int n=sc.nextInt();
		int a=0;
		for (int i = 1; i <= 224; i++) {
			board[i]=i*i;
			if(board[i]>n) {
				a=i;
				break;	
			}
		}
		
		L:while(true) {
			for (int i = 1; i <= a; i++) {
				if(board[i]==n) {
					System.out.println("1");
					break L;
				}
			}
			
			for (int i = 1; i <= a; i++) {
				for (int j = i; j <= a; j++) {
					if(board[i]+board[j]==n) {
						System.out.println("2");
						break L;
					}
				}
			}
			
			for (int i = 1; i <= a; i++) {
				for (int j = i; j <= a; j++) {
					for (int k = i; k <= a; k++) {
						if(board[i]+board[j]+board[k]==n) {
							System.out.println("3");
							break L;
						}
					}
				}
			}
			
			System.out.println("4");
			break L;
		}
		

	}

}
