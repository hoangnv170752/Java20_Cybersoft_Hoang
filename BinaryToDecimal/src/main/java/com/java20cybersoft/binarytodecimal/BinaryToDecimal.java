package com.java20cybersoft.binarytodecimal;

import java.util.Scanner;

/**
 *
 * @author hoangpresident
 */
public class BinaryToDecimal {

    public static void convertBinary(int num) {
        int binary[] = new int[40];
        int index = 0;
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    };

    public static void main(String[] args) {
        BinaryToDecimal obj = new BinaryToDecimal();
        int binaryInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nhị phân cần đổi: ");
        binaryInput = sc.nextInt();
        System.out.print("Giá trị nhị phân của " + binaryInput + " là: ");
        obj.convertBinary(binaryInput);
    }
}
