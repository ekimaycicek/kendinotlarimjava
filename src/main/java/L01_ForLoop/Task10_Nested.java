package L01_ForLoop;

import java.util.Scanner;

public class Task10_Nested {
    public static void main(String[] args) {
        /*
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */
        Scanner sc=new  Scanner(System.in);


        System.out.println("bir cumle giriniz : ");

        String  cumle=sc.nextLine();
        System.out.println("sayılacak harfi giriniz : ");

        char harf=sc.next().charAt(0);
        int harfSayisi=0;//ilk değer 0 atandıkı sayma da etki etmesin


        for (int i = 0; i <cumle.length(); i++) {

            if(cumle.charAt(i)==harf){
                harfSayisi++;

            }

        }

        System.out.println("girdiğiniz cümle: " + cumle+"de istediğiniz harf : " + harf + harfSayisi+ "kadar var" );



    }
}
