package algo;

import java.util.Scanner;

public class num2839 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int five=n/5;
		int three;
		while(n!=0) {
			if(five==-1) {
				System.out.println(-1);
				break;
			}
			three=(n-five*5)/3;
			
			if(n-five*5-three*3==0) {
				n=0;
				System.out.println(five+three);
			}else {
				five--;
			}
		}
		
	}

}
