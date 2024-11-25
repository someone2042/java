class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(double x, double y) { // Constructor taking doubles (for more precise triangle creation)
        this.x = (int) x;
        this.y = (int) y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this(new MyPoint(x1, y1), new MyPoint(x2, y2), new MyPoint(x3, y3));
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
    }

    public double getPerimeter() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        return side1 + side2 + side3;
    }

    public String getType() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);

        // Tolerance for comparing doubles (important for floating-point comparisons)
        double tolerance = 1e-6; // A small value

        if (Math.abs(side1 - side2) < tolerance && Math.abs(side2 - side3) < tolerance) {
            return "Équilatéral";
        } else if (Math.abs(side1 - side2) < tolerance || Math.abs(side2 - side3) < tolerance
                || Math.abs(side3 - side1) < tolerance) {
            return "Isocèle";
        } else {
            return "Scalène";
        }
    }
}

public class TestTriangles {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        MyPoint p3 = new MyPoint(7, 2);

        MyTriangle t1 = new MyTriangle(p1, p2, p3);
        MyTriangle t2 = new MyTriangle(0, 0, 1, 1, 2, 0);

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("Perimeter of t1: " + t1.getPerimeter());
        System.out.println("Type of t1: " + t1.getType());

        System.out.println("Perimeter of t2: " + t2.getPerimeter());
        System.out.println("Type of t2: " + t2.getType());

        // More precise equilateral triangle example (using doubles in MyPoint)
        MyPoint p4 = new MyPoint(0.0, 0.0);
        MyPoint p5 = new MyPoint(1.0, 0.0);
        MyPoint p6 = new MyPoint(0.5, Math.sqrt(3) / 2.0); // Exact coordinates
        MyTriangle t3 = new MyTriangle(p4, p5, p6);

        System.out.println("Type of t3: " + t3.getType()); // Should be equilateral

        // Isosceles example
        MyTriangle t4 = new MyTriangle(0, 0, 4, 0, 2, 3);
        System.out.println("Type of t4: " + t4.getType()); // Should be isosceles

    }
}