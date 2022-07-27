public class day2_RepeatingNo {
        static int findDuplicate(int[] nums) {
            int slow = nums[0]; //initially both at 0 position
            int fast = nums[0];
            do{
                slow = nums[slow]; //moved by 1 step
                fast = nums[nums[fast]]; //moved by 2 step
            }while(fast!=slow); //till fast == slow
            
            fast = nums[0]; //fast moved back to starting (0) position
            
            while(fast!=slow){
                slow = nums[slow]; //both moved by 1 step
                fast = nums[fast]; //now both are at the REPEATING no, cycle formed
            }
            return slow; //Returns the repeating no.
        }
        public static void main(String[] args){
            int[] arr = {5,8,3,4,2,5,9};
            int ans = findDuplicate(arr);
            System.out.println(ans);
        }
}

//https://leetcode.com/problems/find-the-duplicate-number/
