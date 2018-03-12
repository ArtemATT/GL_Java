public class Calculator {

    public static void main(String[] args) {

        int numberOfTerms = 125;
        System.out.println(calcPi(numberOfTerms));

    }

    public static double calcPi (int n) {
        double pi = 0;
        double divider = 1;

        for (int i = 0; i < n; i++) {
            pi += 4 / divider * Math.pow(-1, i);
            divider += 2;
        }
        return pi;
    }
}
