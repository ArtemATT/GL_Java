public class MatrixPrint {
    public static void main(String[] args) {
        int val = 1;
        int size = 5;
        int star = 5;
        for (int row = 1; row <= size; row++)
        {
            for (int col = 1; col <= size; col++)
            {
                if (col == size && row != col && col != star && val < 10)
                {
                    System.out.println(" " + val + " ");
                }
                else if (col == size && row != col && col != star && val >= 10)
                {
                    System.out.println(val + " ");
                }
                else if (col == star && col == size)
                {
                    System.out.println(" * ");
                }
                else if (row == col)
                {
                    System.out.print(" * ");
                }
                else if (star == col)
                {
                    System.out.print(" * ");
                }
                else if (val < 10)
                {
                    System.out.print(" " + val + " ");
                }
                else {System.out.print(val + " ");}

                if (star == col)
                {star--;}

                val++;
            }
        }
    }
}
