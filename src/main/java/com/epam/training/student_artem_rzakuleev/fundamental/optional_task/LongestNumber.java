package com.epam.training.student_artem_rzakuleev.fundamental.optional_task;

import java.util.Scanner;

public class LongestNumber {
    public static void main(String[] args) {
        System.out.print("Enter numbers: ");
        Scanner in = new Scanner(System.in);
        String input=in.nextLine();
        String[] numbers=input.split(" ");
        if (numbers.length>0) {
            int lengthOfLongest = numbers[0].length();
            int lengthOfShortest = numbers[0].length();
            int posOfLongest=0;
            int posOfShortest=0;
            for (int i=0;i< numbers.length;i++) {
                if (numbers[i].length()>lengthOfLongest) {
                    lengthOfLongest=numbers[i].length();
                    posOfLongest=i;
                }
                if (numbers[i].length()<lengthOfShortest)   {
                    lengthOfShortest=numbers[i].length();
                    posOfShortest=i;
                }
            }
            System.out.println("The longest number is "+ numbers[posOfLongest]);
            System.out.println("The length of the longest number is "+numbers[posOfLongest].length());
            System.out.println("The shortest number is "+ numbers[posOfShortest]);
            System.out.println("The length of the shortest number is "+numbers[posOfShortest].length());
        }
        else System.out.println("Wrong input");
    }
}
