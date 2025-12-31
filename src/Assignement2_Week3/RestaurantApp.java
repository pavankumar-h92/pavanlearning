package Assignement2_Week3;

import java.util.ArrayList;
import java.util.List;

public class RestaurantApp {
    public static void main(String[] args) {

        List<MenuItem> items = new ArrayList<>();
        items.add(new MenuItem("Mudde_Spl-Meals", 200));
        items.add(new MenuItem("SouthMeals", 150));
        items.add(new MenuItem("Cold Drink", 60));

        // Select order type
        Order order = new TakeAwayOrder(items);
        // Order order = new DineInOrder(items);

        System.out.println("\n----BILL DETAILS"+"-------------");
        System.out.println("Order Type      : " + order.getOrderType());
        System.out.println("Subtotal        : " + order.calculateSubTotal());
        System.out.println("CGST + SGST (18%): " + order.calculateTax());
        System.out.println("Packing Charge  : " + order.getPackingCharge());
        System.out.println("Total Bill      : " + order.calculateFinalBill());
    }
}
