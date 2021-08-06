package com.bughowy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);
        System.out.print("Angka = ");
        angka = input.nextInt();
        System.out.println("Jumlah = " + hitung(angka));
        input.close();
    }

    private static int hitung(int x) {
        int jumlah = 0;
        for (int i=1; i<=x; i++) {
            jumlah = jumlah+i;
        }
        return jumlah;
    }
}
