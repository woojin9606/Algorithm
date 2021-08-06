package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class num9461 {
	static int sum=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		long[] data=new long[10000];
		for (int i = 0; i < n; i++) {
			int a=Integer.parseInt(in.readLine());
			System.out.println(pado(a,data));
		}
		
	}

	private static long pado(int i,long[] data) {
		if(i==1||i==2||i==3) {
			return 1;
		}
		if(data[i]==0) {
			data[i]=pado(i-2,data)+pado(i-3,data);
		}
		return data[i];
		
	}
	
}
