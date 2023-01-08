package day18lists;

import java.util.ArrayList;
import java.util.List;

public class List01 {


    //Arrayler eleman sayisinda fixtirler..Ama listler eleman sayisinda rahattirlar..
    //Arrayler sadece primitiv data typlerini kabul ederler..listler non primitiv data rypini kontrol edr.

    //Arrayler daha hizli calisir ve memoryde daha aza yer kaplarlar
    //add metodu =addAll==bunlarin indekslisi
    //eleman silmek icin r
    // emove indexle kullanmak ve elemanla kullanmak...
    public static void main(String[] args) {


        //1Example 1;Integer bir List olusturunuz
        // Liste 5 tane eleman ekleyiniz
        //bu elemanlardan 12 yi siliniz.

        List<Integer>ages=new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(40);

        // siz java da tamsayi yazdiginizda Java o tam sayinin data tpini otomatik olarak primitiv int kAbul edre.
        //Bu yuzden remove () methodunun

        //1.yol
        //Integer nonPrimitive=12;//memoyde yeni bir yer acildi
        //ages.remove(nonPrimitive);

        //2.yol
        ages.remove((Integer)12);//tavsiye edilen..
//3.yol
       // ages.remove(Integer.valueOf(12));//2 method kullanildi
//4.yol
       // ages.remove(ages.indexOf(12));//2 method kullanildi
       // System.out.println(ages);

        //1Example 2;Integer bir List olusturunuz
        // Liste 5 tane eleman ekleyiniz
        //bu elemanlardan tum 12leri  siliniz.

        List<Integer>nums=new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);
 List<Integer>silinecekler=new ArrayList<>();
 silinecekler.add(12);
 nums.removeAll(silinecekler);
        System.out.println(nums);





    }


}
