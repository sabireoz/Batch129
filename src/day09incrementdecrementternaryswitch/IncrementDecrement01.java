package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {

    public static void main(String[] args) {



        int a = 5;
        System.out.println(a);//5

        //increment//


        a= a+2;// veya a   +=2;
        System.out.println(a);//7

        // ornk:bir tane int olusturun ve omu iki sekilde 5 artirin.

        int b=10;
        System.out.println(b);//15
        b=b+5;

        //2.yol
        b  +=5;
        System.out.println(b);

        //decrement//

        int c=8;
        System.out.println(c);//8
        c=c-3;
        System.out.println(c);//5

        c  -=3;
        System.out.println(c);//2

        //inc 2//
        int d=6;
        System.out.println(d);//6
        d=d*2;
        System.out.println(d);//12

        d  *=2;
        System.out.println(d);//24
//decrement2//

int e=24;
e=e/2;//12

        System.out.println(e);//12

                e  /=2;
        System.out.println(e);//6

        //1 ile ingrement ve decrement//

        //f=f+1;

        //f+=1;
       // f++;//

        //1 ile decrement
        //h=h -1;
        //h -=1;
       // h--;

        //post ingrement ve pre increment
        int i=10;
        int k=i++;//post increment  cunku increment variable isminden sonra yazildi.

        System.out.println(k);//10

        System.out.println(i);//11

        int m=15;
        int n=++m;// pre-increment cunku increment variable in isminden once yazildi.
        System.out.println(m);//16
        System.out.println(n);//16

        // post-decrement ve pre-decrement//

        int p=17;
        int r=p--;//16
        System.out.println(p);
        System.out.println(r);

        int s=20;
        int t=--s;
        System.out.println(s);//19
        System.out.println(t);//19






    }

}
