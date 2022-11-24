package com.java20cybersoft.arraymanipulation;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class ArrayManipulation {

    public static void main(String[] args) {
        int a[] = new int[10];
        int b = 0;
        int min = 0;
        int max = 0;
        int minNe = 0;
        int maxNe = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + a[i]);
        }
        for (int i = 0; i < n; i++) {
            b += a[i];
        }
        System.out.println("\nGia tri trung binh cua xau: " + b / n);
        
        int temp = a[0];
        for (int i = 0; i < n - 1 ; i++){
            for(int j = i + 1; j < n; j++){
                if(a[i] > a[j]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("Gia tri nho nhat trong xau: " + a[0]);
        System.out.println("Gia tri lon nhat trong xau: " + a[n]);
        System.out.println("Cac phan tu chan: ");
        for (int i = 0; i < n; i++) {
            if(a[i] %2 == 0){
                System.out.print("\t" + a[i]);
            }
        }
        System.out.println("\nCac phan tu le: ");
        for (int i = 0; i < n; i++) {
            if(a[i] %2 != 0){
                System.out.print("\t" + a[i]);
            }
        }
    }
}
