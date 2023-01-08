package day14arraysforeachloop;

public class Arrays04 {
    public static void main(String[] args) {


//Example 1:String bir array olusturunuz,6 eleman ekleyiniz, Yellow'dan onceki elemanlari yazdiriniz

        String colors[]=new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";

//Example 2:String bir array olusturunuz,6 eleman ekleyiniz, Yellow'dan sonraki elemanlari yazdiriniz
        String color[]=new String[6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";
       //1.yol

        //Elemanlari almaya son elemandan baslyacagim icin for-each loop kullanamm bu yuzden for-loop kullandim.
        for (int i=color.length-1;i>=0;i--){

            if (color[i].equals("Yellow")){
                break;
            }
            System.out.println(color[i]);
        }
       //2.yol
       //Yellow elemaninin indexsini bul v eo indexden daha fazla indexse sahip olan elemanlari yazdir.

       int counter =0;
        for (String w:color){
            if (w.equals("Yellow")){
                break;
            }
            counter++;
        }
        for (int i=counter+1; i<color.length;i++){
            System.out.println();
        }


    }
}
