public class day1_KadanesAlgo {
    static int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for(int i = 0; i < nums.length; i++){
            currentsum += nums[i];
            if(currentsum > maxsum){
                maxsum = currentsum;
            }
            if(currentsum < 0){
                currentsum = 0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArray(arr);
        System.out.println(ans);
    }
}
