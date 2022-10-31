package com.bridgelabz.stockaccount;

public class Stock {
	
	private String stockName;
	private int numberOfShare;
	private int sharePrice;
	private int totalValue;
	 /*
	  * private => variable n methods cannot be accessed outside the class
	  * if we want to access them in another class we use getter setter methods
	  * setter => to assign values(this. keyword used inside setter  to refer variable of that class)
	  * getter => to access variables
	  */
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNumberOfShare() {
		return numberOfShare;
	}
	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}
	public int getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	public int getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}
	
	/*
	 * toString() method is overridden for meaningful string representation or proper output 
	 */
		
	@Override
	public String toString() {
		return "\nStock [stockName=" + stockName + ", \nnumberOfShare=" + numberOfShare + ",\nsharePrice=" + sharePrice
				+ ", \ntotalValue=" + totalValue + "]";
	}
}
