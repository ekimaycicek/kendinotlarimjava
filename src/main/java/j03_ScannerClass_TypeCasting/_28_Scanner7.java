package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */
        Scanner sc=new Scanner(System.in);
        System.out.println("Banka Hesabınız var mı:");
        Boolean bankahesabı=sc.nextBoolean();
        System.out.println("bankahesabı = " + bankahesabı);


    }
}
