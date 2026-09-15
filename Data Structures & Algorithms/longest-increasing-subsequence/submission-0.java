class Solution {
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        if(length == 1)return 1;
        int []data = new int[nums.length];
        int max = 1;
        data[0]=1;
        for(int i=1;i<length;i++){
            int num = nums[i];
            data[i]=1;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<num && data[i]<=data[j]){
                   data[i]=data[j]+1;
                   if(data[i]>max){
                    max = data[i];
                   }
                }
                System.out.println("i:"+i+",data[i]:"+data[i]+",nums[i]:"+nums[i]+",j:"+j+"data[j]:"+data[j]+",nums[j]:"+nums[j]);
            }
            System.out.println("data["+i+"] : "+data[i]);
            System.out.println("max : "+max);
        }
        return max;
    }
}
