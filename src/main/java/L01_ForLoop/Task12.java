package L01_ForLoop;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının hesap eden code create ediniz
         */

        Scanner sc = new Scanner(System.in);
        int toplam=0;// ik değeri 0 olan toplama etki etmeyecek bir variable ...

        for (int i = 1; i <=5 ; i++) {
            System.out.println(i+". sayıyı giriniz : ");
            int sayı= sc.nextInt();
            if (sayı<=10 || sayı>=20){
                toplam+=sayı;

            }
        }
        System.out.println("girdiğiniz sayıların istenen sartta toplamı : " + toplam);
    }
}
