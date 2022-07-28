public class day4_CountNoOfSubarraysWithGivenXOR {
    static int solve(int[] A, int B){
        int count = 0;
        for(int i = 0;i<A.length;i++){
            int curr_XOR = 0;
            for(int j = i;j<A.length;j++){ //To find all subarrays - inner loop j = i till length
                curr_XOR ^= A[j];
                if(curr_XOR == B) count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {4,2,2,6,4};
        int target = 6;
        int ans = solve(nums, target);
        System.out.println("The total number of subarrays having a given XOR k is "+ ans);
    }
}
