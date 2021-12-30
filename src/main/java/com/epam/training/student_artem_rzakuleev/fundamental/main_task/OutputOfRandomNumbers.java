package com.epam.training.student_artem_rzakuleev.fundamental.main_task;

import java.util.Random;
import java.util.Scanner;

public class OutputOfRandomNumbers {
    public static void main(String[] args) {
        System.out.print("Enter count of numbers: ");
        Scanner in = new Scanner(System.in);
        int count=in.nextInt();
        System.out.print("Random number without separator: ");
        Random r=new Random();
        for (int i=0;i<count;i++) {
            System.out.print(r.nextInt()+"\t");
        }
        System.out.println("\nRandom number with separator");
        for (int i=0;i<count;i++) {
            System.out.println(r.nextInt()+"\t");
        }
    }
}
