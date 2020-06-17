package util4;

public class CurrencyConverter {

	public static double dollar(double price, double bought) {
		return ((bought + (bought * (6.0/100))) * price);

	}
}
