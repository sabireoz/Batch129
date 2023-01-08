package practice;

public class Pratik01 {

    public static void main(String[] args) {
        //Example 4: S Stringindeki 2. ve sondan ikinci karakteri aliniz ve ekrana yanyana yazdiriniz. Tek bir karakter alinacaksa charat kullan
        //Example5: "s" Stringinde kullanilan  character sayisini bulunuz.

        String r="Ramazan Ozmen";
       // char ikinciKarakter=r.charAt(2);//m
      //  char sonIkinci=r.charAt(11);//e
        //System.out.print(ikinciKarakter);
       // System.out.println(sonIkinci);
     //  2.yol System.out.println(""+ikinciKarakter +sonIkinci);
int KarakterSayisi=r.length();
System.out.println(KarakterSayisi);//13





                //Ex3 : Stringdeki tum karakterleri buyuk harf/ kucuk harf yapiniz.
                //Ex4 : Stringdeki ilk karakteri aliniz
                String a = "Bahar";

                String buyukHarf =a.toUpperCase();
                System.out.println(buyukHarf);

                String  kucukHarf = a.toLowerCase();
                System.out.println(kucukHarf);
                char b = a.charAt(0);
                System.out.println(b);
        //example4 i) primitive char i Warapper Character a ceviriniz
        // wrapper Boolean i primitive boolean a cevirinizWrapperClass

        //char harf="i";
        // harfWrapper=harf;
       // System.out.println(harfWrapper);

       // boolean bahargeldimiWrapper= true;
        //System.out.println(bahargeldimiWrapper);



        //Example5 size String olarak verilen iki fiyatin toplamini ekrana yazdiriniz.WrapperClass
        //Example 6 Size String olarak verileniki fiyatin toplamini ekrana yazdirinizWrapperClass
                String ayakkabi="233";
                String gomlek="200";
        System.out.println(ayakkabi+gomlek);
        int sum=Integer.valueOf(ayakkabi)+Integer.valueOf(gomlek);
        System.out.println(sum);

        int sum1=0;
        for (int i = 5; i < 9; i++) {
            sum1 +=i;
           // System.out.print( i"+");


        }
        System.out.print("="+sum1);


    }
}
