package LeetCode;

import java.util.Scanner;

public class BestTimeToBuyandSellStock_121 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int prices[]= {7,1,5,3,6,4};
		int minPrice=prices[0];
		int maxProfit=0;
		for(int i=0;i<prices.length;i++) {
			if(prices[i]>minPrice) {
				maxProfit=Math.max(maxProfit,prices[i]-minPrice);
			}else {
				minPrice=prices[i];
			}
		}
		System.out.println(maxProfit);
	}

}
