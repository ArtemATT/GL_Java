public class Main {
    public static void main(String[] args) {

        int[] inputArray = {3, 4, 3, 7, 7, 8, 3, 0, 5, 1};
        ArrayProcessing uniqueArray = new ArrayProcessing();
        int [] resultArray = uniqueArray.getUniqueArray(inputArray);
        System.out.println("Exercise 1");
        printArray(resultArray);

        int [] firstArray = {1, 2, 4, 5, 1, 9, 1};
        int [] secondArray = {1, 3, 7, 5, 3, 8, 3};
        ArrayProcessing uniqueArrayFromTwo = new ArrayProcessing();
        int [] outputArray = uniqueArrayFromTwo.getUniqueArray(firstArray, secondArray);
        System.out.println("Exercise 2");
        printArray(outputArray);
    }

    public static void printArray (int... array )
    {
        for (int val: array
             ) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

import java.util.Arrays;
public class ArrayProcessing {

    public int[] getUniqueArray(int... inputArray) {
        int numberOfRepeated = 0;
        Arrays.sort(inputArray);

        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] == inputArray[i + 1]) {
                numberOfRepeated++;
            }
        }
        int uniqueArrayLength = inputArray.length - numberOfRepeated;
        int[] uniqueArray = new int[uniqueArrayLength];
        int temp = 0;
        for (int i = inputArray.length - 1; i > 0; i--) {
            if (inputArray[i] != inputArray[i - 1]) {
                temp++;
                for (int j = uniqueArrayLength - temp; j >= 0; j--) {
                    if (uniqueArray[j] != inputArray[i]) {
                        if (i != 1) {
                            uniqueArray[j] = inputArray[i];
                        }
                        if (i == 1) {
                            uniqueArray[j] = inputArray[i];
                            uniqueArray[j - 1] = inputArray[i - 1];
                        }
                        break;
                    }
                }
            }
        }
        return uniqueArray;
    }

    public int[] getUniqueArray(int[] firstArray, int[] secondArray) {
        int lenFirst = firstArray.length;
        int lenSecond = secondArray.length;

        int[] tempArray = new int[lenFirst + lenSecond];
        for (int i = 0; i < lenFirst; i++) {
            tempArray[i] = firstArray[i];
        }
        for (int i = lenFirst; i < tempArray.length ; i++) {
            tempArray[i] = secondArray[i-lenFirst];
        }
        int count = 0;
        Arrays.sort(tempArray);
        for (int i = 0; i < tempArray.length; i++) {
            boolean toCount = true;
            for (int j = i+1; j < tempArray.length; j++) {
                if (tempArray[i] == tempArray[j])
                {
                    toCount = false;
                    i++;
                }
            }
            if (toCount)
            {
                count++;
            }
        }

        int[] resultArray = new int[count];
        int lenResult = resultArray.length;
        int index = 0;
        for (int i = 0; i < tempArray.length; i++) {
            boolean toAdd = true;
            for (int j = i + 1; j < tempArray.length; j++) {
                if (tempArray[i] == tempArray[j]) {
                    toAdd = false;
                    i++;
                }
            }
            if (toAdd)
            {
                resultArray[index] = tempArray[i];
                index++;
            }
        }
        return resultArray;
    }
}
