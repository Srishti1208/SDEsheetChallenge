public class day4_LengthofLongestSubarraywithSumZero {
    static int maxLen(int arr[], int n)
    {
        // Your code here
        int count = 0;
        for(int i = 0; i < n;i++){
            int sum = 0;
            for(int j = i; j<n;j++){
                sum += arr[j];
                if(sum == 0){
                    count = Math.max(count, j-i+1);
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {6, -2, 2, -8, 1, 7, 4, -10};
        int n = nums.length;
        System.out.println(maxLen(nums, n));
    }
}
