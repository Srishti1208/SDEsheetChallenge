public class day1_NextPermutation {
        static void nextPermutation(int[] A) {
            if(A == null || A.length <= 1) return;
            int i = A.length - 2;
            while(i >= 0 && A[i] >= A[i + 1]) i--; 
            if(i >= 0) {                           
                int j = A.length - 1;              
                while(A[j] <= A[i]) j--;      
                swap(A, i, j);                     
            }
            reverse(A, i + 1, A.length - 1);      
    }
    
    static void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
    
    static void reverse(int[] A, int i, int j) {
        while(i < j) swap(A, i++, j--);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        nextPermutation(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
