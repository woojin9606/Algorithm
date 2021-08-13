package algo;

import java.util.Arrays;
import java.util.Scanner;

public class num11497 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int n=sc.nextInt();
			int[] map=new int[n];
			int[] temp=new int[n];
			for (int j = 0; j < map.length; j++) {
				map[j]=sc.nextInt();
			}
			Arrays.sort(map);
			
			if(map.length%2==0) {
				for (int j = 0; j < map.length/2; j++) {
					temp[j]=map[j*2];
					if(j*2+1<n) {
						temp[n-1-j]=map[j*2+1];
					}
				}
			}else if(map.length%2==1) {
				for (int j = 0; j <= map.length/2; j++) {
					temp[j]=map[j*2];
					if(j*2+1<n) {
						temp[n-1-j]=map[j*2+1];
					}
				}
			}
			int max=0;
			for (int j = 0; j < temp.length-1; j++) {
				if(max < Math.abs(temp[j]-temp[j+1])) {
					max = Math.abs(temp[j]-temp[j+1]);
				}
			}
			
			System.out.println(max);
			
		}

	}

}
