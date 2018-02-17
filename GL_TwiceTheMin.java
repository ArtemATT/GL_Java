package Java_Courses;

public class TwiceTheMin {
    private static double[] inputArray = {6, 7.5, 2.1, 2.0, 0, -3, 1.234, - 4.139, 22, 2, -2};
    private static double result;

    public static double[] getInputArray() {
        return inputArray;
    }

    public static double getResult() {
        return result;
    }

    public static void setResult(double result) {
        TwiceTheMin.result = result;
    }

    public static void main(String[] args) {
        double[] inputArray = getInputArray();
        double min = inputArray[0];

        for (double val : inputArray)
        { if (val < min)
            {
                min = val;
            }

        }
        setResult(min*2);

        System.out.printf("%.2f", getResult());
    }
}
