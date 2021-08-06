package algo;

import java.util.Scanner;

public class num1234 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			
			int size=sc.nextInt();
			int[] num=new int[size];
			String a=sc.next();
			for (int i = 0; i < num.length; i++) {
				num[i]=Character.getNumericValue(a.charAt(i));
			}
			
			while(true) {
				int check=0;
				for (int j = 0; j < num.length-1; j++) {
					if(num[j]==num[j+1]) {
						for(int k=j;k<size-2;k++) {
							num[k]=num[k+2];
						}
						size=size-2;
						int[] tmp=new int[size];
						System.arraycopy(num, 0, tmp, 0, size);
						num=tmp;
						check++;
					}
				}
				if(check==0) {
					break;
				}
			}
			System.out.print("#"+test_case+" ");
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]);
			}
			System.out.println();
					
		}

	}

}
