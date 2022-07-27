import java.util.Arrays;

public class day3_GridUniquePaths {
    static int uniquePaths(int n, int m) {
        
        // ***** Combinations *****
        //    int N = m+n-2;
        //    int r = m-1;
        //    double res = 1;
        //    for(int i=1;i<=r;i++){
        //        res = res*(N-r+i)/i;
        //    }
        //    return (int) res;
            
            
            int[][] dp = new int[n][m];
            for(int i =0;i<n;i++){
                Arrays.fill(dp[i],-1);    
            }
            
            return helper(0,0,n,m,dp);
        }
        
        // ***** Brute Force Approach *****
        //public int helper(int i,int j,int n,int m){
        //    if(i>=n ||j>=m) return 0;
        //    if(i == n-1 && j==m-1) return 1;
        //    else return helper(i+1,j,n,m)+helper(i,j+1,n,m);
        //}
        
        // ***** DP *****
        static int helper(int i,int j,int n,int m, int[][] dp){
            if(i>=n ||j>=m) return 0;
            if(i == n-1 && j==m-1) return 1;
            if(dp[i][j] != -1) return dp[i][j];
            else return dp[i][j] = helper(i+1,j,n,m,dp)+helper(i,j+1,n,m,dp);
        }
        public static void main(String[] args){
            int n = 2;
            int m = 3;
            int ans = uniquePaths(n, m);
            System.out.println("Unique Paths are = " + ans);
        }
}
