/**
 * 10*. Write a program which prints the next figure to the console:
 * **********
 * *        *
 * *        *
 * *        *
 * **********
 */
public class task_10_star_square {

    public static void main(String[] args) {

        int widthCell = 10;
        int heightCell = 6;

        String horizontalSide = "";
        String verticalSide = "";

        // create the Cell sides
        for (int i = 0; i < widthCell; i++) {
            horizontalSide += "*";
            if (i == 0)
                verticalSide += "*";
            else if (i == widthCell - 1)
                verticalSide += "*";
            else
                verticalSide += " ";
        }

        // draw the Cell
        System.out.println(horizontalSide);
        for (int i = 1; i < heightCell - 1; i++)
            System.out.println(verticalSide);
        System.out.println(horizontalSide);
    }
}
