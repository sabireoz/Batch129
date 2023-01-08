package day03scanner;

public class Runner {

    public static void main(String[] args) {

        //object nasil olusturulur?
        //constructor:isi yapan
        //class ismi  obje ismi atama operatoru    new keybord          constructor
        Car          myCar         =               new                 Car();

        System.out.println(myCar.fiyat);
        System.out.println(myCar.model);
        myCar.hareket();
        myCar.dur();

        Student tomHanks= new Student();
        System.out.println(tomHanks.name);
        System.out.println(tomHanks.grade);
        tomHanks.study();
        tomHanks.feed();



    }
}
