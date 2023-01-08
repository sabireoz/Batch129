package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
      Java'da method nasil olusturulur?
      1)main method un disinda olusturulur.
      2)Access Modifier + Return Type + Method Ismi + () + {}
      //Olusturulan  method'lar nasil kullanilir?
      1.main method un icinden kullanilir.
      2.method un ismini + () yazin.
     */
    public static void main(String[] args) {

         int sonuc =add(3, 5);
         System.out.println(sonuc);
        System.out.println("carpmaSonucu");

         System.out.println("uclu sonuc");

    }


    public static int add(int a,int b){

        return a+b;
    }
   // protected long multyply (int , int ){

      //  return a*b;
    }
    //Ornek 1: verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.

    //private int firstTwoMultiplyThirdAdd(short a,short b,short c){
      //  return a*b+c;
    //}
    //Ornek 2:Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz.

    //Note:Access Modifier i defoult yapmak access modifieri yazmayiniz
     //static double getCube(double a){
       // return  a*a*a;



