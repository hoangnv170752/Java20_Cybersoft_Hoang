package com.java20cybersoft.solvefunction;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class SolveFunction {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Chon giai phuong trinh nao: 1-Phuong trinh bac nhat, 2- Phuong trinh bac hai ");
        int n;
        n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("1- Giai phuong trinh bac 1");
                int a, b;
                System.out.println("Nhap a: ");
                a = scanner.nextInt();
                System.out.println("Nhap b: ");
                b = scanner.nextInt();
                SolveFunction.firstFunc(a, b);
                break;
            case 2:
                System.out.println("2- Giai phuong trinh bac 2");
                int p, o, q;
                System.out.println("Nhap p: ");
                p = scanner.nextInt();
                System.out.println("Nhap o: ");
                o = scanner.nextInt();
                System.out.println("Nhap q: ");
                q = scanner.nextInt();
                SolveFunction.quadraticFunc(p, o, q);
                break;
            default:
                System.out.println("1");
        }
    }

    public static void quadraticFunc(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem.");
            } else {
                System.out.println("Phuong trinh co 1 nghiem: " + "x = " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if(delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co 2 nghiem la: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem.");
        }
    }
    
    public static void firstFunc(float a, float b) {
        if (a == 0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else {
            System.out.println("Phuong trinh co 1 nghiem: " + "x = " + (-b / a));
        }
    }
}
