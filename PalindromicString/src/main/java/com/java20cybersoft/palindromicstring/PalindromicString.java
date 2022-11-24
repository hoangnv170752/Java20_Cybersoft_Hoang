package com.java20cybersoft.palindromicstring;

import static java.lang.Math.max;
import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class PalindromicString {

    public static void main(String[] args) {
        String seq;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi thu nhat: ");
        seq = scanner.nextLine();
        int n = seq.length();
        int i, j, k;
        int L[][] = new int[n][n];

        for (i = 0; i < n; i++) {
            L[i][i] = 1;
        }

        for (k = 2; k <= n; k++) {
            for (i = 0; i < n - k + 1; i++) {
                j = i + k - 1;
                if (seq.charAt(i) == seq.charAt(j) && k == 2) {
                    L[i][j] = 2;
                } else if (seq.charAt(i) == seq.charAt(j)) {
                    L[i][j] = L[i + 1][j - 1] + 2;
                } else {
                    L[i][j] = max(L[i][j - 1], L[i + 1][j]);
                }
            }
        }
        System.out.println("Chuoi dai nhat palindrome la tu ki tu thu: " + L[0][n - 1]);
        System.out.print("Chuoi dai do la: ");
        for (i = L[0][n - 1] - 1; i < n; i++) {
            System.out.print(seq.charAt(i));
        }
    }
}
