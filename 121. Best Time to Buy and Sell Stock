class Solution {
    public int maxProfit(int[] prices) {

        //time limit exceeding brute force code
        // int r = 0;
        // int profit = 0;
        //  for(int i = 0; i < prices.length; i++){

        //      for(int j = i+1; j< prices.length; j++){

        //          if(prices[j] > prices[i]){
        //              profit = prices[j] - prices[i]; 
        //              if( r < profit)
        //                 {
        //                     r = profit;
        //                 }
        //          }
        //      }
        //  }
        //  return r;

        // two pointer solution
        int maxprofit= 0;
        int l =0;
        int r = 1;
        int profit = 0;
        while(r < prices.length){
            if(prices[l] < prices[r]){
                profit = prices[r]- prices[l];
                maxprofit = Math.max(profit, maxprofit);
            } else{
                l = r;
            }
            r++;
        }
        return maxprofit;
    }
   
}
