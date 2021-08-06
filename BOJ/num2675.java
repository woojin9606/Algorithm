package algo;

import java.util.Scanner;

public class num2675 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a=sc.nextInt();
			String b=sc.next();
			for (int j = 0; j < b.length(); j++) {
				for (int j2 = 0; j2 < a; j2++) {
					System.out.print(b.charAt(j));
				}
			}
			System.out.println();
		}

	}

}
