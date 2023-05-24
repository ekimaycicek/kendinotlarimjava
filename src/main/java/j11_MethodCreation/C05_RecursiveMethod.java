package j11_MethodCreation;

import java.util.Scanner;

public class C05_RecursiveMethod {
    /*
Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
Peki özyinelemeyi neden kullanıyoruz?
Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
 */
    public static void main(String[] args) {
/*
Faktoriyel girilen sayıdan 1 e kadar olan tamsayıların çarpımına denir
1!=1 0!=1 2!=2*1... 6!=6*5*4*3*2*1
Task girilen sayının faktöriyelini hsaplayan method create ediniz.
 */
        Scanner sc=new Scanner(System.in);
        System.out.print("bir tam sayı giriniz: ");
        int sayi= sc.nextInt();
        System.out.println("fc(sayi) = " + fc(sayi));
    }// *** main sonu ***

    public static int fc(int a){
        if(a>=1){

            return a*fc(a-1);

        }else return 1;


    }


}