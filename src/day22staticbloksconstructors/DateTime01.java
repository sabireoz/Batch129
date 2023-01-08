package day22staticbloksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

import static java.time.LocalDateTime.*;

public class DateTime01 {

    public static void main(String[] args) {

        Date myDate=new Date();
        System.out.println(myDate);//Sat Jan 07 22:27:06 EET 2023

myDate.getTime();
        System.out.println(myDate.getTime());//1673123324088 1ocak 1970 den beri olan milisaniyeler
        //icinde bulundugumuz an nasil alinir?

        LocalDate.now();
        System.out.println(LocalDate.now());//2023-01-07

        LocalTime.now();
        System.out.println(LocalTime.now());//22:35:14.419134400

        now();
        System.out.println(now());//2023-01-07T22:36:40.881030600

//Dunyanin her hangi bir saat dilimindeki saati nasil aliriz?

     //  LocalDateTime.now().(ZoneId.of(Europe/Paris)).;
      //  System.out.println(LocalDateTime.now().atZone("Europe/paris"));
     //Ileriki bir tarihe nasil gidilir?
     //oncelikle suan ki tarihi aliriz

     LocalDate.now().plusYears(7);
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-06-07//2030-07-12

//gecmis tarihe nasil gidilir
        //simdikini aliriz ve minus deriz
        System.out.println( LocalDate.now().minusYears(4).minusMonths(3));//2018-10-07

        //ileriki bir zamana naasil gidilir?


        System.out.println( LocalTime.now().plusHours(3).plusMinutes(34));//02:30:45.382674900
//Geriki bir tarihi nasil gidilir?

        System.out.println(LocalTime.now().minusMinutes(45));//22:14:30.145098900

//zamanda belli bir bolumu nasil aliriz?

        System.out.println(LocalTime.now().getHour()+"."+LocalTime.now().getMinute());//23.1

        //tarih de belli bir bolumu nasil aliriz?




    }
}
