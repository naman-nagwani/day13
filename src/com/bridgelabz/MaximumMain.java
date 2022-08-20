package com.bridgelabz;

import java.util.Scanner;

public class MaximumMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Maximum obj = new Maximum();

        System.out.print(" Please enter the first value: ");
        float first = scan.nextFloat();

        System.out.print(" Please enter the second value: ");
        float second = scan.nextFloat();

        System.out.print(" Please enter the third value: ");
        float third = scan.nextFloat();

        obj.findMaxFloat(first, second, third);

        scan.close();
    }
}
