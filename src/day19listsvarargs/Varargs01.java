package day19listsvarargs;

public class Varargs01 {

        public static void main(String[] args) {

            addTwoNumbers(3, 5);

            addThreeNumbers(4, 7, 2);

            add(4, 5, 6, 7, 8, 9);

        }

        //Iki sayiyi toplayan method olusturunuz
        public static void addTwoNumbers(int a, int b){
            System.out.println(a+b);
        }

        //Uc sayiyi toplayan method olusturunuz
        public static void addThreeNumbers(int a, int b, int c){
            System.out.println(a+b+c);
        }

        //Istediginiz sayida sayiyi toplamak icin bir method olusturunuz
        public static void add(int... a){

            int sum = 0;

            for(int w : a){
                sum = sum + w;
            }

            System.out.println(sum);
//varagslar dipsiz kuyu gibiler..
            //bir methodda birden fazla varags parametre kullanilamaz cunku ikincisi unreachable code olur.
            //varrags ,varargs disindaki parametrelerle kullanilabilir ama varag hep en son parametre olmalidir...



        }

    }
