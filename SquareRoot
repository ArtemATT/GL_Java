public class SquareRoot
{
    public static void main (String [] args)
    {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

        SquareRoot(a,b,c);
    }

    private static void SquareRoot (double a, double b, double c)
    {
        double tmp = Math.sqrt(b*b-4*a*c);

        if (tmp > 0 && a !=0)
        {
            double x1 = (-b + tmp)/(2*a);
            double x2 = (-b - tmp)/(2*a);

            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }

        else if (tmp == 0 && a !=0)
        {
            double x1 = - b / (2*a);
            double x2 = x1;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }

        else if (tmp != 0 && a ==0)
        {
            double x1 = 0;
            double x2 = x1;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }

        else
        {
            System.out.println("x1=");
            System.out.println("x2=");
        }
    }
}
