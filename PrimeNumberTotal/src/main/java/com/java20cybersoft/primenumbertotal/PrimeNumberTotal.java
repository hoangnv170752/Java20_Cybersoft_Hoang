package com.java20cybersoft.primenumbertotal;

import java.util.Scanner;

/**
 *
 * @author hoangpresident
 */
public class PrimeNumberTotal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = scanner.nextInt();
        System.out.printf("Tat ca cac so nguyen to nho hon %d la: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i += 2) {
            if (isPrimeNumber(i)) {
                System.out.print("," + i);
            }
        }
        int tong = 0;
        System.out.printf("Tong cac so nguyen to nho hon %d la: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i += 2) {
            if (isPrimeNumber(i)) {
                tong += i;
            }
        }
        System.out.print(tong);
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
