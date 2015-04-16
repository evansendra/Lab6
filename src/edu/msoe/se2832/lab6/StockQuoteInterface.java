package edu.msoe.se2832.lab6;

public interface StockQuoteInterface {

	/**
	 * @return the symbol
	 */
	public abstract String getSymbol();

	/**
	 * @return the name
	 */
	public abstract String getName();

	/**
	 * @return the lastTrade
	 */
	public abstract double getLastTrade();

	/**
	 * @return the close
	 */
	public abstract double getClose();

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public abstract String toString();

}