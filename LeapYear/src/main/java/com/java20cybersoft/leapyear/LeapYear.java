package com.java20cybersoft.leapyear;

import java.util.Scanner;

/**
 *
 * @author hoangpresident
 */
public class LeapYear {

    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào năm: ");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Năm " + year + " là năm nhuận.");
                } else {
                    System.out.println("Năm " + year + " không phải là năm nhuận.");
                }
            } else {
                System.out.println("Năm " + year + " là năm nhuận.");
            }
        } else {
            System.out.println("Năm " + year + " không phải là năm nhuận.");
        }
    }
}
