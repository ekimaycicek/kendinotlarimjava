package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Exm04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        /* task- girilen karakterin harf olup olmadığını kontrol eden code creeate ediniz

         */

        System.out.println("karakter giriniz: ");

        char ch=sc.nextLine().charAt(0);

        if ((ch>='A' && ch<='Z' ) || (ch>='a' && ch<='z')) {
            System.out.println("ch harftir");
        }
        else System.out.println("karakter harf değildir");

    }
}
