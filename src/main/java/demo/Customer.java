package demo;

import enumm.Size;

public abstract class Customer extends Person {

    private Cloth[] clothingItems;
    public Customer(String name, Size size) {
        super(name, size);
    }
    public abstract void printPriceAfterDiscount(Cloth c);
    @Override
    public void printInfo() {
        System.out.println("Customer Name is " + getName() + " and size of " + getSize());

    }
}
