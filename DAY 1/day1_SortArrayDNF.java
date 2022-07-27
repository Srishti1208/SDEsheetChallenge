public class day1_SortArrayDNF {
    static void sortColors(int[] a) {
        int N = a.length;
        int low = 0, mid = 0, high = N-1, temp = 0;
        while(mid <= high){
            switch(a[mid]){
                case 0: {
                    temp = a[mid];
                    a[mid] = a[low];
                    a[low] = temp;
                    low++; mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high --;
                    break;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i]);
        }
    }
}
