package j11_MethodCreation;

import java.util.Scanner;

public class _01_method1 {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("değer giriniz: ");
        int max =sc.nextInt();
        System.out.println("randomNum() = " + randomNum(max));


    }// *** main sonu ****


    public static double randomNum(int max) {

        double max2=Math.random()*max;

        return max2;



    }


}
