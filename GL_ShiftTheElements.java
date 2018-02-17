package Java_Courses;

public class ShiftTheElements {

    private static int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static int[] outputArray;
    private static int shift = 4;

    public static int[] getInputArray() {
        return inputArray;
    }

    public static int getShift() {
        return shift;
    }

    public static int[] getOutputArray() {
        return outputArray;
    }

    public static void setOutputArray(int[] outputArray) {
        ShiftTheElements.outputArray = outputArray;
    }

    public static void main(String[] args) {
        int[] inputArray = getInputArray();
        int[] outputArray = new int[inputArray.length];
        int shift = getShift();

        for (int i = 0; i < inputArray.length - shift - 1; i++) {
            outputArray[i] = inputArray[i + shift + 1];
        }

        for (int i = 0; i <= shift; i++) {
            outputArray[i+shift] = inputArray[i];
        }

        setOutputArray(outputArray);

        for (int element : getOutputArray())
        {
            System.out.println(element);
        }
    }
}
