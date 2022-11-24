package com.java20cybersoft.kangaroojump;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class KangarooJump {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        int x1, x2, v1, v2;
        System.out.println("Nhap vao vi tri con 1: ");
        x1 = scanner.nextInt();
        System.out.println("Nhap vao vi tri con 2: ");
        x2 = scanner.nextInt();
        System.out.println("Nhap vao van toc con 1: ");
        v1 = scanner.nextInt();
        System.out.println("Nhap vao van toc con 2: ");
        v2 = scanner.nextInt();
        if ((v1 < v2) && (x1 < x2)) {
            System.out.println("Hai con se khong bao gio gap nhau!");
        } else {
            if (x1 <= x2) {
                count = (x2 - x1) / (v1 - v2);
                System.out.println("So lan nhay de gap nhau la: " + count);
            } else {
                count = (x1 - x2) / (v2 - v1);
                System.out.println("So lan nhay de gap nhau la: " + count);
            }
        }
    }
}
