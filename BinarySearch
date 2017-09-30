public class BinarySearch {

    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        int first = 0;
        int last = data.length;
        int result = -1;

        while (first < last)
        {
            int middle = (first + last) / 2;

            if (data[middle] < numberToFind)
            {
                first = middle + 1;
            }

            else if (data[middle] > numberToFind)
            {
                last = middle;
            }

            else if (data[middle] == numberToFind)
            {
                result = middle;
                break;
            }

            if (first == last)
            {
                result = -1;
                break;
            }
        }

        System.out.println(result);
    }
}
