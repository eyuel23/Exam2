package demo;

import enumm.Size;

public class Cloth{
    private String name;
    private double price;
    private Size size;

    public Cloth(String name, double price, Size size){
        this.name=name;
        this.price=price;
        this.size=size;
    }

    public double getPrice(){
        return this.price;
    }

    public Size getSize() {
        return this.size;
    }


}
