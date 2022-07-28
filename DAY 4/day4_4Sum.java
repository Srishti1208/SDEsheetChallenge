import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class day4_4Sum {
    static List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> set = new HashSet<List<Integer>>(); //to find unique set
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length < 4){
            return res;
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){ //2 pointers approach
                int s = j+1;
                int e = nums.length - 1;
                while(s < e){
                    long sum = (long)nums[i]+(long)nums[j]+(long)nums[s]+(long)nums[e];
                    if(sum == target){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[s]);
                        temp.add(nums[e]);
                        if(!set.contains(temp)){ //To check unique set
                            set.add(temp);
                            res.add(temp);
                        }
                        s++;
                        e--;
                    }
                    else if(sum < target){
                        s++;
                    } else {
                        e--;
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> ans = fourSum(nums, target);
        System.out.println(ans + " ");
    }
}
