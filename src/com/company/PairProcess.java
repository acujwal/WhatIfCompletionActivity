package com.company;

import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
	// write your code here
        int num1, num2;
        double sum, product, average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "First Number? :" );
        num1 = keyboard.nextInt();

        System.out.print( "Last Number?  :" );
        num2 = keyboard.nextInt();

           sum = (num1 + num2);
        System.out.println("Sum of Number : " + sum);

        product = (num1 * num2);
            System.out.println("Product of Number : " + product);

         average = (sum / 2);
            System.out.println("Average of Number : " + average);

        {
            if (sum >= 200);
            System.out.println(sum + " * " );
        }
    }
}
