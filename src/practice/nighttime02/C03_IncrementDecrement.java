package practice.nighttime02;

public class C03_IncrementDecrement {


    public static void main(String[] args) {

        int a = 12;
        int b = a++;//Post Increment:sonradan artirma...
        System.out.println(b);
        System.out.println(a);
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int x = 15;
        int y = x--;//Post Decrement;;azaltma..
        System.out.println(x);
        System.out.println(y);
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int m = 21;
        int n = ++m;//Pre Increment
        System.out.println(m);
        System.out.println(n);
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int t = 32;
        int u = --t;// Pre Decrement
        System.out.println(t);
        System.out.println(u);
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\

        int sayı = 10;
        sayı++;//11
        System.out.println(sayı);
        sayı++;//12
        System.out.println("pre-incrementten once " + sayı);//12
        System.out.println(" pre-increment satırında " + ++sayı);//13
        System.out.println("pre-incrementden  sonra" + sayı);//13

        System.out.println("post-increment satırında" + sayı++);//13 sonradan artirma
        System.out.println("post-incrementdan sonra " + sayı);//14
        System.out.println(9f / 2f);//4.5 ilk atama yaparken float yazariz ama sonucta float yazmaz
        System.out.println(9 / 2);//4 in /int virgulden sonraki kismi yazmaz

///////// ****************************************** \\\\\\\\\\\\\\\\\\\\

        int num = 15;
        int num2 = num++;
        System.out.println(num2);//15
        System.out.println(num);//16

        int sayı1 = 10;
        int sayı2 = 20;
        int sayı3 = 30;

        sayı2 = sayı1++;//11,10,30
        System.out.println(sayı1 + "," + sayı2 + "," + sayı3);

        sayı3 = ++sayı1;//12
        System.out.println(sayı1 + "," + sayı2 + "," + sayı3);

        System.out.println(sayı3++);//

        System.out.println(--sayı2);//9

        System.out.println(sayı3++);//13

        System.out.println(sayı3);//14
    }//main
}
