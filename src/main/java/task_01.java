/**
 * 1. Print numbers from 10 to 20 using all known cycles.
 *
 */

public class task_01 {

    public static void main(String[] args) {

        // WHILE
        int i = 10;
        System.out.println("WHILE");
        while (i <= 20) {
            System.out.print(i++ + " ");
        }
        System.out.println(" ");

        // DO-WHILE
        i = 10;
        System.out.println("DO-WHILE");
        do {
            System.out.print(i++ + " ");
        } while (i <= 20);
        System.out.println(" ");

        // FOR
        System.out.println("FOR");
        for (i = 10; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
}
