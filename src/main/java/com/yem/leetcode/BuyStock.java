package com.yem.leetcode;/** * * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。 * 输入：[7,1,5,3,6,4] * 输出：5 */public class BuyStock {	public static void main(String[] args) {	    int[] prices = {7,1,5,3,6,4};		System.out.println(maxProfit(prices));		System.out.println(maxProfitPlus(prices));	}	/**	 * 记录第i天前的历史最低点，同时记录收益	 */    public static int maxProfit(int[] prices) {		if(prices == null || prices.length == 0){            return 0;        }		int minPrice = prices[0];		int maxProfit = 0;		for(int i = 1; i < prices.length; i++){			if(minPrice > prices[i]){				minPrice = prices[i];			}else {				maxProfit = Math.max(maxProfit, prices[i] - minPrice);			}		}		return maxProfit;    }	/**	 * 给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。	 *	 * 在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。	 *	 * 返回 你能获得的 最大 利润 。	 *	 * 使用动态规划	 *	 * 假设 dp[i][0]是第i天的手中未持有股票的收益， dp[i][1]是第i天持有股票时的收益	 * 则dp[i][0]此时可能是由第i-1天时未持有股票延续或者第i-1持有股票在第i天卖了，则状态转移方程	 * dp[i][0] = Max(dp[i-1][0], dp[i-1][1] + prices[i])	 * 同理	 * dp[i][1] = Max(dp[i-1][1], dp[i-1][0] - prices[i])	 */	public static int maxProfitPlus(int[] prices){		if(prices == null || prices.length == 0){			return 0;		}		int[][] dp = new int[prices.length][2];		dp[0][0] = 0;		dp[0][1] = -prices[0];		for(int i = 1; i < prices.length; i++){			dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] - prices[i]);			dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] + prices[i]);		}		return dp[prices.length -1][0];	}}