/* 
+--------------------+
| Triangle           |
+--------------------+
| - side1: double    |
| - side2: double    |
| - side3: double    |
+--------------------+
| + Triangle()       |
| + Triangle(side1: double, side2: double, side3: double) |
| + getSide1(): double |
| + getSide2(): double |
| + getSide3(): double |
| + setSide1(side1: double): void |
| + setSide2(side2: double): void |
| + setSide3(side3: double): void |
| + getArea(): double |
| + getPerimeter(): double |
| + toString(): String |
+--------------------+
*/

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    // No-arg constructor
    public Triangle() {
        this(1.0, 1.0, 1.0); // Default sides
    }

    // Constructor with specified sides
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Accessor methods
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Method to calculate the area
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to calculate the perimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Method to return a string description of the triangle
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 +
               "\n" + super.toString();
    }
}
