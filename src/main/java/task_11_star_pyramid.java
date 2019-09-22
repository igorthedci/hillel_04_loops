/**
 *
 */
public class task_11_star_pyramid {

    public static void main(String[] args) {

        int heightPyramid = 7;

        String leftBranch, rightBranch;

        System.out.println("HAPPY CHRISTMAS!");
        for (int i = 0; i < heightPyramid; i++) {
            leftBranch = "";
            rightBranch = "";
            for (int j = 0; j < heightPyramid; j++) {
                if (j < i)
                    rightBranch += "*";
                else
                    leftBranch += " ";
            }
            System.out.println(leftBranch + rightBranch + "*" + rightBranch);
        }
    }
}
