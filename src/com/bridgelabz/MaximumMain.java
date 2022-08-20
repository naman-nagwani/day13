package com.bridgelabz;

import java.util.Scanner;

public class MaximumMain {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        Maximum maximum = new Maximum();

        System.out.print(" Please enter the first value: ");
        int first = scan.nextInt();

        System.out.print(" Please enter the second value: ");
        int second = scan.nextInt();

        System.out.print(" Please enter the third value: ");
        int third = scan.nextInt();

        maximum.findMax(first, second, third);

        scan.close();
    }
}
