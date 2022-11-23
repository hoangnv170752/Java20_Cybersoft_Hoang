package com.java20cybersoft.karaoke;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class Karaoke {

    public static void billKaraoke(float timeStart, float timeStop, int chaiNuoc) {
        if ((timeStart > timeStop) || (timeStart < 9) || (timeStop > 25) || (timeStart * timeStop < 0)) {
            System.out.println("Nhap lai gia tri thoi gian!");
        }
        float n;
        n = timeStop - timeStart;

        if (timeStart < 17) {
            if (n <= 3) {
                System.out.println("Hoa don tinh tien: " + (n * 30000 + chaiNuoc * 10000));
            }
            if (n > 4) {
                float bill;
                bill = (float) ((90000 + chaiNuoc * 10000 + (n - 3) * 30000) * 0.8);
                System.out.println("Hoa don tinh tien: " + bill);
            }
        } else if (timeStart >= 17) {
            float bill;
            bill = (float) (90000 + chaiNuoc * 10000 + (n - 3) * 30000);
            System.out.println("Hoa don tinh tien: " + bill);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thoi gian vao: ");
        float start = scanner.nextFloat();
        System.out.println("Nhap thoi gian ra: ");
        float stop = scanner.nextFloat();
        System.out.println("Nhap so chai nuoc dung: ");
        int bottle = scanner.nextInt();
        billKaraoke(start, stop, bottle);
    }
}
