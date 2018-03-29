import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double sumArea = 0;
        double sumAreaCircle = 0;
        double sumAreaRectangle = 0;
        double sumAreaTriangle = 0;

        Circle circle1 = new Circle("WHITE", 10);
        Circle circle2 = new Circle("GREEN", 15);
        Circle circle3 = new Circle("BLACK", 33);
        Rectangle rectangle1 = new Rectangle("WHITE", 11, 22);
        Rectangle rectangle2 = new Rectangle("YELLOW", 1, 252);
        Rectangle rectangle3 = new Rectangle("RED", 23, 47);
        Triangle triangle1 = new Triangle("RED", 5, 5, 5);
        Triangle triangle2 = new Triangle("RED", 25, 41, 59);
        Triangle triangle3 = new Triangle("BLUE", 2, 7, 5);
        Triangle triangle4 = new Triangle("BROWN", 63, 34, 51);
        Triangle triangle5 = new Triangle("BLUE", 15, 21, 33);

        Shape[] shapes = {circle1, circle2, circle3, rectangle1, rectangle2, rectangle3, triangle1, triangle2, triangle3};

        for (Shape val: shapes
             ) {
            System.out.println(val.toString() + ", Shape area is: " + val.calcArea());
            sumArea += val.calcArea();

            if (val instanceof Circle) {
                sumAreaCircle += val.calcArea();
            }

            if (val instanceof Triangle) {
                sumAreaTriangle += val.calcArea();
            }

            if (val instanceof Rectangle) {
                sumAreaRectangle += val.calcArea();
            }
        }

        System.out.println("===========================================================================================");
        System.out.println("Total Area of all Shapes= " + sumArea);
        System.out.println("Total Area of Circles = " + sumAreaCircle);
        System.out.println("Total Area of Triangles = " + sumAreaTriangle);
        System.out.println("Total Area of Rectangles = " + sumAreaRectangle);

        printForeach(shapes);

        Triangle[] triangles = {triangle1, triangle2, triangle3, triangle4, triangle5};
        Arrays.sort(triangles);
        printForeach(triangles);
        System.out.println();
        Circle[] circles = {circle1, circle2, circle3};
        Arrays.sort(circles);
        printForeach(circles);
        System.out.println();
        Rectangle[] rectangles = {rectangle1, rectangle2, rectangle3};
        Arrays.sort(rectangles);
        printForeach(rectangles);
        System.out.println("===========================================================================================");
        Arrays.sort(triangles, new ShapeColorComparator());
        printForeach(triangles);
        Arrays.sort(circles, new ShapeColorComparator());
        printForeach(circles);
        Arrays.sort(rectangles, new ShapeColorComparator());
        printForeach(rectangles);
    }

    public static void printForeach(Object[] objects) {
        for (Object val : objects
                ) {
            System.out.println(val);
        }
    }
}

abstract public class Shape implements Drawable, Comparable {

    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor(){
        return this.shapeColor;
    }

    public Shape() {
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", color is: " + shapeColor;
    }

    abstract double calcArea();

    @Override
    public void draw() {
        System.out.println(toString() + ". " + getClass().getSimpleName() + " area is: " + calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Shape shape = (Shape)o;
        return (int) (this.calcArea() - shape.calcArea());
    }
}

public class Circle extends Shape{

    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public Circle() {
        super();
    }

    @Override
    double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius = " + radius;
    }
}

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle() {
        super();
    }

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + ", Width = " + width + ", Height = " + height;
    }
}

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;


    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calcArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return super.toString() + ", a = " + a + ", b = " + b + ", c = " + c;
    }
}

public interface Drawable {
    void draw();
}

import java.util.Comparator;

public class ShapeColorComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;
        return shape1.getShapeColor().compareTo(shape2.getShapeColor());
    }
}
