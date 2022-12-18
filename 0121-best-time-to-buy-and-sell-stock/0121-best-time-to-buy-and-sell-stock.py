class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit=0
        buy=prices[0]
        for i in range(len(prices)):
            if(buy>prices[i]):
                buy=prices[i]
            elif(profit < prices[i]-buy):
                profit=prices[i]-buy
        return profit
        
        