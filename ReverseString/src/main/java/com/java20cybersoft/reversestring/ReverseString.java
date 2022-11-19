package com.java20cybersoft.reversestring;
import java.util.Scanner;
/**
 *
 * @author hoangpresident
 */
public class ReverseString {
    public static void reverseWordMyString(String str){
        String[] Words = str.split(" ");
        String reversedString = "";
        for (String Word : Words) {
            String reversedWord = "";
            //gan cho chu cai cuoi chu cai dau
            for (int j = Word.length()-1; j >= 0; j--){
                reversedWord = reversedWord + Word.charAt(j);
            }
            reversedString = reversedString + reversedWord + " ";
        }
        System.out.println(reversedString);
    }
    public static void main(String[] args) {
        String stringTest;
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        Scanner scanner = new Scanner(System.in);
        stringTest = scanner.nextLine();
        reverseWordMyString(stringTest);
           
    }
}
