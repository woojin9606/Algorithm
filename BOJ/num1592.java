package algo;

import java.util.Scanner;

public class num1592 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N,M,L,cnt,n,a;
		N=sc.nextInt();
		M=sc.nextInt();
		L=sc.nextInt();
		a=0;
		cnt=0;
		n=0;
		int[] p=new int[N];
		p[0]=1;
		while (a==0) {
			if(p[n]%2==1) {
				n=n+L;
				if(n>N-1) {
					n=n-N;
				}
				p[n]++;
			}
			else if(p[n]%2==0) {
				n=n-L;
				if(n<0) {
					n=n+N;
				}
				p[n]++;
			}
			cnt++;
			for (int i = 0; i < N; i++) {
				if(p[i]==M) {
					System.out.println(cnt);
					a=1;
				}
			}			
		}

		
		
	}

}
