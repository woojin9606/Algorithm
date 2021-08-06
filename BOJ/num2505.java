package algo;

import java.util.Scanner;

public class num2505 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int tmp1=0;
		int tmp2=0;
		int[] map=new int[n+1];
		int[] tmp=new int[n+1];
		//숫자삽입
		for(int i=1;i<=n;i++) {
			map[i]=sc.nextInt();
			tmp[i]=map[i];
		}
		//숫자 몇을 찾아야 하는지 검색
		for(int i=1;i<=n;i++) {
			if(map[i]!=i) {
				tmp1=i;
				break;
			}
		}
		//그 숫자를 찾음
		for(int i=1;i<=n;i++) {
			if(map[i]==tmp1) {
				tmp2=i;
				break;
			}
		}
		//뒤집
		change(tmp1,tmp2,map);
		if(tmp1==0&tmp2==0) {
				tmp1=1;
				tmp2=1;
		}
		
		int tmp3=0;
		int tmp4=0;
		
		for(int i=1;i<=n;i++) {
			if(map[i]!=i) {
				tmp3=i;
				break;
			}
		}
		//그 숫자를 찾음
		for(int i=1;i<=n;i++) {
			if(map[i]==tmp3) {
				tmp4=i;
				break;
			}
		}
		change(tmp3,tmp4,map);
		int a=0;
		for(int i=1;i<=n;i++) {
			if(map[i]!=i) {
				a++;
				break;
			}
		}
		
		
		if(a==1) {
			for(int i=1;i<=n;i++) {
				map[i]=tmp[i];
			}
			//뒤에서부터
			//숫자 몇을 찾아야 하는지 검색
			tmp1=0;
			tmp2=0;
					for(int i=n;i>=1;i--) {
						if(map[i]!=i) {
							tmp1=i;
							break;
						}
					}
					//그 숫자를 찾음
					for(int i=n;i>=1;i--) {
						if(map[i]==tmp1) {
							tmp2=i;
							break;
						}
					}
					//뒤집
					change(tmp2,tmp1,map);
					if(tmp1==0&tmp2==0) {
							tmp1=1;
							tmp2=1;
					}
					
					tmp3=0;
					tmp4=0;
					
					for(int i=n;i>=1;i--) {
						if(map[i]!=i) {
							tmp3=i;
							break;
						}
					}
					//그 숫자를 찾음
					for(int i=n;i>=1;i--) {
						if(map[i]==tmp3) {
							tmp4=i;
							break;
						}
					}
					change(tmp4,tmp3,map);
					
					if(tmp3==0&tmp4==0) {
						System.out.println("1 1");
						System.out.println(tmp1+" "+tmp2);
					}else {
						System.out.println(tmp2+" "+tmp1);
						System.out.println(tmp4+" "+tmp3);
					}
		}else {
			if(tmp3==0&tmp4==0) {
				System.out.println("1 1");
				System.out.println(tmp1+" "+tmp2);
			}else {
				System.out.println(tmp1+" "+tmp2);
				System.out.println(tmp3+" "+tmp4);
			}
		}
		
		
		
	}
	static void change(int a, int b,int[] c) {
		int[] tmp=new int[c.length];
		int cnt=0;
		for(int i=a;i<=b;i++) {
			tmp[i]=c[b-cnt];
			cnt++;
		}
		for(int i=a;i<=b;i++) {
			c[i]=tmp[i];
		}
	}

}
