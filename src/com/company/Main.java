package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int mat,fiz,tur,kim,muzi, gecmeNotu = 55;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notu = ");
        mat = scanner.nextInt();

        System.out.print("Fizik notu = ");
        fiz = scanner.nextInt();

        System.out.print("Türkçe notu = ");
        tur = scanner.nextInt();

        System.out.print("Kimya notu = ");
        kim = scanner.nextInt();

        System.out.print("Müzik notu = ");
        muzi = scanner.nextInt();

        double ort;

        if (mat<0){
            ort = (tur+fiz+kim+muzi)/4;
        }else if (tur<0){
            ort = (mat+fiz+kim+muzi)/4;
        }else if (fiz<0){
            ort = (mat+tur+kim+muzi)/4;
        }else if (kim<0){
            ort = (mat+fiz+tur+muzi)/4;
        }else {
            ort = (mat+fiz+kim+tur)/4;
        }

        if (gecmeNotu>ort){
            System.out.print("Ortalamanız = " +ort);
            System.out.println("\nMaalesef ortalamanız düşük kaldınız...");
        }else {
            System.out.print("Ortalamanız = "+ort);
            System.out.println("Tebrikler geçtiniz...");
        }
    }
}
