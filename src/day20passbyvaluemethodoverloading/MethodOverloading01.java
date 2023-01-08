package day20passbyvaluemethodoverloading;

public class MethodOverloading01 {
    public static void main(String[] args) {

//ayni isimde farkli islemler olusturmak.overload asiri yukleme demek..
//method overloading yaparken metod  ismi degistirilmez.parametreler degistirilir.peki nasil degistirilir
        //1.data type degistirilebilir..
        //2.parametre degistirirkem parametrelerin data typeleri farkli ise yerleri degistirilebilir..
        //3.parametre degistirirken parametrelerin sayisi dgistirilebilir.
        //Java icin ismi ve parametreleri ayni olan iki metod tamamen aynidir ..
        //bu yuzden ismi ve parametre Method Signature olarak adlandiririlir.
        //method overloandig olustuturken return type i degistirmenin hicbir etkisi yoktur.
        // metod o. olusturuken Accses modiferi degistirmenin hicbir faydasi yoktur.
        //metodu statik vaya non statik yapmanin faydasi yoktur.
        //method bady i degistirmenin de hic bir etkisi yoktur.
        //private methodlar overload edilebilir.cunku method overloading sadece bir clasin icinde olur.
        // private olamk ise baska claslara gidildigimde sikinti olur.
        //"statik"methodlar overload edilebilirler..S
        add(3, 5);


    }

    private static void add(int a, int b) {//void demek ekran abirsey yazdiriyorsun demek
        System.out.println(a + b);
    }


    public static double add(double a, double b) {//int demek return ediyorsun demk
        return  (a + b);
    }

    public static void add(double a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, double b) {
        System.out.println(a + b);

    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b);
    }
}
