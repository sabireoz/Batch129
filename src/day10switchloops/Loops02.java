package day10switchloops;

import java.util.Locale;

public class Loops02 {
    public static void main(String[] args) {


        //Example 1:21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari ekrana yazdiran kodu yaziniz.
        for (int i=21; i<181 ; i++){
            if (i%4==0 && i%6==0){
                System.out.print(i +  " ");//yanyana bosluk birakarak.
            }
        }
        //Exzample 2:Size verilen kucuk harfle yazilmis  Stringin indexi cift olan caracterlerini buyuk harf yazinz


        // Yazdiginiz kod belli senaryolar icin calisiyor tum senaryolar icin calismiyorsa bu code a hard code denir.hard code yalnis yazilscodedur.
        // ankara==> AnKaRa

        //note;bir stringde son index=lenght()-1
        String s="ankara";

        for ( int i=0;i<s.length()  ;i++ ){
            String ch=s.substring(i,i+1);//

            if (i%2==0){
                System.out.println(ch.toUpperCase(Locale.ROOT));
            }
        }



    }
}
