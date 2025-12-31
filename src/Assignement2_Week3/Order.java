package Assignement2_Week3;

import java.util.List;

abstract class Order {

    protected List<MenuItem> menuItems;

    protected static final double CGST = 0.025;
    protected static final double SGST = 0.025;

    public Order(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // Calculate subtotal from menu items
    public double calculateSubTotal() {
        double total = 0;
        for (MenuItem item : menuItems) {
            total += item.getPrice();
        }
        return total;
    }

    // Common tax logic
    public double calculateTax() {
        double tax= calculateSubTotal() * (CGST + SGST);
        return Math.round(tax * 100.0) / 100.0;
    }

    // Default packing charge
    public double getPackingCharge() {
        return 0;
    }

    // Final bill
    public double calculateFinalBill() {
        return calculateSubTotal() + calculateTax() + getPackingCharge();
    }

    public abstract String getOrderType();
}
