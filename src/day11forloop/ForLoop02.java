package day11forloop;

public class ForLoop02 {

    public static void main(String[] args) {

        //Verilen bir Stringde a karakteri haric tum karakterleri yazdiriniz.
        //"Madagaskar"==>Mdgskr
        String s="Madagaskar";
        //1.yol
        String t= s.replace("a","");
        System.out.println(t);//

        //2.yol
        //2.Yol:
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!='a'){
                System.out.print(ch);
            }
        }

        System.out.println();

        //3.Yol: Madagaskar
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a'){
                continue;//continue keyword'u bazi sartlar icin loop'un adimlarini atlamamizi saglar
            }
            System.out.print(ch);
        }

    }
}
