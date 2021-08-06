package com.bughowy;

public class ArrayMulti {
    public static void main(String[] args) {
        // cara membuat array 2D
        int[][] array2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] array2d2 = new int[3][3];
        printArray2d(array2d);
        printArray2d(array2d2);

        // java memungkinkan membuat array multi dimensi dengan jumlah kolom tidak sama
        // di setiap barisnya
        int[][] arrayNotSquare = {
                {7,6,5,2,3},
                {1,2,3,4,5},
                {4,8,2,3,5,7}
        };
        printArray2d(arrayNotSquare);

        int[][] array2dAbstrak = {
                {3,4,7},
                {7,2,8,1,0},
                {1},
        };
        printArray2d(array2dAbstrak);

    }

    private static void printArray2d(int[][] array2d) {
        System.out.println("Isi array : ");
        for (int[] baris : array2d) {
            for (int kolom : baris) {
                System.out.print(kolom + " ");
            }
            System.out.print("\n");
        }
    }
}