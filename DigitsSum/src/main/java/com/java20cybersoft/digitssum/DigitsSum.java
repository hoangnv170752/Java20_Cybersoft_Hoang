package com.java20cybersoft.digitssum;
import java.util.Scanner;
/**
 *
 * @author hoangpresident
 */
public class DigitsSum {
    public static void main(String[] args) {
        int n, soDu, total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương bất kì: ");
        n = sc.nextInt();
        while(n>0) {
            soDu = n % 10;
            n = n /10;
            total += soDu;
        }
        System.out.println("Tổng các chữ số của số đó là: " + total);
    }
}
