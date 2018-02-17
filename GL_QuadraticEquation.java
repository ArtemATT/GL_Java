package Java_Courses;

public class QuadraticEquation
{
    public static void main (String [] args)
    {
        int a = 1, b = -5, c = 6;

        SquareRoot(a,b,c);
    }

    private static void SquareRoot (int a, int b, int c)
    {
        double tmp = Math.sqrt(b*b-4*a*c);

        if (tmp > 0 && a !=0)
        {
            double x1 = (-b + tmp)/(2*a);
            double x2 = (-b - tmp)/(2*a);

            System.out.println("Two roots: " + (int)x1 + " " + (int)x2);
        }

        else if (tmp == 0 && a !=0)
        {
            double x1 = - b / (2*a);
            double x2 = x1;
            System.out.println("Two roots: " + (int)x1 + " " + (int)x2);
        }

        else if (tmp != 0 && a ==0)
        {
            double x1 = 0;
            double x2 = x1;
            System.out.println("Two roots: " + (int)x1 + " " + (int)x2);
        }

        else
        {
            System.out.println("No roots");
        }
    }
}
