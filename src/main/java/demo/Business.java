package demo;

public class Business implements Payable{
    private String name;
    private int productQtySupplied;
    private double productPrice;
    public Business(String name, int productQtySupplied, double productPrice) {
        this.name = name;
        if(productPrice>0 && productQtySupplied>0){
            this.productQtySupplied = productQtySupplied;
            this.productPrice = productPrice;
        }else {
            System.out.println("Please set an appropriate value");
        }

    }

    @Override
    public double calculatePay() {
        return productPrice*productQtySupplied;
    }
}
