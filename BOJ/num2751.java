package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class num2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(bf.readLine());
		ArrayList<Integer> arr=new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(bf.readLine()));
		}
		Collections.sort(arr);
		for (int i = 0; i < arr.size(); i++) {
			bw.write(arr.get(i)+"\n");
		}
		bw.flush();
		bw.close();

	}

}
