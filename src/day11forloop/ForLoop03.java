package day11forloop;

public class ForLoop03 {
    public static void main(String[] args) {

        //eXample;Size verilen bir Stringi tersden yazdirinz.******************

        //"Germany"==>ynamreG

String s="Germany";
String t="";
for (int i=s.length()-1; i>0 ; i--){
    t=t+s.charAt(i);

}
        System.out.print(t);
        System.out.println();

//Size verilen bir Stringin "palidrome"olup olmadigini kontrol edinz.
        //civic.nalan,kucuk,111211
        //logic;stringi ters cevir sonrada duz hali ile ters halini karsilastir,ayni ise palidrome de.

        String duz="civic";
        String ters="";
       for (int i=duz.length()-1; i>=0; i--){
           ters=ters+duz.charAt(i);
       }
       if (duz.equals(ters)){
           System.out.println(duz+":Palidrome dur");
       }else {
           System.out.println(duz+"palidrome degildir.");
       }

    }
}
