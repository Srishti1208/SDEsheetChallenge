public class day3_MajorityElementNby2 {
    static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if(num==candidate)
            count += 1; 
            else count -= 1; 
        }

        return candidate;
    }
    public static void main(String[] args){
        int[] arr = {3,2,3};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }    
}
