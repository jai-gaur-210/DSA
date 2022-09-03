public class BuySellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int x=0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
            }
            x = (prices[i]-min);
            max = Math.max(max,x);
        }
        return(max);   
    }
    public static void main (String[] args){
        int arr[] = {3,2,6,5,0,3};
        BuySellStock a = new BuySellStock();
        int ans = a.maxProfit(arr);
        System.out.println(ans);   
    } 
}
