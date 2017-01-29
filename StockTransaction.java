import java.text.DecimalFormat;
public class StockTransaction {
	public static void main(String[] args)
	{
		final double COMMISSION_RATE = .02;
		double stock = 1000;
		double costOfStock = 1000 * 32.87;
		double commissionOnBuy = costOfStock * COMMISSION_RATE;
		double costOfSoldStock = stock * 33.92;
		double commissionOnSale = costOfSoldStock * COMMISSION_RATE;
		double totalPaid = costOfStock + commissionOnBuy + commissionOnSale;
		double profit = costOfSoldStock - totalPaid;
		
		DecimalFormat format = new DecimalFormat("#0.00");
		
		System.out.println("The amount of money Joe paid for the stock: $" + costOfStock);
		System.out.println("The amount of commission Joe paid his broker when he bought the stock: $" + commissionOnBuy);
		System.out.println("The amount Joe sold the stock for: $" + costOfSoldStock);
		System.out.println("The amount of commission Joe paid his broker when he sold the stock: $" + commissionOnSale);
		System.out.println("The amount of profit Joe made after selling the stock and paying the two commissions: $" + format.format(profit));
		
		
	}

}
