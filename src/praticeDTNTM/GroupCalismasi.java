package praticeDTNTM;

import java.util.Scanner;

public class GroupCalismasi {

    public static void main(String[] args) {

            //String bir non-primitive data type'dir ve ayni zamanda bir class'dir.


                String s = "Java is easy";

                //Example 1: "s" String'indeki tum character'leri buyuk harf yapiniz.
                String sUpper = s.toUpperCase();
                System.out.println(sUpper);//JAVA IS EASY

        //2.yol
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz.");
        String cumle=scan.nextLine().toUpperCase();
        System.out.println(cumle);

                //Example 2: "s" String'indeki tum character'leri kucuk harf yapiniz.
                String sLower = s.toLowerCase();
                System.out.println(sLower);//java is easy

                //Example 3: "s" String'indeki ilk character'i aliniz.
                char firstChar = s.charAt(0);
                System.out.println(firstChar);//J
        //2.yol
        System.out.println("lutfen bir cumle giriniz.");
        String cumle01= scan.nextLine();
         char harf= cumle01.charAt(0);
        System.out.println(harf);


                //Example 4: "s" String'indeki ikinci ve sondan ikinci character'i aliniz ve ekrana yanyana yazdiriniz.
                char secondChar = s.charAt(1);//a
                char secondLastChar = s.charAt(10);//s
//2.yol
        String ali="Grubumuza hosgeldiniz.";
        char p=ali.charAt(1);
        char b=ali.charAt(19);
        System.out.println(p);
        System.out.println(b);
                //1.Yol: Ayni satirda yazdirmak icin
                System.out.print(secondChar);
                System.out.println(secondLastChar);

                //2.Yol: Ayni satirda yazdirmak icin
                System.out.println("" + secondChar + secondLastChar);
// "c 'stringindeki n harflerini xxx ceviriniz
        String c="komsunun tavugunu";
        String k=c.replace("n","xxx");
        System.out.println(k);

               //Example 5: "s" String'inde kullanilan character sayisini bulunuz.
                int sLength = s.length();
                System.out.println(sLength);//12

                //Example 6: "s" String'indeki ilk 4 characteri aliniz.
                //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4)
                String sub1 = s.substring(0, 4);
                System.out.println(sub1);

                //Example 7: "s" String'indeki "is" kelimesini aliniz.
                String sub2 = s.substring(5, 7);
                System.out.println(sub2);

                //Example 8: "s" String'indeki "easy" kelimesini aliniz.
                String sub3 = s.substring(8, 12);
                System.out.println(sub3);

                //Bir character'den baslayip String'in sonuna kadar almak isterseniz, ikinci index'i yazmayiniz
                //s.substring(8, 12); yerine s.substring(8); yaziniz
                String sub4 = s.substring(8);
                System.out.println(sub4);

                //Example 9: "s" String'inde "money" kelimesinin var olup olmadigini kontrol ediniz.
                boolean isExist = s.contains("Java");
                System.out.println(isExist);

        /*
            Bir method'u ogrenirken 3 sey mutlaka ogrenin;
            i)Bu method ne is yapar?
            ii)Bu method'un farkli kullanimlari nasildir?
            iii)Bu method size ne return eder?

         */

                //Example 10: "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.
                boolean isStart = s.startsWith("Java");
                System.out.println(isStart);

                //Example 11: "s" String'inin 6. characterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz.
                boolean isBegin = s.startsWith("i", 5);
                System.out.println(isBegin);
        String m = "Learn Java earn money";

        //Example 1: "s" String'inin "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Example 2: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.
        String s1 = s.replace("money", "dollar");
        System.out.println(s1);// Learn Java earn dollar

        //Example 3: "s" String'indeki "earn" kelimesini "win" kelimesine ceviriniz.
        String s2 = s.replace("earn", "win");
        System.out.println(s2);// Lwin Java win money

        //Example 4: "s" String'indeki "a" harflerini "*" a ceviriniz.
        //Note: replace() method'unda coklu character ile calisirsaniz mecbur cift tirnak kulanacaksiniz
        //      Ama tek character ile calisirsaniz cift tirnak veya tek tirnak kullanabilirsiniz.
        String s3 = s.replace('a', '*');
        System.out.println(s3);// Le*rn J*v* e*rn money

        //Note: Ama ya ikisi de cift tirnak olmalidir, ya da ikis de tek tirnak olmalidir.
        //Example 5: "s" String'indeki "n" harflerini "XXX" a ceviriniz.
        String s4 = s.replace("n", "XXX");
        System.out.println(s4);// LearXXX Java earXXX moXXXey

        //Example 6: "s" String'indeki tum "e" harflerini siliniz
        //Note: "Hicbir sey" char data type'inda yok bu yuzden replace() method'u kullanarak silme islemi yaparsaniz mutlaka cift tirnak kullaniniz.
        String s5 = s.replace("e", "");
        System.out.println(s5);// Larn Java arn mony

        String t = "Semih 10 yasindadir!...";

        //Example 7: "t" String'indeki tum rakamlari(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) "*" a ceviriniz
        //Note: Bir grup data'yi degistirmek icin replaceAll() kullanilir.
        //Note: Bir grup data'yi ifade etmek icin "Regular Expressions"(Regex) kullaniriz.
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//ali ** yasindadir

        /*
                                    Meshur Regex'ler

                1) Tum rakamlar ==> [0-9]
                2) Tum kucuk harfler ==> [a-z]
                3) Tum buyuk harfler ==> [A-Z]
                4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
                5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
                6) Tum noktalama isaretleri ==> \\p{Punct}
                7) Tum sesli harfler ==> [aeiouAEIOU]
                   x, q, w harfleri ==> [xqw]

                8) Kucuk harflerden farkli tum character'ler ==> [^a-z]
                9) Tum harflerden farkli tum character'ler ==> [^a-zA-Z]

         */

        //Example 8: "t" String'indeki tum rakamlari ve harfleri "!" e ceviriniz
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);// !!! !! !!!!!!!!!!!...

        //Example 9: "t" String'indeki tum sesli harfleri "?" e ceviriniz
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);//Al? 13 y?s?nd?d?r!...

        //Example 10: "t" String'indeki kucuk harfler disindaki tum character'leri "<>" ceviriniz//^^sift6 den farkli demek
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);// <>li<><><><>yasindadir<><><><>

        //Example 11: "t" String'indeki tum harfler disindaki tum character'leri "+" ceviriniz
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);

        //Example 12: "t" String'indeki space'ler disindaki tum character'leri "+" ceviriniz
        String t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6);// +++ ++ ++++++++++++++

        //Example 13: "t" String'indeki sesli harfler'ler disindaki tum character'leri "&" ceviriniz
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);// A&i&&&&&a&i&&a&i&&&&&

    }
}
