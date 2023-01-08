package day03scanner;

public class Car {

    //Variable lar olusturalim.bunlar pasif ozellikler
    public String model ="Corolla";
    public int fiyat=20000;

    //methodlar olusturalim.return kelimesi kullanilmaz.aktif ozellikler
    //return type voud oldugunda method icinde return kelimesi kullanilmaz.
    //eger metod yeni bir hareket uretmiyorsa void kullanilir.
    public void hareket(){
        System.out.println("Corolla hizli hareket eder..");
    }

    public void dur(){
        System.out.println("Corolla guvenli bir sekilde durur");
    }

}
