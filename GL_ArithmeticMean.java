public class ArithmeticMean {
    public static void main(String[] args) {
        double[] inputArray = { -5, 3, 4, 0, 2, -1};
        int arrayLength = inputArray.length;
        int num =0;
        double sum = 0;
        double mean;

        for (int i = 0; i < arrayLength; i++) {
            if (inputArray[i] > 0){
                num++;
                sum+=inputArray[i];
            }
        }

        if (num == 0)
            System.out.println("Not Found");

        else {
            mean = sum/num;
            System.out.println("Arithmetic Mean is: " + mean);
        }
    }
}
