package com.epam.training.student_artem_rzakuleev.fundamental.main_task;

public class Calculator {
    public static void main(String[] args) {
        if (args.length==2) {
            int a=Integer.valueOf(args[0]);
            int b=Integer.valueOf(args[1]);
            System.out.println(a+" + "+b+" = "+(a+b));
            System.out.println(a+" * "+b+" = "+(a*b));
        }
    }
}
