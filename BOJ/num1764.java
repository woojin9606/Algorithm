package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(in.readLine()," ");
		int count=0;
		String[] tmp;
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		Set<String> D = new HashSet<>();
		ArrayList<String> B=new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			D.add(in.readLine());
		}
		for (int i = 0; i < M; i++) {
			String a=in.readLine();
			if(D.contains(a)) {
				B.add(a);
			}
		}
		Collections.sort(B);


		
		System.out.println(B.size());

		for (int i = 0; i < B.size(); i++) {
			System.out.println(B.get(i));
		}	
			
	}

}
