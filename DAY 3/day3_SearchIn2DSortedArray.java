public class day3_SearchIn2DSortedArray {
    static boolean searchMatrix(int[][] matrix, int target) {
        /*  Using Binary Search - O(log(m*n))  */
        int low = 0;
        if(matrix.length == 0) return false;
        int n = matrix.length; 
        int m = matrix[0].length; 
        int high = (n * m) - 1;
        
        while(low <= high) {
            int mid = (low + (high - low) / 2);
            if(matrix[mid/m][mid % m] == target) { // mid/m == row  mid%m == col 
                return true;
            }
            if(matrix[mid/m][mid % m] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
    /*  Using Brute Force - O(n^2) */
    //static boolean searchMatrix(int[][] matrix, int target) {
    //    for(int i = 0; i < matrix.length; i++){
    //        for(int j = 0; j < matrix[i].length; j++){
    //            if(matrix[i][j] == target){
    //                return true;
    //            }
    //        }
    //    }
    //  return false;
    //} 


    public static void main(String[] args){
        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        boolean ans = searchMatrix(mat, target);
        System.out.println(ans);
    }   
}

//https://leetcode.com/problems/search-a-2d-matrix/