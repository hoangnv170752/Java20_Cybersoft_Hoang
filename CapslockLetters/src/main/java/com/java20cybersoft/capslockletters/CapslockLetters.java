package com.java20cybersoft.capslockletters;

import java.util.Scanner;

/**
 *
 * @author hoangpresident
 */
public class CapslockLetters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhap vao chuoi can in hoa ki tu dau: ");
        message = sc.nextLine();

        char[] charArray = message.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        message = String.valueOf(charArray);
        System.out.println("Chuoi sau khi doi: \n" + message);
    }
}
