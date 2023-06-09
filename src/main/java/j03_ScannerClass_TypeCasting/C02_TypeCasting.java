package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {

    public static void main(String[] args) {

            /*
 byte < short < int < long < float < double
   Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina
Java  otomatik olarak yapar.

 */
        // boolean basarılı=true;
        // String basarı=basarılı; - doğal uyum olmayan variable larda cast
        //       ng yapılmaz

        double d=17;// double variable a int 17 ataandı
        System.out.println("d = " + d);// 17.0 auto widding
        int sayı1=33;
        int sayı2=7;

        System.out.println(sayı1/sayı2);//4
        /* java 2 int sayıyı böldüğümüzde sonucu int verir
        eğer bölme işleminde ondalık sonuc çıkarsa ondalık kısmı siler
         */
        byte b=127;
        int i=b;// küçük büyüğe atandı
        System.out.println("i = " + i);//127

        int num=1453;
        double d1=num;// k>B

        System.out.println("d1 = " + d1);//1453.0

        double db=d1/num;

        System.out.println("db = " + db);// sonuc double olur

        /*trick- 2 farklı data type işleme girerse küçük olan data
        için auto widding yapar sonucu büyük olan datatype olarak yapar
       */

        /*
 byte < short < int < long < float < double
 Explicit Narrowing Casting ->Buyuk data type'larini kucuk data type'larina cevirme islemini veri kaybndan dolayı
 Java otomatik olarak yapmaz. kod ile teyit ister...

 */

        double d2=14.53;
        int num2= (int) d2;// büyük>küçük
        System.out.println("num2 = " + num2);

        int num3=150;
        byte b1= (byte) num3;
        System.out.println("b1 = " + b1);//-106

        double d3=333;
        long l= (long) d3;
        System.out.println("l = " + l);

        double d4=571.4444;
        long l2= (long) d4;

        System.out.println("l2 = " + l2);

        /* task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         *
         */

        Scanner sc=new Scanner(System.in);//1-pc ye komut
        System.out.println("ascci değeri istediğin karakteri giriniz");// kullanıcıya komut
        char ch=sc.next().charAt(0);
        int chasciiDeger=ch;
        System.out.println("chasciiDeger = " + chasciiDeger);





    }
}
