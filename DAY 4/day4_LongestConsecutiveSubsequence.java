import java.util.Arrays;

public class day4_LongestConsecutiveSubsequence {
    static int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        Arrays.sort(nums);
        int ans = 1;
        int cur = 1;
        int prev = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == prev+1){
                cur++;
            } else if(nums[i] != prev){
                cur = 1;
            }
            prev = nums[i];
            ans = Math.max(ans,cur);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {100,4,200,1,3,2};
        int res = longestConsecutive(nums);
        System.out.println(res);
    }
}
