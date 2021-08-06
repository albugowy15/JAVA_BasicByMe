package com.bughowy;
import java.util.Arrays;
import java .util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arraySatu = {5,6,7,8,9};
        int[] arrayDua = new int[5];
        System.out.println("========Sebelum Assignment=====");
        System.out.println("Address Array 1 = " + arraySatu);
        System.out.println("Address Array 2 = " + arrayDua);

        System.out.println("Array 1 = " + Arrays.toString(arraySatu));
        System.out.println("Array 2 = " + Arrays.toString(arrayDua));

        arrayDua = arraySatu;
        System.out.println("========Setelah Assignment======");
        System.out.println("Address Array 1 = " + arraySatu);
        System.out.println("Address Array 2 = " + arrayDua);

        System.out.println("Array 1 = " + Arrays.toString(arraySatu));
        System.out.println("Array 2 = " + Arrays.toString(arrayDua));

        ubahArray(arraySatu);
        System.out.println("Isi array 1 setelah assign ke fungsi = " + Arrays.toString(arraySatu));
        System.out.println("Isi array 2 setelah assign ke fungsi = " + Arrays.toString(arrayDua));
    }

    private static void ubahArray(int[] arrayTiga) {
        arrayTiga[0] = 100;
        arrayTiga[4] = 200;
    }
}
