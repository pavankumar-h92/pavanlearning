package Assignement2_Week3;

import java.util.List;

class DineInOrder extends Order {

    public DineInOrder(List<MenuItem> menuItems) {
        super(menuItems);
    }

    @Override
    public String getOrderType() {
        return "Dine In";
    }
}