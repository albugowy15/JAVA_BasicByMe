package com.bughowy;

import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] contohArray = {1,2,3,4,5};
        System.out.println(contohArray[0]);
        System.out.println(contohArray[1]);
        System.out.println(contohArray[2]);
        System.out.println(contohArray[3]);
        System.out.println(contohArray[4]);

        Scanner input = new Scanner(System.in);
        double[] arrayKosong = new double[4];
        System.out.print("Masukkan 4 angka = ");
        for (int i=0; i<4; i++) {
            arrayKosong[i] = input.nextDouble();
        }
        System.out.println(Arrays.toString(arrayKosong));

        System.out.println("Menampilkan isi Array dengan for each");
        for (double b: arrayKosong) {
            System.out.println(b);
        }
        input.close();
    }
}