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
        int i, j;
        i = 1;
        while (i <= n) {
            j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println(" ");
        }
    }
}
