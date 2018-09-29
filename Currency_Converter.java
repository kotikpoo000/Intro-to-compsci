
import javax.swing.JOptionPane;
public class Currency_Converter 
{
	
	public static void main(String[]args) 
	{
		
	
		// Variable declarations
		double USD;
		String str;
		
		// Variable declarations used for calculations
		double EUR, GBP, JPY, CHF, CAD, XBT, XAU, PKR, INR;
		//Create input box
		str = 
				JOptionPane.showInputDialog("Please enter the amount" +
		                                     "you want to convert");
		
		USD = Double.parseDouble(str);
		
		//Calculations that will be later used in JAVAX output
		
		EUR = USD * 1.166700; //done
		GBP = USD * 1.318400; //done
		JPY = USD * 112.35 ; //done
		CHF = USD * 0.968350;  //done
		CAD = USD * 1.294700;   
		XBT = USD * 0.000156438;
		XAU = USD * 0.0832538;
		PKR = USD * 124.236200;
		INR = USD * 72.678100;		
				
				JOptionPane.showMessageDialog(null, "Here is the amount converted" + "\n" + 
												" (EUR) Euro: 					" + EUR + "\n" +
												" (GPB) Great Britain Pound(s): " + GBP + "\n" +
												" (JPY) Japenese Yen:			" + JPY + "\n" +
												" (CHF) Swiss Francs:			" + CHF + "\n" +
												" (CAD) Canadian Dollars:		" + CHF + "\n" +
												" (XBT) Bit Coin:				" + XBT + "\n" +
												" (XAU) Gold Ounce(s):			" + XAU + "\n" +
												" (PKR) Pakistani Rupees:		" + PKR + "\n" +
												" (INR) Indian Rupees:			" + INR ); 
	}
}

/*
System.out.println(
		"$" + USdollar + " US Dollars(USD) =\n" +
		"---------------------------------------------------\n" +
		"(EUR) Euro:						" + (1.166700 * USdollar) + "\n" +
		"(GBP) Great Britain Pound(s): 				" + (1.318400 * USdollar) + "\n" +
		"(JPY) Japenese Yen:					" + (112.350000 * USdollar) + "\n" +
		"(CHF) Swiss Francs:					" + (0.968350 * USdollar) + "\n" +	
		"(CAD) Canadian Dollars:					" + (1.294700 * USdollar) + "\n" +	
		"(XBT) Bit Coin:						" + (0.000156438 * USdollar) + "\n" +	
		"(XAU) Gold Ounce(s):					" + (0.0832538 * USdollar) + "\n" +	
		"(PKR) Pakistani Rupees:					" + (124.236200 * USdollar) + "\n" +	
		"(INR) Indian Rupees:					" + (72.678100 * USdollar) + "\n"
		);

System.out.printf("(EUR) Euro: %.2f						", (1.166700 * USdollar), "\n");
System.out.printf("(EUR) Euro: %.2f						", (1.166700 * USdollar), "\n");
System.out.printf("(EUR) Euro: %.2f						", (1.166700 * USdollar), "\n");
System.out.printf("(EUR) Euro: %.2f						", (1.166700 * USdollar), "\n");
System.out.printf("(EUR) Euro: %.2f						", (1.166700 * USdollar), "\n");
System.out.printf("(EUR) Euro: %.2f						", (1.166700 * USdollar), "\n");

scan.close();
}

}
*/
