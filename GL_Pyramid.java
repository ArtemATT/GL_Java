public class Pyramid {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Pyramid with height '" + i + "':");
            printPyramid(i);
        }
    }

    public static void printPyramid(int h) {
        if (h > 9 || h < 1) {
            System.out.println("Can't print the Pyramid");
        } else {

            for (int i = 1; i <= h; i++) {

                for (int j = 1; j <= h - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }

                for (int j = i - 1; j > 0; j--) {
                    System.out.print(j);
                }

                System.out.println();
            }
        }
        System.out.println();
    }
}
