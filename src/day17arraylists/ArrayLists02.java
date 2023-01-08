package day17arraylists;

import java.util.ArrayList;
import java.util.List;


public class ArrayLists02 {
    public static void main(String[] args) {

//Array list olustururken sag tarafa (constractor)ArrayList yazmak zorundasiniz.
        //ama sag taraf ArrayList yazin isterseniz de List yazin ikiside calisir.
        //List<Character>initials=new ArrayList<>();
        ArrayList<Character>initials=new ArrayList<>();

        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //Bir Listte kac eleman oldugunu nasil hesaplariz.
        int numOfElement=initials.size();
        System.out.println(numOfElement);//4
       //Note;Arraylerden bahsederken 'lenght' kullanin, Listlerden bahsedrken "size"kullanin.

      char u  =initials.get(2);//M
        System.out.println(u);//M
        //Example; Verilen bir String List teki elemanlarinin toplam karakter sayisini bulan kodu yazinz.

        List<String>cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        //1.yol REcomended
        int toplam=0;
        boolean sum;
        for (String w: cities){
//          sum=sum +w.length();

}

  //      System.out.println(sum);

//2.yol
       // int toplam=0;
        for (int i=0; i<cities.size(); i++){
           toplam = toplam+cities.get(i).length();

        }
        System.out.println(toplam);
// Example2;;Bir listedeki istenen bir elemani nasil degistirebiliriz...


        cities.set(0,"New York");
        System.out.println(cities);

        //example 3;maas list ini olusturunuz v emaaslara %20 zam yapiniz..

        List<Double> salary =new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);

        int idx =0;
        //for kullanirsaniz
        for (Double w: salary){
          salary.set(idx, w*1.20);

          idx++;

        }
        System.out.println(salary);

//remove() methodu index ile kullanilirsa o index'te ki elemani siler.
//remove() methodu index ile kullanilirsa size sildigi elemani verir.
        String n = cities.remove(1);
        System.out.println(n);//Istanbul
        System.out.println(cities);//[Miami, Kayseri, Almaty, Kayseri]

//remove() methodu eleman ile kullanilirsa ilk gorunumu siler.
//remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden
//true veya false verir.
//Eger eleman List'te var ise o elemani siler ve size true der.
//Eger eleman List'te yok ise o elemani silemediginden  size false der.
        boolean p = cities.remove("Kayseri");
        System.out.println(p);//true
        System.out.println(cities);//[Miami, Almaty, Kayseri]
    }
}
