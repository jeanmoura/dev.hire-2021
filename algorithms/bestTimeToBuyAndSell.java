// Estrategy of two pointers (left and right), Time Complexity O(n), Space Complexity O(1)

class Solution {
    public int maxProfit(int[] prices) {
        //Initializing the variables
        int l = 0;
        int r = 0;
        int maxProfit = 0;
        // As long right is lesser than the prices array
        while(r < prices.length) {
            //If prices left value are greater than at right side, left recieve right's value.
            if(prices[l] > prices[r]) {
                l = r;
            }else{
                //maxProfit recieve the optimizated value of the difference of prices of sell - buy considering the value it self.
                maxProfit = Math.max(prices[r] - prices[l], maxProfit);
                r++;
            }
        }   
        return maxProfit;
    }
}