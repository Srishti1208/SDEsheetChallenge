import java.util.ArrayList;
import java.util.Arrays;

public class day2_MergeIntervals {
    static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> list=new ArrayList<>();
        for(int[] interval : intervals){
            if(list.size() == 0){
                list.add(interval);
            } else {
                int prev[] = list.get(list.size() - 1);
                if(interval[0] <= prev[1]){
                    prev[1] = Math.max(prev[1], interval[1]);
                } else {
                    list.add(interval);
                }
            }
        }
        return list.toArray(new int[list.size()][]);
    }
    public static void main(String[] args){
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        merge(arr);
        for(int i = 0;i<arr.length;i++){
            for(int j=0; j < arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}

//https://leetcode.com/problems/merge-intervals/
