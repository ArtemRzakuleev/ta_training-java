package com.epam.training.student_artem_rzakuleev.classes;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String [] args){
        Customer[] customers=new Customer[]{
                new Customer(1,"Ivanov","Ivan","Ivanovich","Pushkin Street",12345,1234),
                new Customer(2,"Petrov","Petr","Petrovich","Lermontov Street",12350,1235),
                new Customer(3,"Sergeev","Sergei","Sergeevich","Tolstoy Street",12351,1236),
                new Customer(4,"Olegov","Oleg","Olegovich","Chekhov Street",12355,1238)
        };
        System.out.println("Customers in alphabetical order");
        Arrays.sort(customers, Comparator.comparing(Customer::getLastName));
        for (Customer customer:customers) {
            System.out.println(customer.toString());
        }
        System.out.print("\nCustomers with credit card between ");
        int minBound=12349;
        int maxBound=12351;
        System.out.println(minBound+" and "+maxBound);
        for (Customer customer:customers) {
            if (customer.getCreditCard()>=minBound && customer.getCreditCard()<=maxBound)
                System.out.println(customer.toString());
        }



    }
}
