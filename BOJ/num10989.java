package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class num10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(bf.readLine());
		int[] map=new int[n];
		for (int i = 0; i < map.length; i++) {
			map[i]=Integer.parseInt(bf.readLine());
		}
		Arrays.sort(map);
		for (int i = 0; i < map.length; i++) {
			bw.write(map[i]+"\n");
		}
		bw.flush();
		bw.close();

	}

}
