package Assignment1_Week3_Coffee_Vending_Machine;

public class InvoiceCalculator {
    private static final double CGST_RATE = 0.025;
    private static final double SGST_RATE = 0.025;

    public double calculateCGST(double amount) {
        return roundToTwoDecimals(amount * CGST_RATE);
    }

    public double calculateSGST(double amount) {
        return roundToTwoDecimals(amount * SGST_RATE);
    }

    // Manual rounding without inbuilt methods
    private double roundToTwoDecimals(double value) {
        return (int)(value * 100 + 0.5) / 100.0;
    }
}
