public class day4_TwoSum {
    static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            for(int j = i + 1; j < nums.length; j++){
            if( x + nums[j] == target){
                ans[0] = i;
                ans[1] = j;
            }
        }
    }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = new int[2];
        ans = twoSum(nums, target); 
        for(int i = 0; i < ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }    
}