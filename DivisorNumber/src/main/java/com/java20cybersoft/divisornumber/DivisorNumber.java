package com.java20cybersoft.divisornumber;

import java.util.Scanner;

/**
 *
 * @author hoangpresident
 */
public class DivisorNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("\n\nNhập vào số cần tìm ước số: ");
        n = sc.nextInt();
        System.out.printf("Các ước số của %d là: ", n);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
