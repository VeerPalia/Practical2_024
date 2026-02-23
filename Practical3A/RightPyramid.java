public class RightPyramid {
    public static void main(String[] args) {

        // Star Inverted Pyramid
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Number Pattern
        int num = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
                if (num == 10) {
                    num = 1;
                }
            }
            System.out.println();
        }
    }
}