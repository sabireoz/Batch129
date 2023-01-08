package day18lists;

import java.util.ArrayList;
import java.util.List;

public class List04 {
    public static void main(String[] args) {

        List<String>names=new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");

        List<String>females=new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");
//names.containsAll(females) "names" Listinde females listindeki tum elemanlarin var olup olmadigini kontrol edr.
        //tamami varsa true verir,herhangi biri yoksa false verir.
       boolean r= names.containsAll(females);
        System.out.println(r);//false

     //names.sublist (1,4)names listindeki indexi 1,2 ve 3 olan elemanlari bir List in icinde size verir.
     //2,index olan 4 dahil edilmes.

   List<String>subList=names.subList(1,4);
        System.out.println(subList);//cuneyt,mahsun,muslum

        names.retainAll(females);
        System.out.println(names);//ajda
        System.out.println(females);//ajda,emel

//Example1;Elektronik aletler ve ev aletleri Listlerimiz var.
        //Elektronik ev aletlerini Listeleyiniz.

        List<String>electronics=new ArrayList<>();
        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refrigerator");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String> homeGoods = new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");

//homeGoods.retainAll(electronics) homeGoods ile electronics list'lerinin ortak elemanlarini homeGoods listi icinde verir.
        homeGoods.retainAll(electronics);

        System.out.println(homeGoods);// [Radio, TV]
//isEmpty();Listte hic eleman yoksa size true verir..1 veya daha fazla eleman varsa size false verir.
        //isEmpaty esasinda names.size()==0 demektir.

        names.isEmpty();

        System.out.println(names.hashCode()); //2041509


    }
}
