package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Exm01 {

    public static void main(String[] args) {
        //task- girilen sayının - or + oldugunu create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = sc.nextInt();

        if (sayı > 0) {
            System.out.println("sayı pozitif");
        } else if (sayı < 0) {
            System.out.println("sayı negatif");
        } else {
            System.out.println("nötr");

        }


    }
}
