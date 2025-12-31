package Assignement2_Week3;

import java.util.List;

class TakeAwayOrder extends Order {

    private static final double PACKING_CHARGE = 30.0;

    public TakeAwayOrder(List<MenuItem> menuItems) {
        super(menuItems);
    }

    @Override
    public double getPackingCharge() {
        return PACKING_CHARGE;
    }

    @Override
    public String getOrderType() {
        return "Take Away";
    }
}
