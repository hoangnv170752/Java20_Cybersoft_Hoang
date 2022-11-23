package com.java20cybersoft.deletesamenumbers;

import java.util.Arrays;

/**
 *
 * @author hoang
 */
public class DeleteSameNumbers {

    public static int remove_Duplicate_Elements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int end = 0;
        for (int i = 1; i < n; ++i) {
            if (arr[i] != arr[end]) {
                ++end;
                arr[end] = arr[i];
            }
        }
        return end + 1;

    }

    public static void show_array(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

    }

    public static void main(String[] args) {
        int arr1[] = {7, 2, 6, 7, 4, 9, 8};
        int arr2[] = {7, 2, 6, 7, 7};
        int arr3[] = {7, 7, 7};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        int size1 = remove_Duplicate_Elements(arr1, arr1.length);
        int size2 = remove_Duplicate_Elements(arr2, arr2.length);
        int size3 = remove_Duplicate_Elements(arr3, arr3.length);

        show_array(arr1, size1);
        show_array(arr2, size2);
        show_array(arr3, size3);
    }
}
