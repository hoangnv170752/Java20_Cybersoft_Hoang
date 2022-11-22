package com.java20cybersoft.savingmoney;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class SavingMoney {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carMoney;
        int saveMoney;
        float interest;
        int year = 1;
        System.out.println("Nhap vao so tien dem di gui tiet kiem: ");
        saveMoney = scanner.nextInt();
        System.out.println("Nhap so tien mua xe mong muon co: ");
        carMoney = scanner.nextInt();
        System.out.println("Nhap vao lai ngan hang: ");
        interest = scanner.nextFloat();
        year = (int) (((carMoney / saveMoney) - 1) / interest);

        System.out.println("So nam anh X can cho de co nha lau xe hoi: " + year);
    }
}
