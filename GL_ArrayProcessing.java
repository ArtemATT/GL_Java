// Exercise 1. Return an array of unique values from input array.
// Exercise 2. Return an array of unique values from two input arrays.
// Exercise 3. Return an array of elements that are present in both input arrays.
// Exercise 4. Return the same array with elements in reversed order.
// Exercise 5. Sort input array and return array with values on even positions.

public class Main {
    public static void main(String[] args) {

        int[] inputArrayEx1 = {1, 5, 1, 3, 1, 4, 1, 3, 3, 3, 1, 2, 1, 2, 3, 1, 2, 2};
        int[] firstArrayEx2 = {1, 2, 4, 5, 1, 9, 1};
        int[] secondArrayEx2 = {1, 3, 7, 5, 3, 8, 3};
        int[] firstArrayEx3 = {1, 2, 4, 5, 1, 3, 9, 1};
        int[] secondArrayEx3 = {1, 3, 7, 5, 8, 0};
        int[] inputArrayEx4 = {1, 5, 1, 3, 1, 4, 1, 3, 1, 3, 2};
        int[] inputArrayEx5 = {4, 2, 1, 5, 7, 3, 8, 9, 3, 1};

        ArrayProcessing arrayProcessing = new ArrayProcessing();

        System.out.println("Exercise 1. Return an array of unique values from input array.");
        System.out.print("Input array: ");
        printArray(inputArrayEx1);
        System.out.print("Output array: ");
        printArray(arrayProcessing.getUniqueArray(inputArrayEx1));
        System.out.println();

        System.out.println("Exercise 2. Return an array of unique values from two input arrays.");
        System.out.print("First array: ");
        printArray(firstArrayEx2);
        System.out.print("Second array: ");
        printArray(secondArrayEx2);
        System.out.print("Output array: ");
        printArray(arrayProcessing.getUniqueArray(firstArrayEx2, secondArrayEx2));
        System.out.println();

        System.out.println("Exercise 3. Return an array of elements that are present in both input arrays.");
        System.out.print("First array: ");
        printArray(firstArrayEx3);
        System.out.print("Second array: ");
        printArray(secondArrayEx3);
        System.out.print("Output array: ");
        printArray(arrayProcessing.getCommonElements(firstArrayEx3, secondArrayEx3));
        System.out.println();

        System.out.println("Exercise 4. Return the same array with elements in reversed order.");
        System.out.print("Input array: ");
        printArray(inputArrayEx1);
        System.out.print("Output array: ");
        printArray(arrayProcessing.reverseArray(inputArrayEx1));
        System.out.println();

        System.out.println("Exercise 5. Sort input array and return array with values on even positions.");
        System.out.print("Input array: ");
        printArray(inputArrayEx5);
        System.out.print("Output array: ");
        printArray(arrayProcessing.getArrayOfEvenElements(inputArrayEx5));
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

public class ArrayProcessing {

    public int[] getUniqueArray(int... inputArray) {
        int numberOfRepeated = 0;
        inputArray = sortArray(inputArray);
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

        int[] tempArray = sortArray(mergeArrays(firstArray, secondArray));
        int count = 0;
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

    public int[] reverseArray (int ... inputArray) {
        int inputArrLen = inputArray.length;
        int [] reversedArray = new int [inputArrLen];
        int index = inputArrLen - 1;

        for (int i = 0; i < inputArrLen; i++) {
            reversedArray[index] = inputArray[i];
            index--;
        }
        return reversedArray;
    }

    public int[] getArrayOfEvenElements(int... inputArray)
    {
        inputArray = sortArray(inputArray);
        int arrayLength = inputArray.length;

        int[] outputArray = new int[arrayLength/2];
        int index = 0;

        for (int i = 0; i < inputArray.length - 1; i+=2) {
            if (index <= arrayLength/2 - 1)
            {
                outputArray[index] = inputArray[i];
                index++;
            }
            else break;
        }
        return outputArray;
    }


    private int[] mergeArrays(int[] firstArray, int[] secondArray)
    {
        int lenFirst = firstArray.length;
        int lenSecond = secondArray.length;

        int[] mergedArray = new int[lenFirst + lenSecond];
        for (int i = 0; i < lenFirst; i++) {
            mergedArray[i] = firstArray[i];
        }
        for (int i = lenFirst; i < mergedArray.length ; i++) {
            mergedArray[i] = secondArray[i-lenFirst];
        }
        return mergedArray;
    }

    private int[] sortArray (int... inputArray)
    {
        int length = inputArray.length;
        int step = length / 2;
        int tmp;

        for (int i = 0; i < length; i++)
        {
            for (i = 0; i < length - step; i++)
            {
                int j = i;
                while (j >= 0 && inputArray[j] > inputArray[j+step])
                {
                    tmp = inputArray[j];
                    inputArray[j] = inputArray[j + step];
                    inputArray[j + step] = tmp;
                    j--;
                }
            }
            step = step / 2;
        }
        return inputArray;
    }
}
