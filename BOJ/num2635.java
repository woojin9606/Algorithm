package algo;

import java.util.ArrayList;
import java.util.Scanner;

public class num2635 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		
		int tmp1=0;
		int tmp2=0;
		int tmp3=0;
		int max=0;
		ArrayList<Integer> tmp = null;
		
		for (int i = 0; i <= a; i++) {
			tmp1=a;
			tmp2=a-i;
			tmp3=1;
			ArrayList<Integer> arr=new ArrayList<>();
			arr.add(a);
			arr.add(tmp2);
			int cnt=2;
			while(tmp3>=0) {
				tmp3=tmp1-tmp2;
				if(tmp3>=0) {
					tmp1=tmp2;
					tmp2=tmp3;
					cnt++;
					arr.add(tmp3);
				}
			}
			if(max<cnt) {		
				max=cnt;
				tmp=new ArrayList<>(arr);
			}
		}
		
		
		
		System.out.println(max);
		for (Integer integer : tmp) {
			System.out.println(integer);
		}
	}

}
