package com.java20cybersoft.closestlogn;
import static java.lang.Math.log;
import java.util.Scanner;
/**
 *
 * @author hoangpresident
 */
public class ClosestLogn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so nguyen duong n: ");
        n = sc.nextInt();
        int soLonNhatBeHonN = 0;
        for (int i = 1; i < (log(n) / log(2)) ;i++){
            soLonNhatBeHonN = i;
        }
        System.out.println("So lon nhat be hon logarit 2 cua n: " + soLonNhatBeHonN);
    }
}
