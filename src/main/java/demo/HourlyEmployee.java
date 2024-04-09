package demo;

import enumm.Size;

public class HourlyEmployee extends Employee {
    private float hoursWorked;
    private double hourlyWage;
    public HourlyEmployee(String name, Size size, double hourlyWage, float hoursWorked) {
        super(name, size);
        this.hourlyWage=hourlyWage;
        this.hoursWorked=hoursWorked;
    }

    public double getHourlyWage() {
        return this.hourlyWage;
    }

    @Override
    public void printPriceAfterDiscount(Cloth c) {
        double originalPrice = c.getPrice();
        double discountedPrice = originalPrice * (1-DISCOUNT);
        System.out.println("Price after discount:" + discountedPrice);
    }


    @Override
    public double calculatePay() {
        return hoursWorked*hourlyWage;
    }
}
