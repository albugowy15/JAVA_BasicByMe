package com.bughowy;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan urutan fibonacci ke = ");
        angka = input.nextInt();

        // memanggil fungsi rekursif
        int hasil = fibonacci(angka);
        System.out.println("Fibonacci ke " + angka + " = " + hasil);

        // overload pada java
        printAngka(10);
        printAngka(10.5d);
        printAngka(64.8f);
        input.close();
    }

    // Recursif pada java
    private static int fibonacci(int angka) {
        if (angka == 0 || angka == 1) {
            return angka;
        } else {
            return fibonacci(angka-1) + fibonacci(angka-2);
        }
    }

    private static void printAngka(int n) {
        System.out.println("Angka Integer yg diinputkan = " + n);
    }

    private static void printAngka(double n) {
        System.out.println("Angka Double yg diinputkan = " + n);
    }

    private static void printAngka(float n) {
        System.out.println("Angka Float yg diinputkan = " + n);
    }
}
