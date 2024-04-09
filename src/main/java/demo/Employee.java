package demo;

import enumm.Size;

public abstract class Employee extends Customer implements Payable {
    protected final double DISCOUNT = 0.10;

    public Employee(String name, Size size) {
        super(name, size);
    }
}
