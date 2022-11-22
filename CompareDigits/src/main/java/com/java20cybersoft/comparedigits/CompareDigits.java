package com.java20cybersoft.comparedigits;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class CompareDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum;
        int secondNum;
        System.out.println("Nhap vao so thu 1: ");
        firstNum = scanner.nextInt();
        System.out.println("Nhap vao so thu 2: ");
        secondNum = scanner.nextInt();
        int a1 = firstNum/10;
        int a2 = firstNum%10;
        int b1 = secondNum/10;
        int b2 = secondNum%10;
        if ((a1 == b1)||(a2 == b2)||(a1 == b2)||(a2 == b1)){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
