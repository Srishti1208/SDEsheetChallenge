import java.util.Arrays;

public class day2_MissingNo {
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int[] subsi = new int[n+1];
        int ans = 0;
        Arrays.fill(subsi, 0);
        for(int i = 0; i<n;i++){
            subsi[nums[i]]++; //nums = {1,2,3,5}
        }
        for(int i = 1;i<=n;i++){
            if(subsi[i] == 0){ //subsi = {0,1,1,1,0,1} 0th position will always be 0 thats we                                  are starting the loop from 1
                               //if (subsi[i] > 1) then that i is the repeating no.
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {0,1,3,4,5};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
}

//https://leetcode.com/problems/missing-number/