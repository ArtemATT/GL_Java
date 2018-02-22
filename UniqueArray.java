import java.util.Arrays;

public class UniqueArray {

    public int[] getUniqueArray (int... inputArray)
    {
        int numberOfRepeated = 0;
        Arrays.sort(inputArray);

        for (int i = 0; i < inputArray.length -1; i++) {
            if(inputArray[i] == inputArray[i+1])
            {
                numberOfRepeated++;
            }
        }
        
        int uniqueArrayLength = inputArray.length - numberOfRepeated;
        int[] uniqueArray = new int[uniqueArrayLength];
        int temp = 0;
        
        for (int i = inputArray.length - 1; i > 0 ; i--) {
            if (inputArray[i] != inputArray[i-1])
            {
                temp++;
                for (int j = uniqueArrayLength - temp; j >= 0; j--) {
                    if (uniqueArray[j] != inputArray[i])
                    {
                        if (i != 1)
                        {
                            uniqueArray[j] = inputArray[i];
                        }
                        if (i == 1)
                        {
                            uniqueArray[j] = inputArray[i];
                            uniqueArray[j-1] = inputArray[i-1];
                        }
                        break;
                    }
                }
            }
        }
        return uniqueArray;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] inputArray = {3, 4, 3, 7, 7, 8, 3, 0, 5, 1};
        UniqueArray uniqueArray = new UniqueArray();
        int [] resultArray = uniqueArray.getUniqueArray(inputArray);

        for (int val:resultArray) {
            System.out.println(val);
        }
    }
}
