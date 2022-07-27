public class day2_RotateMatrix {
    static void rotate(int[][] matrix) {
        int n = matrix.length;
        //Transpose Matrix
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                
            }
        }
        //Swap 1st and last cols
        for(int i = 0 ;i < n;i++){
            int left = 0;
            int right = n-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(mat);
        for(int i = 0;i<mat.length;i++){
            for(int j=0; j < mat[0].length;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}

//https://leetcode.com/problems/rotate-image/
