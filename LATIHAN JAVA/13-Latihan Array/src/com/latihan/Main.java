package com.latihan;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {12,54,23,67,34};
        int[] array2 = {45,12,76,28,98};
        System.out.println("Array 1 = " + Arrays.toString(array1));
        System.out.println("Array 2 = " + Arrays.toString(array2));

        // menjumlahkan dua buah array
        int[] hasilJumlah = jumlahArray(array1, array2);
        System.out.println("Jumlah dua array = " + Arrays.toString(hasilJumlah));

        // menggabungkan dua buah array
        int[] hasilGabung = gabungArray(array1, array2);
        System.out.println("Gabungan dua array = " + Arrays.toString(hasilGabung));

        // sorting descending
        int[] hasilSort = sortArray(array1);
        System.out.println("Hasil sort desc array 1 = " + Arrays.toString(hasilSort));
        hasilSort = sortArray(array2);
        System.out.println("Hasil sort desc array 2 = " + Arrays.toString(hasilSort));
    }

    private static int[] jumlahArray(int[] arraySatu, int[] arrayDua) {
        int[] arrayHasil = new int[arraySatu.length];
        for (int i=0; i<arraySatu.length; i++) {
            arrayHasil[i] = arraySatu[i] + arrayDua[i];
        }
        return arrayHasil;
    }

    private static int[] gabungArray(int[] arraySatu, int[] arrayDua) {
        int[] arrayHasil = new int[arraySatu.length + arrayDua.length];
        for (int i=0; i<arraySatu.length; i++) {
            arrayHasil[i] = arraySatu[i];
        }
        for (int i=0; i<arrayDua.length; i++) {
            arrayHasil[i + arraySatu.length] = arrayDua[i];
        }
        return arrayHasil;
    }

    private static int[] sortArray(int[] inputArray) {
        int[] hasil = Arrays.copyOf(inputArray, inputArray.length);
        Arrays.sort(hasil);
        int ptr1 = 0;
        int ptr2 = hasil.length -1;
        int temp;
        while (ptr1 < ptr2) {
            temp = hasil[ptr1];
            hasil[ptr1] = hasil[ptr2];
            hasil[ptr2] = temp;
            ptr1++;
            ptr2--;
        }
        return hasil;
    }
}
