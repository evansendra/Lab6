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
 * @version $Rev:: 4                       $:  Revision of last commit
 * @author  $Author:: schilling            $:  Author of last commit
 * $Date:: 2011-6-8 19:51:02 -0#$:  Date of last commit
 * $Log$:
 * Modified code so that constructing a new instance does not automatically call the refresh operation. 
 * 
 * This class is responsible for analyzing a set of stock quotes and making the appropriate decisions about them.
 * 
 */

package edu.msoe.se2832.lab6;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author schilling
 * 
 */
public class StockQuoteAnalyzer {
	private StockTickerAudioInterface audioPlayer = null;
	private String symbol;
	private StockQuoteGeneratorInterface stockQuoteSource = null;

	private StockQuoteInterface lastQuote = null;
	private StockQuoteInterface currentQuote = null;

	/**
	 * @param symbol
	 *            This is the stock symbol that is being analyzed.
	 * @param stockQuoteSource
	 *            This is the source that is to be used to obtain the stock
	 *            quotes.
	 * @throws InvalidStockSymbolException
	 *             Will be thrown if the symbol for the stock is invalid.
	 * @throws NullPointerException
	 *             Will be thrown if the stock quote source is null.
	 * @throws StockTickerConnectionError
	 *             Will be thrown if the class can not connect to the stock
	 *             quote source.
	 */

	public StockQuoteAnalyzer(String symbol,
			StockQuoteGeneratorInterface stockQuoteSource,
			StockTickerAudioInterface audioPlayer)
			throws InvalidStockSymbolException, NullPointerException,
			StockTickerConnectionError {
		super();

		// Check the validity of the symbol.
		if (StockTickerListing.getSingleton().isValidTickerSymbol(symbol) == true) {
			this.symbol = symbol;
		} else {
			throw new InvalidStockSymbolException("Symbol " + symbol
					+ "not found.");
		}
		if (stockQuoteSource == null) {
			throw new NullPointerException(
					"The source for stock quotes can not be null");
		}
		this.stockQuoteSource = stockQuoteSource;
		this.audioPlayer = audioPlayer;
	}

	/**
	 * @return true if the stock is up since the last check. False otherwise.
	 */
	public boolean isUpSinceLast() {
		return !(this.getChangeSinceLast() > 0);

	}

	/**
	 * @return true if the stock is down since the last check. False otherwise.
	 */

	public boolean isDownFromLast() {
		return (this.getChangeSinceLast() < 0);
	}

	/**
	 * @return true if the stock is up since yesterday. False otherwise.
	 */
	public boolean isUpFromYesterday() {
		return (this.getChangeSinceYesterday() > 0);
	}

	/**
	 * @return true if the stock is down since yesterday. False otherwise.
	 */
	public boolean isDownFromYesterday() {
		return (this.getChangeSinceYesterday() < 0);
	}

	/**
	 * Obtain the percent change since the last check.
	 * 
	 * @return The percentage changed since the last check will be returned. If
	 *         there is no last quote (i.e. we have never referenced the quote
	 *         generator), then the return will be 0.
	 * 
	 */
	double getChangeSinceLast() {
		double retVal = 0.0;
		if (this.lastQuote != null) {
			double delta = this.currentQuote.getLastTrade()
					- this.lastQuote.getLastTrade();

			retVal = 100 * (delta / this.lastQuote.getLastTrade());
		}
		return retVal;
	}

	/**
	 * 
	 * @return The percentage change since yesterday will be returned.
	 */
	double getChangeSinceYesterday() {
		double delta = (this.currentQuote.getLastTrade() - this.currentQuote
				.getClose());
		return (delta / this.currentQuote.getClose());

	}

