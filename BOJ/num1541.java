package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class num1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String a=in.readLine();
		StringTokenizer st = new StringTokenizer(a, "-");
		ArrayList<String> b=new ArrayList<String>();

		while (st.hasMoreTokens()) { //아직 파싱할 토큰이 더 있는지 여부를 확인한다 
			b.add(st.nextToken()); 
		}
		int sum=0;
		for (int i = 0; i < b.size(); i++) {
			ArrayList<Integer> c=new ArrayList<Integer>();
			st = new StringTokenizer(b.get(i), "+");
			while (st.hasMoreTokens()) { //아직 파싱할 토큰이 더 있는지 여부를 확인한다 
				c.add(Integer.parseInt(st.nextToken()));
			}
			if(i==0) {
				for (int j = 0; j < c.size(); j++) {
					sum+=c.get(j);
				}
			}else {
				for (int j = 0; j < c.size(); j++) {
					sum-=c.get(j);
				}
			}
		}
		System.out.println(sum);

			

	}

}
