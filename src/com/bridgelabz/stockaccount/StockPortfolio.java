package com.bridgelabz.stockaccount;
import java.util.*;
public class StockPortfolio {
	
	/*
	 * static variables=> single of copy is created and shared among all objects at class level
	 */
	
	static int numberOfStock;
	static int totalValue;
	static int stockValue;
	/*
	 * ArrayList => no size limit, dynamic array
	 */
	ArrayList <Stock> details = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void addStock() {
		System.out.println("Enter the number of stocks to buy:");
		numberOfStock = sc.nextInt();
		
		
		for( int i = 0; i<numberOfStock; i++) {
			System.out.println("Stock details  is : " );
			Stock stock = new Stock();
			System.out.println("Enter stock name : ");
			stock.setStockName(sc.next());
			System.out.println("Enter number of share :");
			stock.setNumberOfShare(sc.nextInt());
			System.out.println("Enter share price :");
			stock.setSharePrice(sc.nextInt());
			
			totalValue = stock.getNumberOfShare() * stock.getSharePrice();
			stock.setTotalValue(totalValue);
			details.add(stock);
			
			stockValue = stockValue + totalValue;
		}
		System.out.println(details);
		
		System.out.println("Total stock value :" +stockValue);
			
		}
	}