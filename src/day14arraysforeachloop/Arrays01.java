package day14arraysforeachloop;
import java.util.Arrays;

import java.lang.reflect.Array;

public class Arrays01 {
    public static void main(String[] args) {
        //String array olusturun icine 5 tane eleman ekleyin,ilk eleman ile son elemanin
        //icerdigi karakter sayilari toplamini ekrana yazdirin.
        String arr[]=new String[5];

        arr[0]="Math";//ilk elemani 0 ile ifade ediyoruz.
        arr[1]="Science";
        arr[2]="music";
        arr[3]="English";
        arr[4]="art";
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].length()+arr[arr.length-1].length());//7

        //String array olusturun icine 5 tane eleman ekleyin,ilk eleman ile son elemanin
        //       icerdigi karakter sayilari toplamini ekrana yazdirin.

        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Atina";
        System.out.println();

        //1.Yol: for-loop
        int totalChar = 0;

        for(int i=0; i<brr.length; i++){
            totalChar = totalChar + brr[i].length();
        }
        System.out.println(totalChar);// 32

        //2.Yol: for-each-loop(enhanced loop) ==> baslangic degeri, loop'un calisma sarti, ve increment/decrement kismini kendisi halleder
        //       for-each-loop "Array" lerde ve "Collection" larda kullanilir.
        //       Index kullanmaniz gerektiginde bazen "for-each-loop" caresiz kalir, mecburen diger loop'lari kullaniriz.

        int sum = 0;
        // Miami, Istanbul, Frankfurt, Dhaka, Athena
        for(String w : brr){
            sum = sum + w.length();
        }
        System.out.println(sum);//33
        //Example2:

    }
}

