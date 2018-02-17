package Java_Courses;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 235;
        int digit1 = n / 100;
        int digit2 = (n - digit1 * 100) / 10;
        int digit3 = n - digit2 * 10 - digit1 * 100;

        int res = digit1 * digit2 * digit3;
        System.out.println(res);
    }
}
