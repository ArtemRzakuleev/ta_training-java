package com.epam.training.student_artem_rzakuleev.fundamental.optional_task;

import java.util.Random;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        System.out.print("Enter n ( size of array) : ");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.print("Enter M ( bound of elements) : ");
        int M=in.nextInt();
        /*
        Fill array by random elements between -M and M
         */
        int[][] array=new int[n][n];
        Random r=new Random();
        for (int i=0;i<n;i++)   {
            for (int j=0;j<n;j++)   {
                array[i][j]=r.nextInt(2*M)-M;
            }
        }
        /*
        Output of array
         */
        System.out.println();
        for (int i=0;i< array.length;i++)   {
            for (int j=0;j< array.length;j++)   {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        /*
        Find max element in array
         */
        int maxElement=-1*M;
        int posIMax=0;
        int posJMax=0;
        for (int i=0;i<n;i++)   {
            for (int j=0;j<n;j++)   {
                if (array[i][j]>maxElement) {
                    maxElement=array[i][j];
                    posIMax=i;
                    posJMax=j;
                }
            }
        }
        /*
        Output of max element and its position
         */
        System.out.println("\nmax element : "+ maxElement);
        System.out.println("i position of max element : "+posIMax);
        System.out.println("j position of max element : "+posJMax);
        System.out.println();
        /*
        Declaration resulting array and fill it
         */
        int[][] result=new int[n-1][n-1];
        for (int i=0;i<n;i++)   {
            for (int j=0;j<n;j++)   {
                if (i<posIMax && j<posJMax) result[i][j]=array[i][j];
                if (i<posIMax && j>posJMax) result[i][j-1]=array[i][j];
                if (i>posIMax && j<posJMax) result[i-1][j]=array[i][j];
                if (i>posIMax && j>posJMax) result[i-1][j-1]=array[i][j];
            }
        }
        /*
        output of result
         */
        for (int i=0;i< result.length;i++)   {
            for (int j=0;j< result.length;j++)   {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
