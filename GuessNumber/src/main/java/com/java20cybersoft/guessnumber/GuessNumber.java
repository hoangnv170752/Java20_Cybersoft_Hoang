package com.java20cybersoft.guessnumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class GuessNumber {

    public static void main(String[] args) {
        int ComNumber, PlayerNumber;
        int GuessTime = 1;
        String ketQua = " ";
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        ComNumber = 1 + rd.nextInt(1000);
//        System.out.println(ComNumber);
        while (true) {
            System.out.print("Moi ban doan so: ");
            PlayerNumber = scanner.nextInt();

            if (PlayerNumber < ComNumber) {
                System.out.println("So doan be hon so dua ra! ");
                GuessTime++;
            } else if (PlayerNumber > ComNumber) {
                System.out.println("So doan lon hon so dua ra! ");
                GuessTime++;
            } else {
                System.out.println("Da doan dung roi, CHUC MUNG!!");
                System.out.println("So lan doan: " + GuessTime);
                break;
            }
        }
    }
}
