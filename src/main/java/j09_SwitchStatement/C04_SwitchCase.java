package j09_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        // girilen ay hangi mevsimde oldugunu print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("ay giriniz: ");
        int ay= sc.nextInt();

        switch (ay){

            case 12:
            case 1:
            case 2:
                System.out.println("mevsim kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("mevsim ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("mevsim yaz");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("mevsim sonbahar");
                break;

            default:
                System.out.println("yanlış giriş");
        }

    }
}
