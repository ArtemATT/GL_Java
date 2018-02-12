package Java_Courses;

public class Disks {
    public static void main(String[] args) {
        // 100d - 100UAN
        // 20d - 30UAN
        // 1d - 2UAN
        // n - number of disks

        int n = 447;
        int pack100 = n / 100;
        int pack20 = n % 100 / 20;
        int pack1 = n - pack20 * 20 - pack100 * 100;
        int sum = 0;

        if (n % 100 == 0)
        {
            sum = pack100 * 100;
            System.out.println(sum);
        }

        else {
            if (n % 100 % 20 == 0)
            {
                sum = pack100 * 100 + pack20 * 30;
                System.out.println(sum);
            }

            else sum = pack100 * 100 + pack20 * 30 + pack1 * 2;
            System.out.println(sum);
        }
    }
}

