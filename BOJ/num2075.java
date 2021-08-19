package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class num2075 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());
		ArrayList<Integer> arr=new ArrayList<>();
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());
			for (int j = 0; j < n; j++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
				
		}
		Collections.sort(arr);
		System.out.println(arr.get(n*n-n));

	}

}
