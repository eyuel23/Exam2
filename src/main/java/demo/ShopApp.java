package demo;

public class ShopApp {
    public static boolean isAFit(Customer customer, Cloth c){
        return customer.getSize() == c.getSize();
    };
    public static double calculateSubTotal(Cloth[] cloths){
        double subtotal = 0.0;
        for (Cloth cloth : cloths) {
            subtotal += cloth.getPrice();
        }
        return subtotal;
    }
    public static void printClassNamesOfPayableEntities(Payable[] p){
        for (Payable payable : p) {
            if (payable != null) {
                System.out.println(payable.getClass().getSimpleName());
            }
    }
}
}
