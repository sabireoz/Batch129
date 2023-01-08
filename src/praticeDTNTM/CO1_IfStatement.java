package praticeDTNTM;

import java.util.Scanner;

public class CO1_IfStatement {

    public static void main(String[] args) {

        /*
        Kullanicidan bir gun ismi alin
        Eger gun cuma ise "Muslumanlar icin kutsal gun";
        Eger gun cumartesi ise "Yahudiler icin kutsal gun";
        Eger gun pazar ise "hristiyanlar icin kutsal gun"
        yazdiran kodu olusturunuz.


         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String gun= input.next().toLowerCase();//kucuk harfe cevirdik.

        if (gun.equals("cuma")) {

            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gun.equals("pazar")) {
            System.out.println("hristiyanlar icin kutsal gun");
        }else
            System.out.println("kutsal gun degildir.");


        /*
        Kullanicidan bir gun alin
        Eger gun cuma ise "Muslumanlar Icin Kutsal Gun" ;
        Eger gun cumartesi ise "Yahudiler icin Kutsal Gun"
        Eger gun pazar ise "Hristyanlar icin Kutsal Gun"
         yazdiran kodu olusturunuz
         */


                System.out.println(" Lutfen gun ismi giriniz");


                if (gun.equals("cuma")) {
                    System.out.println("Muslumanlar Icin Kutsal Gun");
                } else if (gun.equals("cumartesi")) {
                    System.out.println("Yahudiler icin Kutsal Gun");
                } else if (gun.equals("pazar")) {
                    System.out.println("Hristyanlar icin Kutsal Gun");
                } else
                    System.out.println("Kutsal Gun Degil");
            }

        }
