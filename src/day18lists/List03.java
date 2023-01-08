package day18lists;

import java.util.ArrayList;
import java.util.List;

public class List03 {
    public static void main(String[] args) {

        //Example1:Bir Intiger Listedeki 7 haric tum elemanlarin degerini 3 artiriniz.

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(11);
//1.yol
        for (Integer w:nums){
            if (w==7){
                continue;
            }
                nums.set(nums.indexOf(w),w+3);//set metodu index kullanmak zorunda..
        }
        System.out.println(nums);

//2. yol :
        for (int i=0; i<nums.size(); i++){
            int element =nums.get(i);
            if (element ==7){
                continue;
            }
            nums.set(i, element +3);
        }
        System.out.println(nums);  //[18, 19, 7, 18, 17]
        /*
        nums.indexof(w)ilk gorunumun indexini verir.List tekrarli elemana sahip ise
        num.indexof kullanimi risk olusturabilir.bu yuzden bu soruda en guvenilir yol for looptur.s
         */
    }
}


