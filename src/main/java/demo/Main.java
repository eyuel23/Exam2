package demo;

import enumm.Size;

public class Main {
    public static void main(String[] args) {

        // Q1
        Cloth[] cloths = new Cloth[] {
                new Cloth("Jeans", 20.00, Size.MEDIUM),
                new Cloth("T-shirt", 15.00, Size.SMALL),
                new Cloth("Jacket", 25.00, Size.LARGE)  };

        //Q2
        double total = ShopApp.calculateSubTotal(cloths);
        System.out.println(total);

        //Q3a
        Student student1 = new Student("Eyuel", Size.MEDIUM);
        Student student2 = new Student("Mikaila", Size.EXTRA_LARGE);

        //Q3b
        student1.printUniqueStudentID();
        student2.printUniqueStudentID();
        student1.printUniqueStudentID();

        //Q4
        student2.printInfo();

        //Q5
        boolean checkFit = ShopApp.isAFit(student1, cloths[2]);
        System.out.println(checkFit);

        //Q6
        Manager manager = new Manager("Juan", Size.MEDIUM, 20000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Eyuel", Size.MEDIUM, 40.00, 12f);
        Business business = new Business("Rice", 10, 50.00);

        //Q7a
        Customer[] customers = new Customer[]{manager, hourlyEmployee, student1};

        //Q7b
        for (Customer customer : customers){
            customer.printPriceAfterDiscount(cloths[0]);
        }

        //Q8a
        Business business2 = new Business("Target", 50, -100);

        //Q8b
        double pay = business.calculatePay();
        System.out.println(pay);

        //Q9a
        Payable[] payables = new Payable[] {manager, hourlyEmployee, business};

        //Q9b
        ShopApp.printClassNamesOfPayableEntities(payables);

        //Q10a
        Employee managerToHourlyEmployee = new HourlyEmployee("Alice", Size.LARGE, 40.00, 12f );

        //Q10b

        System.out.println(((HourlyEmployee) managerToHourlyEmployee).getHourlyWage());

    }

}

