public class ShellSort {

    public static void main(String[] args) {

        int[] array = {30, 2, 10, 4, 6};

        int length = array.length;

        int step = length / 2;
        int tmp;

        for (int i = 0; i < length; i++)
        {
            for (i = 0; i < length - step; i++)
            {
                int j = i;
                while (j >= 0 && array[j] > array[j+step])
                {
                    tmp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = tmp;
                    j--;
                }
            }

            step = step / 2;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
