package practice.nighttime02;

import java.util.Scanner;

public class C04_WhileLoop {




      /*
            Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
         'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
         */

        //alacacaranlik==>2

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen 'c' ve 'a' harflerini iceren bir cumle giriniz");
            String str = input.nextLine().toLowerCase();

            int sayac = 0;  //+==>0 2+0=2    *==> 1 2*1=2    str==>""  true;

            if(str.contains("a")&& str.contains("c")){
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'a') {
                        sayac++;
                    } else if (str.charAt(i) == 'c') {
                        break;
                    }//else if
                }//for loop
                System.out.println("c'den onceki a'larin sayisi : "+sayac);
            }else
                System.out.println("Lutfen 'c' ve 'a' harflerini iceren bir cumle giriniz");

                // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
               // sekilde yazdiriniz, bosluk " " veya 'a' harfi geldiginde bunlari yazmasin

                       /*
                        gazi antep
                        g
                       z
                        i
                        n
                        t
                         e
                        p

                         */

                   // Scanner input = new Scanner(System.in);
                   // System.out.println("Lutfen bir cumle giriniz");
                    //String str= input.nextLine();

                    for (int i = 0; i <str.length();        i++) {
                        if(str.charAt(i)=='a' || str.charAt(i)==' '){
                            continue;
                        }//if else
                        System.out.println(str.charAt(i));
                    }//for loop

        }


    }


