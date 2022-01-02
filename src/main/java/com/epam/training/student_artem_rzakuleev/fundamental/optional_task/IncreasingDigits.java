package com.epam.training.student_artem_rzakuleev.fundamental.optional_task;

import java.util.Scanner;

public class IncreasingDigits {
    public static void main(String[] args) {
        System.out.print("Enter numbers: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] numbers = input.split(" ");
        for (String number:numbers) {
            int N=Integer.valueOf(number);
            int previousDigit=N%10;
            boolean increasing=true;
            N/=10;
            while (N>9)
            {
                int digit=N%10;
                if (previousDigit<digit) {
                    increasing=false;
                    break;
                }
                else {
                    previousDigit=N%10;
                    N/=10;
                }
            }
            if (increasing==true) System.out.println(number);
        }
    }
}
