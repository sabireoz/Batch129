package day16multidimensionalarrys;

public class Md05 {
    public static void main(String[] args) {

        //exampli;Bir integer multi-dimensional array olusturunuz;
        //Bu arraydaki tum elemanlarin carpimini console yazdiran kodu yaziniz.

        int a[][]={{2,5},{4,7,11}};
         int carpim =1;


        for (int[] w : a){
            for (int k:w){
                carpim=carpim*k;

            }
        }

        System.out.println(carpim);//3080
    }
}
//https://files.slack.com/files-pri/T04653D84MB-F04GBMSL9SS/image.png