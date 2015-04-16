/**
 * (c) Copyright 2008, Dr. Walter W. Schilling, Jr.
 * ALL RIGHTS RESERVED 
 * Permission to use, copy, modify, and distribute this software for 
 * any purpose and without fee is hereby granted, provided that the above
 * copyright notice appear in all copies and that both the copyright notice
 * and this permission notice appear in supporting documentation, and that 
 * the name of Walter W. Schilling, Jr. not be used in advertising
 * or publicity pertaining to distribution of the software without specific,
 * written prior permission. 
 *
 * THE MATERIAL EMBODIED ON THIS SOFTWARE IS PROVIDED TO YOU "AS-IS"
 * AND WITHOUT WARRANTY OF ANY KIND, EXPRESS, IMPLIED OR OTHERWISE,
 * INCLUDING WITHOUT LIMITATION, ANY WARRANTY OF MERCHANTABILITY OR
 * FITNESS FOR A PARTICULAR PURPOSE.  IN NO EVENT SHALL MSOE
 * BE LIABLE TO YOU OR ANYONE ELSE FOR ANY DIRECT,
 * SPECIAL, INCIDENTAL, INDIRECT OR CONSEQUENTIAL DAMAGES OF ANY
 * KIND, OR ANY DAMAGES WHATSOEVER, INCLUDING WITHOUT LIMITATION,
 * LOSS OF PROFIT, LOSS OF USE, SAVINGS OR REVENUE, OR THE CLAIMS OF
 * THIRD PARTIES, WHETHER OR NOT WALTER SCHILLING HAS BEEN
 * ADVISED OF THE POSSIBILITY OF SUCH LOSS, HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, ARISING OUT OF OR IN CONNECTION WITH THE
 * POSSESSION, USE OR PERFORMANCE OF THIS SOFTWARE. 
 * 
 * @version $Rev:: 3                       $:  Revision of last commit
 * @author  $Author:: schilling            $:  Author of last commit
 * $Date:: 2008-10-20 19:51:02 -0#$:  Date of last commit
 * $Log$:
 * 
 * This class contains information about the value of a single stock quote.
 * 
 */

package edu.msoe.se2832.lab6;

/**
 * @author schilling
 * 
 */
public class StockQuote implements StockQuoteInterface {
	private final String symbol;
	private final String name;
	private double lastTrade;
	private double close;

	/**
	 * @param symbol
	 *            The symbol for the quote.
	 * @param name
	 *            The name of the company.
	 * @param lastTrade
	 *            The last trading value.
	 * @param close
	 *            This is the closing value of the stock from yesterday.
	 */
	public StockQuote(String symbol, String name, double lastTrade, double close) {
		super();
		this.symbol = symbol;
		this.name = name;
		this.lastTrade = lastTrade;
		this.close = close;
	}

	/* (non-Javadoc)
	 * @see edu.msoe.se2831.lab6.StockQuoteInterface#getSymbol()
	 */
	public String getSymbol() {
		return symbol;
	}

	/* (non-Javadoc)
	 * @see edu.msoe.se2831.lab6.StockQuoteInterface#getName()
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see edu.msoe.se2831.lab6.StockQuoteInterface#getLastTrade()
	 */
	public double getLastTrade() {
		return lastTrade;
	}





	/* (non-Javadoc)
	 * @see edu.msoe.se2831.lab6.StockQuoteInterface#getClose()
	 */
	public double getClose() {
		return close;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see edu.msoe.se2831.lab6.StockQuoteInterface#toString()
	 */
	public String toString() {

		String retVal = this.name + " (" + this.symbol + ")" + " Last Trade: "
				+ this.lastTrade + " Prev. Close: " + this.close;
		return retVal;
	}
}