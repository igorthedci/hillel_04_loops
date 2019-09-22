/**
 * 9. Write a program which prints the next figure to the console:
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 * *******
 */
public class task_09_star_stairs {

    public static void main(String[] args) {

        int heightStairs = 6;

        for (int i = 0; i < heightStairs; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
