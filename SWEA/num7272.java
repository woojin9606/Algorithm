package algo;

import java.util.Scanner;

public class num7272 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
         
 
        for(int tc = 1; tc <= T; tc++)
        {
            String a=sc.next();
            String b=sc.next();
            int[] c=new int[a.length()];
            int[] d=new int[b.length()];
            for (int i = 0; i < a.length(); i++) {
                if(check(a.charAt(i))==1) {
                    c[i]=1;
                }
                else if(check(a.charAt(i))==2) {
                    c[i]=2;
                }
                else {
                    c[i]=0;
                }
            }
             
            for (int i = 0; i < b.length(); i++) {
                if(check(b.charAt(i))==1) {
                    d[i]=1;
                }
                else if(check(b.charAt(i))==2) {
                    d[i]=2;
                }
                else {
                    d[i]=0;
                }
            }
             
            if(equals(c,d)) {
                System.out.println("#"+tc+" SAME");
            }
            else {
                System.out.println("#"+tc+" DIFF");
            }
        }
	}
	
	static int check(char a) {
		if(a=='A'||a=='D'||a=='O'||a=='P'||a=='Q'||a=='R') {
			return 1;
		}
		else if(a=='B') {
			return 2;
		}
		return 0;
	}
	
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		for(int i=0; i<(a.length); i++) {
			if(a[i] != b[i]){
				return false;
			}
		}
		return true;
	}

}
