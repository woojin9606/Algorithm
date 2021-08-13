package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class num11723 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(bf.readLine());
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			String a = st.nextToken();
			if(a.equals("add")) {
				set.add(Integer.parseInt(st.nextToken()));
			}else if(a.equals("remove")) {
				set.remove(Integer.parseInt(st.nextToken()));
			}else if(a.equals("check")) {
				if(set.contains(Integer.parseInt(st.nextToken()))) {
					bw.write("1\n");
				}else {
					bw.write("0\n");
				}
			}else if(a.equals("toggle")) {
				int b=Integer.parseInt(st.nextToken());
				if(set.contains(b)) {
					set.remove(b);
				}else {
					set.add(b);
				}
			}else if(a.equals("all")) {
				for (int j = 1; j <=20 ; j++) {
					set.add(j);
				}
			}else if(a.equals("empty")) {
				set = new HashSet<>();
			}
		}
		bw.flush();
		bw.close();
				
	}

}
