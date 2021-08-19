package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class num1011 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(bf.readLine());
		HashMap<Integer,Long> map=new HashMap<>();
		int a=1;
		int b=0;
		int cnt=1;
		long max=0;
		L:while(true) {
			max+=a;
			if(max>=Integer.MAX_VALUE) {
				map.put(cnt, (long)Integer.MAX_VALUE);
				break L;
			}
			map.put(cnt, max);
			b++;
			cnt++;
			if(b==2) {
				b=0;
				a++;
			}
		}

		
		for (int o = 0; o < t; o++) {
			StringTokenizer st= new StringTokenizer(bf.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			int distance=y-x;
			
			int i=1;
			while(true) {
				if(distance==0) {
					System.out.println(0);
					break;
				}
				if(distance==1) {
					System.out.println(1);
					break;
				}
				
				if(distance>map.get(i)&&distance<=map.get(i+1)) {
					System.out.println(i+1);
					break;
				}
				i++;
			}
		}

	}

}
