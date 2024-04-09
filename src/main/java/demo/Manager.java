package demo;

import enumm.Size;

public class Manager extends Employee {
    private double salary;
    private final double EXTRA_DISCOUNT = 0.5;

    public Manager(String name, Size size, double salary) {
        super(name, size);
        this.salary = salary;
    }

    @Override
    public void printPriceAfterDiscount(Cloth c) {
        double originalPrice = c.getPrice();
        double specialDiscount = DISCOUNT + EXTRA_DISCOUNT;
        double discountedPrice = originalPrice * (1-specialDiscount);
        System.out.println("Price after discount:" + discountedPrice);
    }

    @Override
    public double calculatePay() {
        return salary;
    }
}
