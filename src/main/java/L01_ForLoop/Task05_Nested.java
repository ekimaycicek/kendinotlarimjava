package L01_ForLoop;

public class Task05_Nested {


    public static void main(String[] args) {
        /* task--- X
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        seklini print eden code create ediniz

         */

        for (int i = 1; i <=6 ; i++) {


            for (int j =1; j < 6; j++) {
                System.out.print("# ");
            }
            System.out.println();// dumy -> hayalet islevi olmayan satır atlatan komut
        }


    }

}
