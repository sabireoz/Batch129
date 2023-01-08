package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

    public static void main(String[] args) {

        /*
         gecerli username="admin' password="pwd123"dur
         kullanicidan username ve password dogru ise "hesabiniza hosgeldiniz ".yazdirin
         username ve password yanlis ise 3 kere ""username ve paasword unuzu giriniz mesaji verin.
         username ve password 4.kere yanlis girilirse "hesabiniz bloke olmustur "msji vererk islemi tamamalyinz.
         */

        Scanner input = new Scanner(System.in);

        int counter =0;

        do {
            if (counter==4) {
                System.out.println("Hesabiniz bloke olmustur!");
                break;
            }
                System.out.println("Username nizi giriniz");
                String username =input.nextLine();
                System.out.println("password u giriniz");
                String password=input.nextLine();

                if (username.equals("admin") && password.equals("pwd123")){
                    System.out.println("Hesabiniza Hosgeldiniz");
                    break;
                }

                counter++;
            }while (true);
        }


    }
