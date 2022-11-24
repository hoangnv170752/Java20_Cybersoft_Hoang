package com.java20cybersoft.stringmanipulation;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class StringManipulation {

    public static void main(String[] args) {
        String string1, string2;
        int res;
        int length;
        int index1;
        boolean qs;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi thu nhat: ");
        string1 = scanner.nextLine();
        System.out.println("Nhap vao chuoi thu hai: ");
        string2 = scanner.nextLine();
        res = string1.compareTo(string2);
        if (res < 0) {
            System.out.println("Chuoi khong chua substring" + string2 + " ");
        }
        length = string1.length();
        System.out.println("Do dai chuoi la: " + length);
        System.out.println("Nhap vao vi tri can in ra chu cai: ");
        index1 = scanner.nextInt();
        System.out.println("Ki tu o vi tri do la: " + string1.charAt(index1));
        qs = string1.contains(string2);
        if (qs) {
            System.out.println("Xau ki tu 1 co substring ");
        } else {
            System.out.println("Xau ki tu 1 khong co substring");
        }
    }
}
