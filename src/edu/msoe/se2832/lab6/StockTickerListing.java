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
 * This class contains a listing of the stock symbols which are bgeing watched.
 * 
 */


package edu.msoe.se2832.lab6;

import java.util.Hashtable;

public class StockTickerListing extends Hashtable<String, String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method will return the SIngleton instance of the STock Ticker Listing.  If non exists, one will be created.
	 * @return The singleton instance of the stock ticker listing will be returned. 
	 */
	public static StockTickerListing getSingleton() {
		
		if (singleton == null)
		{
			synchronized(StockTickerListing.class)
			{
				if (singleton == null)
				{
					singleton = new StockTickerListing();
				}
			}
		}
		
		
		return singleton;
	}

	private static StockTickerListing singleton;

	public StockTickerListing() {
		super();
		this.put("COMS","3Comm Corp");
		  
		this.put("KDE","4 Kids Entertainment Inc.");
		  
		this.put("SVNX","724 Solutions Inc.");
		  
		this.put("ABT","Abbott Laboratories");
		  
		this.put("ANF","Abercrombie & Fitch Co.");
		  
		this.put("ABGX","Abgenix Inc.");
		  
		this.put("ADPT","Adaptec Inc");
		  
		this.put("ADBE","Adobe Systems Inc.");
		  
		this.put("ADIC","Advanced Digital Information");
		  
		this.put("AMD","Advanced Micro Devices");
		  
		this.put("ADVS","Advent Software Inc.");
		  
		this.put("ARXX","Aeroflex Inc.");
		  
		this.put("AES","AES Corp");
		  
		this.put("AET","Aetna Inc.");
		  
		this.put("AFFX","Affymetrix Inc.");
		  
		this.put("AFL","AFLAC Inc");
		  
		this.put("A","Agilent Technologies Inc.");
		  
		this.put("APD","Air Products & Chem");
		  
		this.put("AKAM","Akamai Technologies Inc.");
		  
		this.put("ACV","Alberto-Culver Cl'B'");
		  
		this.put("ABS","Albertson's, Inc");
		  
		this.put("AL","Alcan Aluminium Ltd");
		  
		this.put("AA","Alcoa Inc.");
		  
		this.put("ATI","Allegheny Technologies");
		  
		this.put("AGN","Allergan, Inc");
		  
		this.put("AW","Allied Waste Ind");
		  
		this.put("ALL","Allstate Corp");
		  
		this.put("AT","Alltel Corp");
		  
		this.put("ALTR","Altera Corp");
		  
		this.put("AMZN","Amazon.com Inc.");
		  
		this.put("AEP","Amer Electric Pwr");
		  
		this.put("AM","Amer Greetings Cl'A'");
		  
		this.put("AIG","Amer Intl Group");
		  
		this.put("APCC","Amer Power Conversion");
		  
		this.put("AHC","Amerada Hess");
		  
		this.put("AEE","Ameren Corp");
		  
		this.put("AEOS","American Eagle Outfitters Inc.");
		  
		this.put("AXP","American Express Company");
		  
		this.put("AMTD","Ameritrade Holding Corp.");
		  
		this.put("AMGN","Amgen Inc");
		  
		this.put("AMR","AMR Corp");
		  
		this.put("ASO","AmSouth Bancorp");
		  
		this.put("APC","Anadarko Petroleum");
		  
		this.put("ADI","Analog Devices Inc.");
		  
		this.put("ANDW","Andrew Corp");
		  
		this.put("ADRX","Andrx Corporation");
		  
		this.put("BUD","Anheuser-Busch Cos");
		  
		this.put("TWX","AOL Time Warner");
		  
		this.put("AOC","Aon Corp");
		  
		this.put("APA","Apache Corp");
		  
		this.put("AAPL","Apple Computer Inc.");
		  
		this.put("APPB","Applebees International Inc.");
		  
		this.put("AMAT","Applied Materials Inc.");
		  
		this.put("AMCC","Applied Micro Circuits Corp");
		  
		this.put("ADM","Archer-Daniels-Midland");
		  
		this.put("ARIA","Ariad Pharmaceuticals Inc.");
		  
		this.put("ARBA","Ariba Inc.");
		  
		this.put("ARW","Arrow Electronics Inc.");
		  
		this.put("ASH","Ashland Inc");
		  
		this.put("ASKJ","Ask Jeeves Inc.");
		  
		this.put("T","AT&T Corp");
		  
		this.put("AWE","AT&T Wireless Corp");
		  
		this.put("ADSK","Autodesk, Inc");
		  
		this.put("ADP","Automatic Data Proc");
		  
		this.put("AZO","AutoZone Inc");
		  
		this.put("AVY","Avery Dennison Corp");
		  
		this.put("AVA","Avista Corp");
		  
		this.put("AVP","Avon Products Inc.");
		  
		this.put("BHI","Baker Hughes Inc");
		  
		this.put("BLL","Ball Corp");
		  
		this.put("BAC","Bank of America");
		  
		this.put("BK","Bank of New York Inc.");
		  
		this.put("ONE","Bank One Corp");
		  
		this.put("BCR","Bard (C.R.)");
		  
		this.put("BKS","Barnes & Noble Inc.");
		  
		this.put("ABX","Barrick Gold");
		  
		this.put("BOL","Bausch & Lomb Inc.");
		  
		this.put("BAX","Baxter International");
		  
		this.put("BBT","BB&T Corp");
		  
		this.put("BCE","BCE Inc.");
		  
		this.put("BEAS","BEA Systems Inc.");
		  
		this.put("BSC","Bear Stearns Cos");
		  
		this.put("BDX","Becton, Dickinson");
		  
		this.put("BBBY","Bed Bath & Beyond Inc.");
		  
		this.put("BLS","BellSouth Corp");
		  
		this.put("BMS","Bemis Co");
		  
		this.put("BBY","Best Buy Co. Inc");
		  
		this.put("BLI","Big Lots Inc.");
		  
		this.put("BMET","Biomet, Inc");
		  
		this.put("BBH","Biotch Holders Trust");
		  
		this.put("BDK","Black & Decker Corp");
		  
		this.put("HRB","Block H & R Inc.");
		  
		this.put("BBI","Blockbuster Inc.");
		  
		this.put("BMC","BMC Software");
		  
		this.put("BA","Boeing Co.");
		  
		this.put("BCC","Boise Cascade");
		  
		this.put("BSX","Boston Scientific");
		  
		this.put("BP","BP Plc");
		  
		this.put("BGG","Briggs & Stratton");
		  
		this.put("BMY","Bristol-Myers Squibb");
		  
		this.put("BSY","British Sky Broadcasting");
		  
		this.put("BTY","British Telecommunications");
		  
		this.put("BRCM","Broadcom Corp'A'");
		  
		this.put("BRCD","Brocade Comm. Systems");
		  
		this.put("BC","Brunswick Corp");
		  
		this.put("BNI","Burlington Northn Santa Fe");
		  
		this.put("BR","Burlington Resources");
		  
		this.put("CPN","Calpine Corp");
		  
		this.put("CPB","Campbell Soup Co.");
		  
		this.put("COF","Capital One Financial");
		  
		this.put("CAH","Cardinal Health");
		  
		this.put("CCL","Carnival Corp");
		  
		this.put("CAT","Caterpillar Inc.");
		  
		this.put("CRA","Celera Genomics");
		  
		this.put("CELG","Celgene Corporation");
		  
		this.put("CD","Cendant Corp");
		  
		this.put("CTX","Centex Corp");
		  
		this.put("CTL","CenturyTel Inc");
		  
		this.put("CEN","Ceridian Corp");
		  
		this.put("CF","Charter One Finl");
		  
		this.put("CHKP","Checkpoint Software");
		  
		this.put("CVX","ChevronTexaco Corp");
		  
		this.put("CHL","China Telecommunications");
		  
		this.put("CHINA","CHINA China.com Corp");
		  
		this.put("CHIR","Chiron Corp");
		  
		this.put("CB","Chubb Corp");
		  
		this.put("CI","CIGNA Corp");
		  
		this.put("CINF","Cincinnati Financial");
		  
		this.put("CIN","CINergy Corp");
		  
		this.put("CC","Circuit City Strs-CrctCtyGrp");
		  
		this.put("CSCO","Cisco Systems Inc.");
		  
		this.put("C","Citigroup Inc.");
		  
		this.put("CTXS","Citrix Systems Inc.");
		  
		this.put("CCU","Clear Channel Comm.");
		  
		this.put("CLX","Clorox Co.");
		  
		this.put("CMGI","CMG Information Services Inc.");
		  
		this.put("CMS","CMS Energy");
		  
		this.put("CNET","CNET Inc.");
		  
		this.put("COKE","Coca-Cola Bottling Co.");
		  
		this.put("KO","Coca-Cola Co");
		  
		this.put("CCE","Coca-Cola Enterprises");
		  
		this.put("CL","Colgate-Palmolive Co.");
		  
		this.put("CMCSK","CMCSK Comcast Cl'A'Spl(non-vtg)");

		this.put("CMA","Comerica Inc");

		this.put("CMRC","Commerce One Inc.");

		this.put("CA","Computer Assoc Intl");

		this.put("CSC","Computer Sciences");

		this.put("CPWR","Compuware Corp");

		this.put("CMVT","Comverse Technology");

		this.put("CAG","ConAgra Inc");

		this.put("ED","Consolidated Edison");

		this.put("CEG","Constellation Energy Group");

		this.put("CAL","Continental Airlines");

		this.put("CVG","Convergys Corp");

		this.put("CBE","Cooper Indus");

		this.put("CTB","Cooper Tire & Rubber");

		this.put("RKY","Coors (Adolph)Cl'B'");

		this.put("GLW","Corning Inc.");

		this.put("COST","Costco Wholesale");

		this.put("COX","Cox Communications Inc.");

		this.put("CR","Crane Co");

		this.put("CREE","Cree Research Inc.");

		this.put("CCK","Crown Cork & Seal");

		this.put("CSX","CSX Corp");

		this.put("CRGN","Curagen Corp");

		this.put("CVS","CVS Corporation");

		this.put("CYTO","Cytogen Corp");

		this.put("DCX","Daimler Benz & Chrysler");

		this.put("DCN","Dana Corp");

		this.put("DHR","Danaher Corp");

		this.put("DRI","Darden Restaurants");

		this.put("DE","Deere & Co.");

		this.put("DELL","Dell Computer Corp");

		this.put("DPH","Delphi Automotive Systems");

		this.put("DAL","Delta Air Lines Inc.");

		this.put("DEL","Deltic Timber Corp.");

		this.put("DLX","Deluxe Corp");

		this.put("DIA","Diamonds Trust");

		this.put("DDS","Dillard's Inc'A'");

		this.put("DIS","Disney Walt Co.");

		this.put("DVSA","Diversa Corp");

		this.put("DG","Dollar General");

		this.put("DLTR","Dollar Tree Stores Inc.");

		this.put("D","Dominion Resources");

		this.put("DCLK","Doubleclick Inc.");

		this.put("DOV","Dover Corp");

		this.put("DOW","Dow Chemical Co.");

		this.put("DJ","Dow Jones Company Inc.");

		this.put("DRYR","Dreyers Grand Ice Cream Inc.");

		this.put("DTE","DTE Energy");

		this.put("DUK","Duke Energy Corporation");

		this.put("DNB","Dun & Bradstreet");

		this.put("DD","DuPont de Nemours EI & Co.");

		this.put("DPMI","DuPont Photomasks Inc.");

		this.put("ELNK","Earthlink Network Inc.");

		this.put("EMN","Eastman Chemical");

		this.put("EK","Eastman Kodak Co.");

		this.put("ETN","Eaton Corp");

		this.put("EBAY","Ebay Inc.");

		this.put("ELON","Echelon Corp.");

		this.put("DISH","Echostar Communications");

		this.put("ECL","Ecolab Inc");

		this.put("EIX","Edison Intl");

		this.put("ERTS","Electronic Arts Inc.");

		this.put("EDS","Electronic Data Systems");

		this.put("EMC","EMC Corporation");

		this.put("EMR","Emerson Electric");

		this.put("EC","Engelhard Corp");

		this.put("ETR","Entergy Corp");

		this.put("ENZ","Enzo Biochem Inc.");

		this.put("EFX","Equifax Inc");

		this.put("ERICY","Ericsson Telephone Company");

		this.put("ET","E-Trade Group Inc.");

		this.put("XOM","Exxon Mobil Corporation");

		this.put("FRE","Federal Home Loan");

		this.put("FNM","Federal Natl Mtge");

		this.put("FD","Federated Dept Stores");

		this.put("FDX","FedEx Corp");

		this.put("FITB","Fifth Third Bancorp");

		this.put("FDC","First Data");

		this.put("FE","FirstEnergy Corp");

		this.put("FLEX","Flextronics Intl. Ltd.");

		this.put("FLR","Fluor Corp");

		this.put("FMC","FMC Corp");

		this.put("F","Ford Motor Co.");

		this.put("FO","Fortune Brands");

		this.put("FOSL","Fossil Inc.");

		this.put("FDRY","Foundry Networks SE");

		this.put("FOX","Fox Entertainment Group");

		this.put("FPL","FPL Group Inc.");

		this.put("BEN","Franklin Resources");

		this.put("FCX","Freep't McMoRan Copper");

		this.put("FCEL","FuelCell Energy Inc.");
		
		this.put("FUN", "Cedar Fair");

		this.put("GCI","Gannett Co");

		this.put("GPS","Gap Inc.");

		this.put("GTW","Gateway Inc");

		this.put("DNA","Genentech");

		this.put("GM","General Motors Corp");

		this.put("GD","Genl Dynamics");

		this.put("GE","Genl Electric");

		this.put("GIS","Genl Mills");

		this.put("OSCI","Genome Therapeutics Corp");

		this.put("GPC","Genuine Parts");

		this.put("GP","Georgia-Pacific (Ga-Pac Grp)");

		this.put("G","Gillette Co.");

		this.put("GDW","Golden West Finl");

		this.put("GR","Goodrich (B.F.)");

		this.put("GT","Goodyear Tire & Rubber Co.");

		this.put("GOOG","Google, Inc.");

		this.put("GRA","Grace (W.R.) & Co");

		this.put("GWW","Grainger (W.W.)");

		this.put("GAP","Great Atlantic & Pacific Tea");

		this.put("GLK","Great Lakes Chemical");

		this.put("GES","Guess ?, Inc.");

		this.put("GDT","Guidant Corp");

		this.put("HAL","Halliburton Co");

		this.put("HDI","Harley-Davidson");

		this.put("HET","Harrah's Entertainment");

		this.put("HIG","Hartford Finl Svcs Gp");

		this.put("HAS","Hasbro Inc.");

		this.put("HCA","HCA-The Healthcare Co.");

		this.put("HLTH","Healtheon Corp");

		this.put("HNZ","Heinz H.J. Co.");

		this.put("HELX","Helix Technology Inc.");

		this.put("HP","Helmerich & Payne Inc.");

		this.put("HPC","Hercules, Inc");

		this.put("HSY","Hershey Foods Corp");

		this.put("HLT","Hilton Hotels Corp");

		this.put("HD","Home Depot Inc.");

		this.put("HMC","Honda Motor Co. Ltd.");

		this.put("HON","Honeywell Intl");

		this.put("HOTT","Hot Topic Inc.");

		this.put("HGSI","Human Genome Sciences");

		this.put("HUM","Humana Inc");

		this.put("HBAN","Huntington Bancshares");

		this.put("ITW","Illinois Tool Works");

		this.put("RX","IMS Health");

		this.put("N","Inco Ltd");

		this.put("INCY","Incyte Pharmaceuticals Inc.");

		this.put("INSP","Infospace.com");

		this.put("INFY","Infosys Tech Ltd.");

		this.put("IR","Ingersoll-Rand");

		this.put("INTC","Intel Corp");

		this.put("ICGE","Internet Cap Group Inc.");

		this.put("IPG","Interpublic Grp Cos");

		this.put("ISIL","Intersil Holding Corp");

		this.put("INTL","Inter-Tel Inc.");

		this.put("IBM","Intl Bus. Machines");

		this.put("IFF","Intl Flavors/Fragr");

		this.put("IP","Intl Paper");

		this.put("INTU","Intuit Inc.");

		this.put("ITT","ITT Industries");

		this.put("JBL","Jabil Circuit Inc.");

		this.put("JKHY","Jack Henry & Associates Inc.");

		this.put("JBX","Jack in the Box Inc.");

		this.put("JP","Jefferson-Pilot");

		this.put("JNJ","Johnson & Johnson");

		this.put("JCI","Johnson Controls");

		this.put("JNPR","Juniper Networks Inc.");

		this.put("KBH","Kaufman & Broad Home");

		this.put("KEI","Keithley Instruments Inc.");
	
		this.put("KOSS", "Koss Corporation");
		
		this.put("KELYB", "Kelly Services, Inc.");

		this.put("K","Kellogg Co.");

		this.put("KMG","Kerr-McGee");

		this.put("KEY","KeyCorp");

		this.put("KEYN","Keynote Systems Inc.");

		this.put("KMB","Kimberly-Clark");

		this.put("KLAC","Kla-Tencor Corp.");

		this.put("KRI","Knight-Ridder Inc");

		this.put("KSS","Kohl's Corp");

		this.put("KKD","Krispy Kreme Doughnuts Inc.");

		this.put("KR","Kroger Co.");

		this.put("KSWS","K-Swiss Inc.");

		this.put("KYO","Kyocera Corp");

		this.put("LRCX","Lam Research Corp");

		this.put("LEG","Leggett & Platt");

		this.put("LEH","Lehman Br Holdings");

		this.put("LXK","Lexmark Intl'A'");

		this.put("LLY","Lilly (Eli)");

		this.put("LNC","Lincoln Natl Corp");

		this.put("LLTC","Linear Technology Corp");

		this.put("LIZ","Liz Claiborne Inc.");

		this.put("LMT","Lockheed Martin Corp");

		this.put("LTR","Loews Corp");

		this.put("LDG","Longs Drug Stores");

		this.put("LPX","Louisiana Pacific");

		this.put("LOW","Lowe's Cos");

		this.put("HCR","Manor Care");

		this.put("MAR","Marriott Intl 'A'");

		this.put("MMC","Marsh & McLennan");

		this.put("MSO","Martha Stewart Living");

		this.put("MAS","Masco Corp");

		this.put("MONE","Matrixone Inc.");

		this.put("MAT","Mattel, Inc");

		this.put("MXIM","Maxim Integrated Products");

		this.put("MAY","May Dept Stores");

		this.put("MYG","Maytag Corporation");

		this.put("MBI","MBIA Inc");

		this.put("KRB","MBNA Corp");

		this.put("MDR","McDermott Intl");

		this.put("MCD","McDonalds Corp");

		this.put("MHP","McGraw-Hill Companies");

		this.put("MCK","McKesson HBOC");

		this.put("MEDX","Medarex Inc.");

		this.put("MEDI","Medimmune Inc.");

		this.put("MDT","Medtronic, Inc");

		this.put("MEL","Mellon Financial");

		this.put("MRK","Merck & Co. Inc.");

		this.put("MERQ","Mercury Interactive Corp");

		this.put("MDP","Meredith Corp");

		this.put("MER","Merrill, Lynch & Co. Inc.");

		this.put("MET","MetLife Inc.");

		this.put("MGM","Metro-Goldwyn-Mayer Inc.");

		this.put("MTG","MGIC Investment");

		this.put("MGG","MGM Grand Inc.");

		this.put("MU","Micron Technology Inc.");

		this.put("MSFT","Microsoft Corp");

		this.put("MSTR","Microstrategy");

		this.put("MLNM","Millenium Pharmaceuticals");

		this.put("MIL","Millipore Corp");

		this.put("MMM","Minnesota Min'g/Mfg");

		this.put("MOLX","Molex Inc");

		this.put("JPM","Morgan J.P. & Co. Inc.");

		this.put("MWD","Morgan Stan Dean Witter");

		this.put("MOT","Motorola, Inc");

		this.put("MYGN","Myriad Genetics Inc.");

		this.put("QQQ","Nasdaq-100 Trust");

		this.put("NCC","Natl City Corp");

		this.put("NSM","Natl Semiconductor");

		this.put("NAV","Navistar Intl");

		this.put("NCR","NCR Corp");

		this.put("NTAP","Network Appliance Corp.");

		this.put("NYT","New York Times Co.");

		this.put("NWL","Newell Rubbermaid");

		this.put("NEM","Newmont Mining");

		this.put("NEWP","Newport Corp");

		this.put("NXTL","NEXTEL Communic'ns'A'");

		this.put("NXTP","Nextel Partners Inc.");

		this.put("GAS","NICOR Inc");

		this.put("NKE","NIKE, Inc Cl'B'");

		this.put("NIKU","Niku Corp");

		this.put("NOK","Nokia Crop");

		this.put("JWN","Nordstrom, Inc");

		this.put("NSC","Norfolk Southern");

		this.put("NTRS","Northern Trust");

		this.put("NOC","Northrop Grumman");

		this.put("NOVL","Novell Inc.");

		this.put("NVLS","Novellus Systems");

		this.put("NUE","Nucor Corp");

		this.put("NVDA","Nvidia Corp");

		this.put("OO","Oakley Inc.");

		this.put("OXY","Occidental Petrol'm");

		this.put("ODP","Office Depot Inc.");

		this.put("OMC","Omnicom Group");

		this.put("OKE","ONEOK Inc");

		this.put("ONVI","Onvia.com Inc.");

		this.put("ORCL","Oracle Corporation");

		this.put("OSIS","OSI Systems Inc.");

		this.put("OSI","Outback Steakhouse Inc.");

		this.put("OI","Owens-Illinois");

		this.put("PCAR","PACCAR Inc");

		this.put("PSUN","Pacific Sunwear of California Inc.");

		this.put("PTV","Pactiv Corp");

		this.put("PLL","Pall Corp");

		this.put("PZZA","Papa Johns Intl. Inc.");

		this.put("PMTC","Parametric Technology");

		this.put("PH","Parker-Hannifin");

		this.put("PAYX","Paychex Inc");

		this.put("PSS","Payless Shoesource Inc.");

		this.put("CRA","PE-Celera Genomics");

		this.put("JCP","Penny J.C. Co. Inc.");

		this.put("PGL","Peoples Energy");

		this.put("PSFT","PeopleSoft Inc.");

		this.put("PBY","Pep Boys Manny Moe & Jack");

		this.put("PBG","Pepsi Bottling Group");

		this.put("PEP","Pepsico Inc.");

		this.put("PKI","PerkinElmer Inc");

		this.put("PFE","Pfizer, Inc");

		this.put("PCG","PG&E Corporation");

		this.put("PD","Phelps Dodge Corp");

		this.put("MO","Philip Morris Cos");

		this.put("PHG","Philips Electronics Holding Co.");

		this.put("PNW","Pinnacle West Capital");

		this.put("PBI","Pitney Bowes");

		this.put("PIXR","Pixar Inc.");

		this.put("PDG","Placer Dome Inc");

		this.put("PLUG","Plug Power Co.");

		this.put("PMCS","PMC Sierra Inc.");

		this.put("PNC","PNC Financial Services Group");

		this.put("RL","Polo Ralph Lauren Corporation");

		this.put("PCH","Potlatch Corp");

		this.put("PWAV","Powerwave Technologies Inc.");

		this.put("PPG","PPG Indus");

		this.put("PPL","PPL Corp");

		this.put("PX","Praxair Inc");

		this.put("PCLN","Priceline.com Inc.");

		this.put("PG","Procter & Gamble Co.");

		this.put("PGR","Progressive Corp,Ohio");

		this.put("PDLI","Protein Design Labs Inc.");

		this.put("PVN","Providian Financial");

		this.put("PEG","Public Svc Enterpr");

		this.put("PHM","Pulte Corp");

		this.put("QGENF","Qiagen");

		this.put("QLGC","Qlogic Corp");

		this.put("QLTI","QLT Phototherapeutics");

		this.put("QCOM","Qualcomm Inc.");

		this.put("QSFT","Quest Software Inc.");

		this.put("ZQK","Quicksilver Inc.");

		this.put("RSH","RadioShack Corp");

		this.put("RMBS","Rambus Inc.");

		this.put("RTN","Raytheon Co'B'");

		this.put("RHAT","Red Hat Inc.");

		this.put("RBK","Reebok Intl");

		this.put("REGN","Regeneron Pharmaceuticals");

		this.put("RCOM","Register.com Inc.");

		this.put("RIMM","Research in Motion Ltd.");

		this.put("RMD","Resmed Inc.");

		this.put("RFMD","RF Micro Devices Inc.");

		this.put("ROK","Rockwell Intl");

		this.put("ROH","Rohm & Haas");

		this.put("RDC","Rowan Cos");

		this.put("RD","Royal Dutch Petrol ADR");

		this.put("RML","Russell Corp");

		this.put("R","Ryder System");

		this.put("TSG","SABRE Holdings'A'");

		this.put("SAFC","SAFECO Corp");

		this.put("SWY","Safeway Inc.");

		this.put("SLAB","Sage Laboratories Inc.");

		this.put("SNDK","Sandisk Corp");

		this.put("SANM","Sanmina Corp");

		this.put("SAPE","Sapient Corp");

		this.put("SLE","Sara Lee Corp");

		this.put("SBC","SBC Communications Inc.");

		this.put("SGP","Schering-Plough");

		this.put("SLB","Schlumberger Ltd");

		this.put("SCH","Schwab(Charles)Corp");

		this.put("SFA","Scientific-Atlanta");

		this.put("SEE","Sealed Air");

		this.put("S","Sears-Roebuck");

		this.put("SRE","Sempra Energy");

		this.put("SC","Shell Trans. & Trading Ltd.");

		this.put("SHW","Sherwin-Williams");

		this.put("SEBL","Siebel Systems Inc.");

		this.put("SIAL","Sigma-Aldrich");

		this.put("SILI","Siliconix Inc.");

		this.put("SKX","Skechers USA Inc.");

		this.put("SLM","SLM Holding");

		this.put("SNA","Snap-On Inc");

		this.put("SNE","Sony Corp");

		this.put("SO","Southern Co");

		this.put("SOTR","SouthTrust Corp");

		this.put("LUV","Southwest Airlines Co.");

		this.put("FON","Sprint Corp(FON Group)");

		this.put("STJ","St. Jude Medical");

		this.put("SWK","Stanley Works");

		this.put("SPLS","Staples Inc.");

		this.put("SBUX","Starbucks Corporation");

		this.put("STT","State Street Corp");

		this.put("SUN","Sunoco Inc");

		this.put("STI","Suntrust Banks Inc.");

		this.put("SVU","Supervalu Inc");

		this.put("SBL","Symbol Technologies Inc.");

		this.put("SNV","Synovus Financial");

		this.put("SYY","Sysco Corp");

		this.put("TROW","T.Rowe Price Assoc");

		this.put("TGT","Target Corp");

		this.put("TEK","Tektronix Inc");

		this.put("TLAB","Tellabs, Inc");

		this.put("TIN","Temple-Inland");

		this.put("THC","Tenet Healthcare");

		this.put("TER","Teradyne Inc");

		this.put("TXN","Texas Instruments");

		this.put("TXT","Textron, Inc");

		this.put("LTD","The Limited Inc.");

		this.put("TMO","Thermo Electron");

		this.put("TNB","Thomas & Betts");

		this.put("TIBX","Tibco Software");

		this.put("TIF","Tiffany & Co.");

		this.put("TBL","Timberland Co.");

		this.put("TKR","Timken Co");

		this.put("TTN","Titan Corp");

		this.put("TJX","TJX Companies");

		this.put("TOM","Tommy Hilfiger Corp");

		this.put("TMK","Torchmark Corp");

		this.put("TM","Toyota Motor Corp");

		this.put("TOY","Toys R Us Inc.");

		this.put("RIG","Transocean Sedco Forex");

		this.put("TRB","Tribune Co.");

		this.put("YUM","Tricon Global Restaurants Inc.");

		this.put("TUP","Tupperware Corp");

		this.put("TXU","TXU Corp");

		this.put("TYC","Tyco Labs Inc.");

		this.put("USB","U.S. Bancorp");

		this.put("UN","Unilever N.V.");

		this.put("UNP","Union Pacific");

		this.put("UPC","Union Planters");

		this.put("UIS","Unisys Corp");

		this.put("UPS","United Parcel Services Inc.");

		this.put("USM","United States Cellular Corp");

		this.put("UTX","United Technologies Corp");

		this.put("UNH","UnitedHealth Group");

		this.put("UVV","Universal Corp.");

		this.put("UVN","Univision Communications");

		this.put("UCL","Unocal Corp");

		this.put("UNM","UnumProvident Corp");

		this.put("UST","UST Inc");

		this.put("MRO","USX-Marathon Grp");

		this.put("X","USX-U.S. Steel Group");

		this.put("UTSI","Utstarcom Inc.");

		this.put("VANS","Vans Inc.");

		this.put("VRSN","Verisign Inc.");

		this.put("VZ","Verizon Communications");

		this.put("VRTS","Vertas Software Corp");

		this.put("VFC","VF Corp");

		this.put("VIA","Viacom Inc.");

		this.put("VC","Visteon Corp");

		this.put("VOD","Vodafone Group");

		this.put("VMC","Vulcan Materials");

		this.put("WB","Wachovia Corp");

		this.put("WAG","Walgreen Company");

		this.put("WMT","Wal-Mart Stores Inc.");

		this.put("WM","Washington Mutual Inc.");

		this.put("WMI","Waste Management");

		this.put("WPI","Watson Pharmaceuticals");

		this.put("WLP","Wellpoint Hlth Networks");

		this.put("WFC","Wells Fargo & Company");

		this.put("WEN","Wendy's Intl");

		this.put("WY","Weyerhaeuser Co");

		this.put("WHR","Whirlpool Corp");

		this.put("WMB","Williams Cos");

		this.put("WNR", "Western Refining");
		
		this.put("WOR","Worthington Indus");

		this.put("WWY","Wrigley, (Wm) Jr");

		this.put("WWE","Wrld Wrestling Fed. Ent.");

		this.put("XRX","Xerox Corporation");

		this.put("XLNX","Xilinx Inc.");

		this.put("YHOO","Yahoo Inc.");

		this.put("ZIGO","Zygo Corp");
		
		this.put("SIX", "Six Flags");

		this.put("CRWN", "Crown Media Holdings, Inc.");
		
	}

	/**
	 * @param symbol This is the stock symbol that is to be checked.
	 * @return True is returned if the symbol is valid.  False otherwise.
	 */
	public boolean isValidTickerSymbol(String symbol) {
		return this.containsKey(symbol);
	}
	
	/**
	 * @param symbol This is the symbol to be searched for.
	 * @return This is the name of the company related to the symbol.
	 */
	public String getCompanyName(String symbol)
	{
		return this.get(symbol);
	}
}
