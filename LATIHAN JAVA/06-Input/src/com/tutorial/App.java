package com.tutorial;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyword = new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        String nama = keyword.nextLine();
        System.out.print("Masukkan umur : ");
        int umur = keyword.nextInt();
        System.out.print("Masukkan IPK : ");
        double ipk = keyword.nextDouble();

        keyword.close();

        boolean kkm = (ipk > 3.00);
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("IPK : " + ipk);
        System.out.println("Apakah nilai anda diatas kkm ? : " + kkm);
    }
}
