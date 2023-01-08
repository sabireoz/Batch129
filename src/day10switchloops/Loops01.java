package day10switchloops;

public class Loops01 {

    /*
    code standarts:
    1 tekrar olamamalidir.
    2 dinamik olmalidir.
    3Tamir ve update kolay yapilabilmelidir.kodu fix etme derler(tamir)
     */

    public static void main(String[] args) {


        // example 1:Ekrana 5 kere "Hi"
//yazdiriniz,
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.yol //2.Yol:
        //        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop" lar kullanilir.
        //        //Dort tane loop var; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop
        //
        //        //i)for-loop
        //        //  Baslangic degeri  Loop'un calisma sarti Increment/Decrement
        //        for(int i=1         ; i<6                  ; i++                ){
        //            System.out.println("Hi!");
        //        }

//Example 2:11 den 14 kadar tum tamsayilari ekrana yazdiran kodu yaziniz.
        for (int i = 11; i < 15; i++) {
            System.out.println(i);
        }


        //Example 3: 40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
        for (int i = 40; i > 22; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Exzample4:18 den 56 ya kadar tum tek sayilari ekrana yazdiran kodu yazdirinz.

        for (int i=18;  i<57; i++){
            if (i%2!=0){
                System.out.print(i + ""  );//ln yi sildigimiz icin yan yana yazdi.bosluk ekledi.
            }

        }






    }

}