package demo;

import enumm.Size;

public class Student extends Customer{

    public  long studentId;
    public static int uniqueID = 100;
    private final double DISCOUNT = 0.5;
    public Student(String name, Size size) {
        super(name, size);
        uniqueID++;
        studentId = uniqueID;
    }
    public void printUniqueStudentID(){
        System.out.println(studentId);
    };

    @Override
    public void printPriceAfterDiscount(Cloth c) {
        double originalPrice = c.getPrice();
        double discountedPrice = originalPrice * (1-DISCOUNT);
        System.out.println("Price after discount:" + discountedPrice);
    }
    @Override
    public void printInfo() {
        System.out.println("Student Name is " + getName() + " and size of " + getSize()+ " and has an ID of " + uniqueID);
    }
}
