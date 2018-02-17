package Java_Courses;

public class NotGreater {
    private static int notGraterValue = 1;
    private static double[] inputArray = {3.9, 7.5, 2.1, 2.0, 9};

    public static int getNotGreaterValue()
    {
        return notGraterValue;
    }

    public static double[] getInputArray() {
        return inputArray;
    }

    public static void main(String[] args) {
        double[] inputArray = getInputArray();
        int notGraterValue = getNotGreaterValue();
        String result = null;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < notGraterValue){
                result = i + " " + inputArray[i];
                break;
            }
        }

        if (result == null)
        {
            System.out.println("Not Found");
        }
        else System.out.println(result);
    }
}
