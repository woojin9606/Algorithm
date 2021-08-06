package algo;


class 포켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        int pick=nums.length/2;
        int[] n=new int[nums.length];
        int a=0;
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=0;j<n.length;j++){
                if(nums[i]==n[j]){
                    cnt++;
                }
            }
            if(cnt==0){
                n[i]=nums[i];
                a++;
            }
        }
        if(a<=pick){
            return a;
        }
        return pick;
    }
}