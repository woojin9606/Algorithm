package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class num18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(bf.readLine());
		int[] arr=new int[n];
		int[] arr2=new int[n];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			arr2[i]=arr[i];
		}
		
		Arrays.sort(arr2);
		HashMap<Integer,Integer> arr4 = new HashMap<>();
		int cnt=0;
		for (int i = 0; i < arr2.length; i++) {
			if(!arr4.containsKey(arr2[i])) {
				arr4.put(arr2[i], cnt);
				cnt++;
			}
		}
		
		for (int i = 0; i < n; i++) {
			bw.write(arr4.get(arr[i])+" ");
		}
		bw.flush();
		bw.close();

	}

}
