package algo;

import java.util.Scanner;

public class num1003 {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int n=sc.nextInt();
			int a,b,c,d,e,f;
			a=1;
			b=1;
			c=1;
			d=2;
			e=0;

			f=0;
			if(n==0) {
				System.out.println("1 0");
			}else if(n==1) {
				System.out.println("0 1");
			}else if(n==2){
				a=1;
				b=1;
				System.out.println(a+" "+b);
			}else if(n==3) {
				c=1;
				d=2;
				System.out.println(c+" "+d);
			}else {
				for(int i=4;i<=n;i++) {
					e=a+c;
					f=b+d;
					a=c;
					b=d;
					c=e;
					d=f;
				}
				System.out.println(e+" "+f);
			}

			
		}

	}



}
