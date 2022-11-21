package com.java20cybersoft.squaretriangle;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class SquareTriangle {

    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
