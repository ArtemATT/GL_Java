package Java_Courses;

public class NumberBy3 {
    private static double[] inputArray = {6, 7.5, 2.1, 2.0, 0, 3, 6, 7.5, 2.1, 2.0, 0, -3};
    private static int numberOfElements;
    private static double sum;

    public static double[] getInputArray() {
        return inputArray;
    }

    public static int getNumberOfElements() {
        return numberOfElements;
    }

    public static void setNumberOfElements(int numberOfElements) {
        NumberBy3.numberOfElements = numberOfElements;
    }

    public static double getSum() {
        return sum;
    }

    public static void setSum(double sum) {
        NumberBy3.sum = sum;
    }

    public static void main(String[] args) {

        double[] inputArray = getInputArray();
        int numberOfElements = getNumberOfElements();
        double sum = getSum();

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i-1] > 0 && i % 3 == 0){
                numberOfElements++;
                sum+=inputArray[i-1];
            }
        }

        setNumberOfElements(numberOfElements);
        setSum(sum);

        System.out.printf(getNumberOfElements() + " " + "%.2f", getSum());
    }
}
