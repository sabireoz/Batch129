package day11forloop;

public class ForLoop01 {
    public static void main(String[] args) {
        //example1:Verilen bir String de ilk a harfinden onceki tum karakterleri konsolo yazdiriniz.
        // "I love Java==>"Ilove J"
        String s = "I love Java";

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch == 'a') {
                break;
            }
            System.out.print(ch);//i love j
        }
        //example2;Verilen bir String de son a dan sonraki tum karakterleri ters yazdirinz.
        //"Germany"==>yn
        String t="Germany";
        for (int i=t.length()-1; i>=0;i--){
            if (t.charAt(i)=='a'){
                break;
            }
            System.out.print(t.charAt(i));
        }

//Example 2: Verilen bir String'de son 'a' dan sonraki tum character'leri ters sirada yazdiriniz
        //           "Germany" ==> yn
       // String t = "Germany";

        for(int i=t.length()-1; i>=0; i--){
            char ch = t.charAt(i);
            if(ch=='a'){
                break;
            }
            System.out.print(ch);
        }



    }

}