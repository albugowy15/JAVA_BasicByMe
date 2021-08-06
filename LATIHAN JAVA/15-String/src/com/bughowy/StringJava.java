package com.bughowy;

import java.util.Arrays;

public class StringJava {
    public static void main(String[] args) {
        // membuat string di java
        String bentukString = "bughowy";
        char[] bentukChar = {'b', 'u', 'g', 'h', 'o', 'w', 'y'};
        System.out.println("String object = " + bentukString);
        System.out.println("String char = " + Arrays.toString(bentukChar));

        // akses elemen string
        System.out.println("Isi elemen ke-3 bentukChar = " + bentukChar[3]);
        System.out.println("Isi elemen ke-3 bentukString = " + bentukString.charAt(3));

        // merubah komponen dari String
        // itu tidak bisa...kenapa?, karena string di java itu immutable
        bentukChar[0] = 'c';
        System.out.println(Arrays.toString(bentukChar));

        // kataString[0] = "c"; <---- tidak bisa
        // kataString.charAt(0) = "c"; <---- tidak bisa
        // kita bisa merubah komponen secara tidak langsung

        printAddress("bentukString",bentukString);
        bentukString = "c" + bentukString.substring(1,7);
        System.out.println(bentukString);
        printAddress("bentukString",bentukString);

        // memory dari string (String Pool)
        String str_1 = "cughowy";
        String str_2 = "test";
        String str_3 = "testing";

        printAddress("str_1",str_1);
        printAddress("str_2",str_2);
        printAddress("str_3",str_3);

        str_3 = str_3.substring(0,4);
        printAddress("str_3",str_3);

        String str_4 = "cughowy";
        printAddress("str_4",str_4);

        bentukString = "cughowy";
        printAddress("bentukString",bentukString);

        // 1. String di java itu immutable
        // 2. String yang berada di string pool itu akan reuseable, memorynya lebih
        // efisien
        // 3. membuat string dengan method baru, maka dia akan ditaro di memory lain
        // bukan di string pool


        // liat lebih dalam

        String a = new String("bughowy");
        printAddress("a",a);
    }

    private static void printAddress(String nama, String inputString) {
        int adress = System.identityHashCode(inputString);
        System.out.println("Adress " + nama + " = " + Integer.toHexString(adress));
    }
}
