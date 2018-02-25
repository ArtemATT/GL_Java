package Java_Courses;

public class LargestAndAmallest {
    private static int[] inputArray = {3, 1, 3, 4, 5, 4, 10, 10};
    private static int sum;

    public static int[] getInputArray() {
        return inputArray;
    }

    public static void setSum(int sum) {
        LargestAndAmallest.sum = sum;
    }

    public static int getSum() {
        return sum;
    }

    public static void main(String[] args) {
        int[] inputArray = getInputArray();
        int min = inputArray[0], max = inputArray[0];

        for (int element : inputArray)
        {
            if (element > max) {
                max = element;
            }

            if (element < min) {
                min = element;
            }
        }

        setSum(min + max);

        System.out.println("Result: " + getSum());
    }
}
