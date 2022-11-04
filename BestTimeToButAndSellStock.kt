class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var least = Int.MAX_VALUE
        
        for (i in prices) {
            // Update least if current value is the current minimum
            least = Math.min(i, least)
            
            // Calculate today's profit is sold today
            val todayProfit = i - least
            
            // Update max profit if today profit is more than. the previous max
            maxProfit = Math.max(todayProfit, maxProfit)
        }
        
        return maxProfit
    }
}