package Java_Courses;

import java.util.Scanner;

public class NumberOfToys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfToysKind = scanner.nextInt();
        double[][] inputArray = new double[numberOfToysKind][2];
        int rezNumberOfToys = 0;

        for (int i = 0; i < numberOfToysKind; i++) {
            for (int j = 0; j < 2; j++) {
                inputArray[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < numberOfToysKind; i++) {
            if (inputArray[i][1] < 50) {
                rezNumberOfToys+=inputArray[i][0];
            }
        }

        System.out.println("Number of toys with cost less than 50 grn: " + rezNumberOfToys);
    }
}
