package com.bughowy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = userInput.nextLine();
        System.out.print("IPK : ");
        double ipk = userInput.nextDouble();
        String huruf;
        if (ipk == 4.00) {
            huruf = "A";
        } else if (ipk < 4.00 && ipk >= 3.5) {
            huruf = "AB";
        } else if (ipk < 3.5 && ipk >= 3) {
            huruf = "B";
        } else {
            huruf = "C";
        }
        System.out.println("============================");
        System.out.println("Nama : " + nama);
        System.out.println("Nilai kamu adalah : " + huruf);

        System.out.println("\nMenghitung bilangan 1-10");
        for (int i=1; i<=10; i++) {
            System.out.print(i + " ");
        }

        userInput.close();
    }
}
