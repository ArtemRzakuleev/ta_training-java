package com.epam.training.student_artem_rzakuleev.fundamental.main_task;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.print("Enter name: ");
        Scanner in = new Scanner(System.in);
        String name=in.next();
        System.out.println("Hello, "+name+" !");

    }
}
