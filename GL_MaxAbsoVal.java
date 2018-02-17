package Java_Courses;

public class MaxAbsoVal {
    private static double[] inputArray = {-76.45, 7.5, -5.1, 75.23, 34.5, 0, 12.42, -125};
    
    public static double[] getInstance() {
        return inputArray;
    }

    public static void main(String[] args) {
    double[] inputArray = getInstance();
    double gratest = 0;

        for (double val: inputArray)
        {
            if (Math.abs(val) > gratest) {
                gratest = Math.abs(val);
            }
        }

        System.out.println("The gratest absolute value is: " + gratest);
    }
}
