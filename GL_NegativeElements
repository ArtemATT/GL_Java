package Java_Courses;

public class NegativeElements {

    private static double[] inputArray = {6, -7.5, 2.1, -2.0, 0};
    private static int numberOfElements;
    private static double sum;

    public static double[] getInputArray() {
        return inputArray;
    }

    public static int getNumberOfElements() {
        return numberOfElements;
    }

    public static void setNumberOfElements(int numberOfElements) {
        NegativeElements.numberOfElements = numberOfElements;
    }

    public static double getSum() {
        return sum;
    }

    public static void setSum(double sum) {
        NegativeElements.sum = sum;
    }

    public static void main(String[] args) {

        double[] inputArray = getInputArray();
        int numberOfElements = getNumberOfElements();
        double sum = getSum();

        for ( double val : inputArray)
        {
             if (val < 0) {
                 sum += val;
                 numberOfElements++;
             }
        }

        setNumberOfElements(numberOfElements);
        setSum(sum);

        System.out.printf(getNumberOfElements() + " " + "%.2f", getSum());
    }
}
