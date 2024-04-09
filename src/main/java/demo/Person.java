package demo;

import enumm.Size;

public abstract class Person {
    private String name;
    private Size size;
    public Person(String name, Size size) {
        this.name = name;
        this.size = size;
    }
    public String getName(){
        return this.name;
    }
    public Size getSize(){
        return this.size;
    }
    public abstract void printInfo();
}
