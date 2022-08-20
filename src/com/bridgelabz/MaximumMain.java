package com.bridgelabz;

import java.util.Scanner;

public class MaximumMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Maximum obj = new Maximum();


        while(true) {
            System.out.println(" 1. Integers\n 2. Float\n 3. String\n 4. Exit");
            System.out.print(" Please enter your choice: ");
            int ch = scan.nextInt();

            switch(ch) {
                case 1:
                {
                    System.out.print(" Please enter the first value: ");
                    Integer first = scan.nextInt();

                    System.out.print(" Please enter the second value: ");
                    Integer second = scan.nextInt();

                    System.out.print(" Please enter the third value: ");
                    Integer third = scan.nextInt();
                    obj.findMax(first, second, third);
                    break;
                }
                case 2:
                {
                    System.out.print(" Please enter the first value: ");
                    Float first = scan.nextFloat();

                    System.out.print(" Please enter the second value: ");
                    Float second = scan.nextFloat();

                    System.out.print(" Please enter the third value: ");
                    Float third = scan.nextFloat();
                    obj.findMax(first, second, third);
                    break;
                }
                case 3:
                {
                    System.out.print(" Please enter the first value: ");
                    String first = scan.next();

                    System.out.print(" Please enter the second value: ");
                    String second = scan.next();

                    System.out.print(" Please enter the third value: ");
                    String third = scan.next();
                    obj.findMax(first, second, third);
                    break;
                }
                case 4:
                    System.out.println(" Good bye");
                    scan.close();
                    return;
                default:
                    System.out.println("Please enter a valid input");
            }

        }
    }
}
