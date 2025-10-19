package ua.opnu.inheritance.bill;

import ua.opnu.java.inheritance.bill.Bill;
import ua.opnu.java.inheritance.bill.Employee;
import ua.opnu.java.inheritance.bill.Item;

public class DiscountBill extends Bill {
    private boolean preferred; // чи є покупець "постійним"
    private double discountAmount;
    private int discountCount;

    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.preferred = preferred;
    }

    @Override
    public void add(Item i) {
        super.add(i);
        if (preferred && i.getDiscount() > 0) {
            discountCount++;
            discountAmount += i.getDiscount();
        }
    }

    @Override
    public double getTotal() {
        double total = 0;
        for (Item item : getItems()) {
            total += item.getPrice();
        }
        if (preferred) total -= discountAmount;
        return total;
    }

    public int getDiscountCount() {
        return preferred ? discountCount : 0;
    }

    public double getDiscountAmount() {
        return preferred ? discountAmount : 0.0;
    }

    public double getDiscountPercent() {
        if (!preferred) return 0.0;
        double total = 0;
        for (Item item : getItems()) total += item.getPrice();
        return total == 0 ? 0.0 : (discountAmount / total) * 100;
    }
}
