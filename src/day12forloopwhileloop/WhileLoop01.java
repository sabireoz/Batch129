package day12forloopwhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {

        // example 1: 3den 6 akadar olan tamsayilari console yazdiriniz.

        for (int i = 3; i < 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
//2.yol;while=loop

        int i = 3;
        while (i < 7) {
            System.out.print(i + " ");
            i++;
        }

        //ikiside ayni hizla calisir ve ayni seyi yapar
        //for cok teknik ve okumasi zordur .
        //while iken demektirokumasi daha kolay..


        //example 2;23 dwen 12 ye kadar cift tam sayilari console yazdiriniz.


        int k = 23;//yukarida i kullandigimiz icin k ddik.
        while (k>11) {
            if (k%2==0) {
                System.out.println(i + " ");
                k--;
            }
        }

        //3interwiw******verilen bir tamsayinin rakamlari toplamini console yazdiran kodu yaziniz.

//macilis 10(%10)sayinin son rakamini verir.

        int num=578;

        int sum=0;
        while (num>0){
            sum=sum+num%10;
            num/=10;

        }
        System.out.println(sum);

    }
}