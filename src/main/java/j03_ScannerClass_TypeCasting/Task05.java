package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {


        // kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("2 tam sayı belirtiniz" );
        System.out.println("x");
        int x= sc.nextInt();
        System.out.println("y");
        int y=sc.nextInt();
        System.out.println("x+y: "+ (x+y) );
        System.out.println("x-y: "+ (x-y) );



    }
}
