package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {
        int a=12;//bu yapinin icinde sadece bir tane data depolanabilir.
        //ama biz code yazarken bir yapinin icinde coklu data depolma ihtiyaci hissederiz.
        //bir yapinin icinde coklu data depolayabilme icin Jva Array yapisini olusturmustur.

        //Array nasil olusturulur?/
//Array olusturmak icin Array elemanlarinin data type ve eleman sayisi mutlaka yazilmalidir.
        String stdNmes[]=new String[5];
        System.out.println(stdNmes);//@49e4cb
//Array cosole nasil yazdirilir?
        //toString()methodunu kullanmadan sadece array ismi ile yazdirirsaniz Jva o Array ismini yazdirir.
        System.out.println(Arrays.toString(stdNmes));//[null,null,null,null,null]

        //Array e eleman nasil eklolenir
        stdNmes[2]="Ajda";
        stdNmes[0]="Cuneyt";
        stdNmes[1]="Kemal";
        stdNmes[4]="Besir";
        System.out.println(Arrays.toString(stdNmes));//cuneyt,
        //Array da spasifik bir elemani yazdirmak

        System.out.println(stdNmes[2]);

        //Example 1: Array'deki her elemani sonuna "!" isareti koyarak ekrana yazdiriniz.
       // for(int i=0; i< stdNames.length; i++){
         //   System.out.println(stdNames[i] + "!");
        }
  }

