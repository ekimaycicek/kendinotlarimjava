package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("a");
        int a=sc.nextInt();

        System.out.println("b");
        int b=sc.nextInt();

        System.out.println("c");
        int c= sc.nextInt();

        System.out.println((a*a-b*b ) / (3.3 * c));

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */


    }
}
