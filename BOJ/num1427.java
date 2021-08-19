package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class num1427{
     
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String s=sc.next();
    	Integer[] arr=new Integer[s.length()];
    	for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(s.charAt(i)-48);
		}
    	Arrays.sort(arr, Collections.reverseOrder()); 
    	
    	
    	for (int i : arr) {
            System.out.print(i);
        }
    	
    }
    
}