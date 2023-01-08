package day03scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana  yazdirinz.
        Scanner input =new Scanner(System.in);

        System.out.println("ilk isminizi giriniz...");

        //next
        String firstName=input.next();
        System.out.println("Soy isminizi giriniz...");

       String lastName= input.next();
        System.out.println(firstName+""+lastName);


            //Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz

            System.out.println("Ilk isminizi giriniz...");
            //next() method kullanicidan "tek kelimeli String" almak icin kullanilir.


            System.out.println("Soy isminizi giriniz...");
            String LastName = input.next();

            System.out.println(firstName + " " + lastName);

        }

    }