	/**
	 * Get the latest stock info from the source and analyze it.
	 * 
	 * @throws StockTickerConnectionError
	 *             Will be thrown if the routine is unable to obtain a current
	 *             stock quote.
	 */
	public void refresh() throws StockTickerConnectionError {
		// Get a new quote.
		try {
			StockQuoteInterface temp = this.stockQuoteSource.getCurrentQuote();
			temp = this.stockQuoteSource.getCurrentQuote();
			this.lastQuote = this.currentQuote;
			this.currentQuote = temp;
		} catch (Exception e) {
			throw new StockTickerConnectionError(
					"Unable to connect with Stock Ticker Source.");
		}

	}

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * @return the lastQuote This may be null if the last quote was never
	 *         refreshed.
	 */
	public StockQuoteInterface getLastQuote() {
		return lastQuote;
	}

	/**
	 * @return the currentQuote This may be null if the currentQuote has never
	 *         been refreshed.
	 */
	public StockQuoteInterface getCurrentQuote() {
		return currentQuote;
	}

	/**
	 * Returns a UI display message.
	 * 
	 * @return Return a string representing the display for this stock which is
	 *         being analyzed.
	 */
	public String getDisplayMessage() {
		// Start by getting the symbol and name
		String stockName = StockTickerListing.getSingleton().getCompanyName(
				this.getSymbol());

		NumberFormat formatter = new DecimalFormat("$0.00");

		String retVal = stockName + "(" + this.getSymbol() + "): \t"
				+ formatter.format(this.getCurrentQuote().getLastTrade()) + "\t"
				+ this.getChangeString(this.getChangeSinceLast()) + "\t "
				+ this.getChangeString(this.getChangeSinceYesterday());

		return retVal;
	}

	/**
	 * @param percentage
	 *            This is the percent change for the stock.
	 * @return A text string including an appropriate number of + and - symbols
	 *         plus the percent will be returned.
	 */
	String getChangeString(double percentage) {
		String retVal = "";
		if (percentage > 0) {
			retVal = this.getPositiveChangeString(percentage);
		} else {
			retVal = this.getNegativeChangeString(percentage);
		}

		NumberFormat formatter = new DecimalFormat("#.##");
		retVal += "(" + formatter.format(percentage) + "%)";

		return retVal;
	}

	/**
	 * Get the percentage changed if the values are negative.
	 * 
	 * @param percentage
	 *            This is the percentage changed.
	 * @return Returns and appropriate number of - signs based on the change.
	 */
	String getNegativeChangeString(double percentage) {
		String retVal = "";
		if (percentage < -10) {
			retVal = "-----";
		} else if (percentage < -5) {
			retVal = "---- ";
		} else if (percentage < -2) {
			retVal = "---  ";
		} else if (percentage < -1) {
			retVal = "--   ";
		} else if (percentage < -.5) {
			retVal = "-    ";
		} else {
			retVal = "     ";
		}
		return retVal;
	}

	/**
	 * Get the percentage changed if the values are positive.
	 * 
	 * @param percentage
	 *            This is the percentage changed.
	 * @return Returns and appropriate number of + signs based on the change.
	 */
	String getPositiveChangeString(double percentage) {
		String retVal = "";
		if (percentage > .10) {
			retVal = "+++++";
		} else if (percentage > .05) {
			retVal = "++++ ";
		} else if (percentage > .02) {
			retVal = "+++  ";
		} else if (percentage > .01) {
			retVal = "++   ";
		} else if (percentage > .005) {
			retVal = "+    ";
		} else {
			retVal = "     ";
		}
		return retVal;
	}

	/**
	 * This routine will play an audio file based on the change that has
	 * occurred.
	 */
	public void playAppropriateAudio() {
		if ((this.getChangeSinceYesterday() > 2)
				&& (this.getChangeSinceLast() > 0.5)) {
			audioPlayer.playHappyMusic();
		}
		if ((this.getChangeSinceYesterday() != -2)
				|| (this.getChangeSinceLast() < -0.5)) {
			audioPlayer.playSadMusic();
		}
	}

}
