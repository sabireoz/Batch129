package day03scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {
        //kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz.
        //alanini hesaplayiniz.
        //cevresini hesaplayiniz.

        Scanner input=new Scanner(System.in);
        System.out.println("dikdortgeninn kisa kenar uzunlugunu giriniz...");

        System.out.println("dikdortgeninn uzun kenar uzunlugunu giriniz...");

        float shortSide = input.nextFloat();
        float longSide=input.nextFloat();
        System.out.println("Alan = "+(shortSide*longSide));
        System.out.println("cevre = "+(2*longSide+shortSide));
    }


}
