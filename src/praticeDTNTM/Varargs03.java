package praticeDTNTM;

public class Varargs03 {


    public static void main(String[] args) {


        //kac tane String verilirse verilsin iclerinden en uzun olani yazdiran kodu yaziniz.

        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Okan";
        String str4 = "Adnan";
        String str5 = "Sahsanem";
        enUzunIsim(str1,str2,str3,str4,str5);

    }

    private static void enUzunIsim(String ... str) {
        String enUzunStr="";
        for (String w : str){
            if (w.length()>enUzunStr.length()){
                enUzunStr=w;
            }
        }

        System.out.println("enUzunStr="+enUzunStr);//sahsenm
    }
}
