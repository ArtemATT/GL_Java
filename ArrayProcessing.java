public class Main {
    public static void main(String[] args) {

        int[] inputArray = {1, 5, 1, 3, 1, 4, 1, 3, 3, 3, 1, 2, 1, 2, 3, 1, 2, 2};
        ArrayProcessing arrayProcessing = new ArrayProcessing();
        int [] resultArray = arrayProcessing.getUniqueArray(inputArray);
        System.out.println("Exercise 1");
        printArray(resultArray);

        int [] firstArray = {1, 2, 4, 5, 1, 9, 1};
        int [] secondArray = {1, 3, 7, 5, 3, 8, 3};
        int [] outputArray = arrayProcessing.getUniqueArray(firstArray, secondArray);
        System.out.println("Exercise 2");
        printArray(outputArray);

        int [] firstArrayT3 = {1, 2, 4, 5, 1, 3, 9, 1};
        int [] secondArrayT3 = {1, 3, 7, 5, 8, 0};
        System.out.println("Exercise 3");
        printArray(arrayProcessing.getCommonElements(firstArrayT3, secondArrayT3));
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
        int index = uniqueArrayLength - 1;
        int[] uniqueArray = new int[uniqueArrayLength];

        for (int i = inputArray.length - 1; i >= 0; i--) {
            boolean toAdd = true;
            for (int j = i-1; j >= 0 ; j--) {
                if (inputArray[i] == inputArray[j])
                {
                    toAdd = false;
                    break;
                }
            }
            if (toAdd)
            {
                uniqueArray[index] = inputArray[i];
                index--;
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

    public int[] getCommonElements (int[] firstArray, int[] secondArray)
    {
        int firstArrLen = firstArray.length;
        int secondArrLen = secondArray.length;
        int [] tempArray = new int[firstArrLen + secondArrLen];
        String tempStr = "";

        for (int i = 0; i < firstArrLen; i++) {
            boolean toAdd = false;
            for (int j = 0; j < secondArrLen; j++) {
                if (firstArray[i] == secondArray[j])
                {
                    toAdd = true;
                }
            }

            if (toAdd)
            {
                tempStr += firstArray[i] + "|";
            }
        }

        String[] tempStrArr = tempStr.split("\\|");
        int [] outputArray = new int[tempStrArr.length];
        int i = 0;
        for (String val: tempStrArr
             ) {
            outputArray[i] = Integer.parseInt(val);
            i++;
        }

        return getUniqueArray(outputArray);
    }
}
