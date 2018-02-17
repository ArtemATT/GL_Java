package Java_Courses;

public class Quarter {
    public static void main(String[] args) {
        int a = -43;
        int b = 14;

        if (a == 0 && b == 0) System.out.println("The point does not belong to any quarter");

        else if (a > 0)
        {
            if (b > 0) {
                System.out.println("First quarter");
            }
            else System.out.println("Fourth quarter");
        }

        else {
            if (b > 0) {
                System.out.println("Second quarter");
            }
            else System.out.println("Third quarter");
        }
    }
}
