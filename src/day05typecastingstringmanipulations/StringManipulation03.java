package day05typecastingstringmanipulations;

import java.util.Locale;
import java.util.Scanner;

public class StringManipulation03 {
    public static void main(String[] args) {
        /*
         Example:Asagidaki kurallra gore kullanicinn girdigi password u kontrol ediniz. en az 8 karakter olsun
        en az bir tane buyuk harf olsun
        space kararkteri olmasin
        en az bir tane kucuk harfolsun
        en az bir tane sembol olsun
        en az bir tane rakam olsun.

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen paswordunuzu giriniz..");
        String pwd=input.nextLine();

        //en az 8 karakter olsun//cok is yaptirmyalim java ya o yuzden sadece buyuk isareti
        //karsilastirma islevi boolean verir.
        boolean first=pwd.length()>7;
        System.out.println(first);



        //space karakterei icremsin

        boolean second=!pwd.contains("");
        System.out.println(second);



        //En az bir tane buyuk harf olsun;


    }
}
