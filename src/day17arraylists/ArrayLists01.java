package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {

    /*
    1;ArrayListler coklu data depolamak icin kullanilir.
    2'.'''''''non-primitiv data typendeki coklu datalari depolamak icin kulllanilir.
    listler non-primitiv data kabul ederler,,Arraylere non-primitiv konulmaz ..primitiv data vey areference kabul eder.
    3.ArrayListleri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
    4listler eleman ssyisinda flexible dirlar ama Arraylar degildirler.ne kadar eleman koyarsan kabul edrler.
    madem Arraylar eleman sayisinda flexible degil nicin Java Arrayleri iptal etmedi...
    eleman sayisi belli olan datalari depolamak icin Arrayler tercih edilir...
    Arrayler cok hizli calisir ve memoryde cok az yer kaplar..
     */



    public static void main(String[] args) {

//list nasil olusturulur?                    Constracter
                ArrayList<Integer> ages=new ArrayList<>();

        System.out.println(ages);//[] eleman eklemedigim icin bos verdi..

        //ArrayList lere nasil eleman eklenir?

        ages.add(12);
         ages.add(9);
        ages.add(888);//[12, 656, 9, 777, 888]sona eleman eklemek icin add index gerek yok.

        ages.add(1,656);
        ages.add(3,777);//[12, 656, 9, 777]

        System.out.println(ages);//[12]//[12, 9]
        //Listte eleman eklemk icin add metodunu kullaniriz ..
        //add() metodu elemanlari sizin verdiginiz sirayla list e ekler.(insertion order)

        //Liste coklu eleman nasil eklenir?veya Liste baska bir List nasil eklenir?
        //Bir LIste coklu eleman eklemke icin o elemani once bir listin icine koymalisinz.
        ArrayList<Integer>newAges=new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        ages.addAll(newAges);
        System.out.println(ages);//[12, 656, 9, 777, 888, 8, 9, 10]


//Bir Listteki tum elemanlari nasil silebilirim?

        ages.clear();
        System.out.println(ages);//[]
     //Bir elemanin Liste var olup olmadigini nasil kontrol ederiz?

    boolean r=    ages.contains(656);
        System.out.println(r);

        //Bir list in baska


        ArrayList<Integer>nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer>nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean t = nums1.equals(nums2);
        System.out.println(t);//true


    }
}
