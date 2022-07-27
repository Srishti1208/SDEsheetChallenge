public class day1_StockBuyAndSell {
    static int maxProfit(int[] prices) {
        int maxProfit =0;
        int minSofar =prices[0];
        for(int i =0;i<prices.length;i++){
            minSofar = Math.min(minSofar,prices[i]);
            int Profit = prices[i]-minSofar;
            maxProfit = Math.max(maxProfit,Profit);
        }
        return maxProfit;
        }
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
}
