package algo;

import java.util.Scanner;

//경비원
public class num2564 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=sc.nextInt();
		int[] map=new int[n+1];
		for (int i = 0; i <= n; i++) {
			int c=sc.nextInt();
			int d=sc.nextInt();
			if(c==1){
				map[i]=d;
			}else if(c==2) {
				map[i]=a+b+(a-d);
			}else if(c==3) {
				map[i]=a*2+b*2-d;
			}else {
				map[i]=a+d;
			}
		}
		for (int i = n-1; i >= 0; i--) {
			if(Math.abs(map[n]-map[i])<=a+b) {
				sum+=Math.abs(map[n]-map[i]);
			}else {
				sum+=(2*a+2*b)-Math.abs(map[n]-map[i]);
			}
		}
		System.out.println(sum);
		

	}

}
