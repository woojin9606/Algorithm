package algo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int[] a= {3,3,3,2,2,2};
    	System.out.println(solution(a));
        
    }

    
    public static int solution(int[] nums) {
        int answer = 0;
        int pick=nums.length/2;
        int[] n=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=0;j<n.length;j++){
                if(nums[i]==n[j]){
                    cnt++;
                }
            }
            if(cnt==0){
                n[i]=nums[i];
            }
        }
        if(n.length<=pick){
            return n.length;
        }
        return pick;
    }
}