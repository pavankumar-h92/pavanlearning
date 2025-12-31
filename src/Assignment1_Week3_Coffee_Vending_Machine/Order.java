package Assignment1_Week3_Coffee_Vending_Machine;

public class Order {

    private Coffee coffee;
    private int quantity;
    private int takeAway;

    private static final double TAKE_AWAY_CHARGE = 20;

    private InvoiceCalculator taxCalculator;

    public Order(Coffee coffee, int quantity, int takeAway) {
        this.coffee = coffee;
        this.quantity = quantity;
        this.takeAway = takeAway;
        this.taxCalculator = new InvoiceCalculator();
    }

    public double calculateSubTotal() {
        return coffee.getPrice() * quantity;
    }

    public double calculateTakeAwayCharge() {
        return takeAway == 1 ? TAKE_AWAY_CHARGE : 0.0;
    }

    public double calculateFinalAmount() {

        // Step 1: Subtotal
        double amount = calculateSubTotal();

        // Step 2: Take-away charge
        amount += calculateTakeAwayCharge();

        // Step 3 & 4: Taxes
        double cgst = taxCalculator.calculateCGST(amount);
        double sgst = taxCalculator.calculateSGST(amount);

        return amount + cgst + sgst;
    }

    public void printBill() {

        double subTotal = calculateSubTotal();
        double takeAwayCharge = calculateTakeAwayCharge();
        double taxableAmount = subTotal + takeAwayCharge;

        double cgst = taxCalculator.calculateCGST(taxableAmount);
        double sgst = taxCalculator.calculateSGST(taxableAmount);

        System.out.println("\n========= COFFEE BILL =========");
        System.out.println("Coffee       : " + coffee.getName());
        System.out.println("Quantity     : " + quantity);
        System.out.println("Subtotal     : " + subTotal);
        System.out.println("Take Away    : " + takeAwayCharge);
        System.out.println("CGST (2.5%)  : " + cgst);
        System.out.println("SGST (2.5%)  : " + sgst);
        System.out.println("--------------------------------");
        System.out.println("Total Amount : " + calculateFinalAmount());
        System.out.println("================================");
    }
}
