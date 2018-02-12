public class ArraySort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        int count = 0;
        int tmp;

        while (count != length - 1)
        {
            for (int i = 0; i < length-1; i++)
            {
                if (array[i+1] < array[i])
                {
                    tmp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = tmp;
                }
            }

            count++;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
