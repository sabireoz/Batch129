package praticeDTNTM;

public class ButcePratik05 {


// Tum aile uyelerinin birikiminin bulundugu ortak ihtiyaclar icin
// kullanildigi bir butce ile kisisel harcamalarin yapildigi
// harclik'larin oldugu basit bir ev bütçesi kodu yazınız.

    public static int butce;
    public int harclik;

    public  void harclik (int alinanHarclik){
        butce=alinanHarclik;//ortak hesaptan harcaniyor.
        harclik+=alinanHarclik;
    }

    public void butcedenHarca(int harcanacakPara){
        butce-=harcanacakPara;
    }
    public void harclikHarca(int harclikHarcamasi){
        harclik-=harclikHarcamasi;

    }
    public void maasAl(int alinanMaas){
        butce+=alinanMaas;
    }
}

