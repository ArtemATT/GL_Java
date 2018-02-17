package Java_Courses;

public class FirstOrLast {
    public static void main(String[] args) {
        int number = 474;
        int firstDigit = number/100;
        int lastDigit = (number - (firstDigit * 100))%10;

        if (firstDigit == lastDigit) System.out.println("=");

        else if (firstDigit > lastDigit) System.out.println(firstDigit);

        else System.out.println(lastDigit);
    }
}
