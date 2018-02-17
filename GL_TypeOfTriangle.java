package Java_Courses;

import java.util.Scanner;

public class TypeOfTriangle {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for A side of Triangle: ");
        int a = scanner.nextInt();
        System.out.print("Enter value for B side of Triangle: ");
        int b = scanner.nextInt();
        System.out.print("Enter value for C side of Triangle: ");
        int c = scanner.nextInt();
        System.out.println();

        int triangleType = 0;
        String typeOfTriangle=null;

        if (a + b > c && a + c > b && b + c > a)
        {
            if (a == b && b == c) {
                triangleType = 1;
            }

            else if (a == b || b == c || a == c) {
                triangleType = 2;
            }

            else triangleType = 3;

            switch (triangleType) {
                case 1: typeOfTriangle = "The Triangles is: Equilateral";
                    break;
                case 2: typeOfTriangle = "The Triangles is: Isosceles";
                    break;
                case 3: typeOfTriangle = "The Triangles is: Scalene";
                    break;
            }

            System.out.println(typeOfTriangle);
        }
        else System.out.println("Triangle does not exist!");
    }
}
