package com.bughowy;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arraySatu = {10,11,12,13,14};
        int[] arrayDua = new int[5];

        System.out.println("====1. Copy array dengan loop====");
        for (int i=0; i< arrayDua.length; i++) {
            arrayDua[i] = arraySatu[i];
        }
        System.out.println("Array 1 = " + Arrays.toString(arraySatu));
        System.out.println("Array 2 = " + Arrays.toString(arrayDua));

        System.out.println("\n====2. Copy Array dengan copyOf=====");
        int[] arrayTiga = Arrays.copyOf(arraySatu, 2);
        System.out.println("Array 1 = " + Arrays.toString(arraySatu));
        System.out.println("Array 2 = " + Arrays.toString(arrayTiga));

        System.out.println("\n====3. Copy Array dengan copyofrange====");
        int[] arrayEmpat = new int[5];
        arrayEmpat = Arrays.copyOfRange(arraySatu, 3,5);
        System.out.println("Array 1 = " + Arrays.toString(arraySatu));
        System.out.println("Array 2 = " + Arrays.toString(arrayEmpat));

        System.out.println("\n=====4. Fill Array dengan fill=====");
        int[] arrayLima = new int[7];
        Arrays.fill(arrayLima, 7);
        System.out.println("Array = " + Arrays.toString(arrayLima));

        System.out.println("\n====5. Cek apakah dua Array sama====");
        int[] arrayEnam = {10,11,12,13,14};

        boolean cek = Arrays.equals(arraySatu, arrayEnam);
        if (cek) {
            System.out.println("Kedua Array sama");
        } else {
            System.out.println("Kedua array tidak sama");
        }

        System.out.println("\n=====6. Cek array lebih besar=====");
        int[] arrayTujuh = {20,23,12,4,67};
        int[] arrayDelapan = {19,23,12,4,67};
        int check = Arrays.compare(arrayDelapan, arrayTujuh);
        System.out.println("Hasilnya adalah : " + check);

        System.out.println("\n=====7. Cek indeks array yang berbeda=====");
        System.out.println("Indeks = " + Arrays.mismatch(arrayTujuh, arrayDelapan));

        System.out.println("\n=====8. Sorting array=====");
        int[] arraySembilan = {6,2,9,5,1};
        Arrays.sort(arraySembilan);
        System.out.println("Array setelah disort = " + Arrays.toString(arraySembilan));

        System.out.println("\n=====9. Binary Search Array======");
        System.out.println("Array = " + Arrays.toString(arraySembilan));
        System.out.println("Indeks = " + Arrays.binarySearch(arraySembilan, 5));
    }
}







