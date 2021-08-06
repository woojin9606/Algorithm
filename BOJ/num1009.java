package algo;

import java.util.Scanner;
//
public class num1009 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			switch (a%10) {
			case 0:
				System.out.println(10);
				break;
			case 1:
				System.out.println(1);
				break;
			case 2:
				if(b%4==1) {
					System.out.println(2);
				}else if(b%4==2) {
					System.out.println(4);
				}else if(b%4==3) {
					System.out.println(8);
				}else {
					System.out.println(6);
				}
				break;
			case 3:
				if(b%4==1) {
					System.out.println(3);
				}else if(b%4==2) {
					System.out.println(9);
				}else if(b%4==3) {
					System.out.println(7);
				}else {
					System.out.println(1);
				}
				break;
			case 4:
				if(b%2==1) {
					System.out.println(4);
				}else {
					System.out.println(6);
				}
				break;
			case 5:
				System.out.println(5);
				break;
			case 6:
				System.out.println(6);
				break;
			case 7:
				if(b%4==1) {
					System.out.println(7);
				}else if(b%4==2) {
					System.out.println(9);
				}else if(b%4==3) {
					System.out.println(3);
				}else {
					System.out.println(1);
				}
				break;
			case 8:
				if(b%4==1) {
					System.out.println(8);
				}else if(b%4==2) {
					System.out.println(4);
				}else if(b%4==3) {
					System.out.println(2);
				}else {
					System.out.println(6);
				}
				break;
			case 9:
				if(b%2==1) {
					System.out.println(9);
				}else {
					System.out.println(1);
				}
				break;
				

			default:
				break;
			}
		}
		
		
	}

}
