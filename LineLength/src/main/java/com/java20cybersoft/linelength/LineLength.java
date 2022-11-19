package com.java20cybersoft.linelength;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author hoangpresident
 */
public class LineLength {

    public static void main(String[] args) {
        double xA, yA;
        double xB, yB;
        double lengthAB;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap toa do diem A");
        System.out.println("Nhap xA: ");
        xA = sc.nextDouble();
        System.out.println("Nhap yA: ");
        yA = sc.nextDouble();
        
        System.out.println("Nhap toa do diem B");
        System.out.println("Nhap xB: ");
        xB = sc.nextDouble();
        System.out.println("Nhap yB: ");
        yB = sc.nextDouble();
        
        lengthAB = Math.sqrt(Math.pow((xB-xA), 2) + Math.pow((yB - yA),2));
        System.out.println("Độ dài đoạn thẳng AB là: " + lengthAB);
        
    }
}
