package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {


    public static void main(String[] args) {

        //primitive:       char    - boolean - byte - short - int     - long - float - double
        //Wrapper Class: Character - Boolean - Byte - Short - Integer - Long - Float - Double
        //Wrapper Class'lar non-primitive'dir o yuzden memory'de cok yer kaplarlar, o yuzden sart degilse Wrapper Class kullanmayi tercih etmeyiz.

        int n = 12;//"n" yazip "nokta" koyarsaniz hic method goremezsiniz, cunku "primitive" ler method icermez.
        Integer m = 12;//"m" yazip "nokta" koyarsaniz bircok method gorursunuz, cunku "wrapper class" lar method icerir.

        byte p = 23;
        Byte r = 43;

        //Example 1: short data type'inin minimum ve maximum degerlerini kod yazarak bulunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);// 32767

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);// -32768

        //Example 2: int data type'inin minimum degeri ile byte data type'inin maximum degerinin toplamini bulunuz.
        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("Toplam: " + (intMin + byteMax));// -2147483521

        //Example 3: i)Primitive int'i Wrapper Integer'a ceviriniz.(Autoboxing)
        int num = 22;
        Integer wrapperNum = num;
        System.out.println(wrapperNum);//22
        //           ii)Wrapper Byte'i primitive byte'a ceviriniz.(Unboxing)
        Byte k = 43;
        byte primitiveK = k;
        System.out.println(primitiveK);//43
//Example 4: i)Primitive char'i Wrapper Character'e ceviriniz.(Autoboxing)
//           ii)Wrapper Boolean'i primitive boolean'a ceviriniz.(Unboxing)

        // i)

        char initial = 'T';
        Character initialWrapper = initial;


        //II)
        Boolean isOld = true;
        char c = 'A';
        Character C = c;
        System.out.println(C);

      //  Boolean isOld = true;
        boolean isOldWrapper = isOld;
        System.out.println(isOldWrapper);
//Java'da "+" işaretinin iki ayrı kullanım alanı vardır
//1. Toplama 2. Birleştirme kullanım alanına göre değişiklik gösterir sayılar arasına konulursa toplama yapar diğer durumlarda birleştirme yapar.
//ÖNEMLİ= çift tırnak içerisine konulan değerler java tarafından kelime yani String olarak algılanır ve + konulması durumunda birleştirme yapar.
//"Concatenation: birleştirme "A" +7 ="A7" 8+3+"K"="11K"==> 11+"K" JAVA İŞLEMLERİ SOLDAN SAĞA YAPAR
//"J"+5+12==> "J5"+12 = "J512"
//"K" +3*5 = Java soldan sağa gelir ancak matematik bilir ve işlem önceliği vardır "K" + 3*5 = "K15"


        //ornek5:size String olan
        String shirt = "2500";
        String shoes = "5500";

        //Java'da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur.
        //Java'da "+" sembolu iki String arasinda veya bir String ve bir sayi arasinda kullanilirsa "concatenation islemi" olur.
        //"concatenation islemi" birlestirme yapar.
        //Note: Concatenation islemlerinde Java matematikteki islem onceligi kurallarini kullanir.
        //Islem onceligi kurallari: i)Once uslu sayilar ii)Parantez ici islemler yapilir iii)Carpma ve bolme iv)Toplama ve cikarma
        System.out.println(shirt + shoes);// 23005200
        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        //Example 6: Size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz
        //Note: valueOf() methodu tum karakterleri rakam olan String'leri sayilara cevirir.
        //      Eger valueOf() methodu kullanirken String'in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz.
        //      Bu hatayi duzeltmeyi ileride ogrenecegiz.
        String tv = "$11000";
        String radio = "$3000";

        System.out.println(tv + radio);//$11000$3000
        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
    }
}


