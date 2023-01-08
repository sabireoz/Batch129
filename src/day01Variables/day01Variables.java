package  day01Variables;

class Variables01{

    public static void main(String[] args) {

        //Variable olusturmak.
        //Java cumlesi=Statement
        //java da esittir demek"==".Yani Matematik de "=",Java da "=="
        //Java da "="assigment operatordir.Sagdaki degeri alir soldaki kutuya koyar.
        //Access Modifier yazmazsaniz "access modifier" "default" demektir.
        //Data Type+ Variable Name==>Variable Declaration
        //Assigment Operator+ Variable degeri==>Assigment
        //Eger Variable Declaration yapar,Assigment yapmazsaniz Java kendi degerlerini(default) koyar.
        //Default degerler sayilar icin sifirdir.
        //Data Type'ini yaziniz. Variable ismi yaziniz.Assigment Operator(Atama Operatoru) Varible degeri Ingilizcedeki nokta gibi

                 int                  age                  =                                   13               ;

         //Ornek 1:Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        //String 'lere verilen degerler cift tirnak icinde olmalidir.
        //String ler icinde "default value""null"dir.

        String studentName = "Ali Can";

                /*
                Java'da temelde iki tip data vardir;
                1)primitiv data type:
                char:Tek karakterler icin kullanilir.A,x,5
                boolean:Sadece iki farkli deger alabilirler; true veya false
                byte:-128 den +127 ye kadar tamsayi degerleri icin kullanilir.
                short--32768 ile +32767 arasindaki tam sayilar icin kullanilir.
                int:-2,147,483,648 ile +
                long:
                -float-double
                2)non-primitive data type
                 */
        //Ornek:char data type inde ilk ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.
        //Note:char data type nde degerler tek tirnak icine konulmalidir.
        char isminIlkHarfi = 'A';
         //Ornek:boolean data type nde emekli misin icin bir variable olusturun ve false degerini atayin.
         boolean emeklimisin =false;
         //Ornek :byte data type nde ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte studentAge = 23;
        //Ornek:Site nufusu icin bir variable olustrun.
         short siteNufusu = 1200;
         //Ornek: Ulke nufuslari icin bir variable olusturunuz.
        int countryPopulation =18777777;
        //Ornek:insan vucudundaki hucre sayisi icin bir variable olusturunuz.
        long cellNumberInHumanBody = 23456677888999000L;
        long weightSun = 1234567;


    }


}
