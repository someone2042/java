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

class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        this(new MyPoint(0, 0), 1);
    }

    public MyCircle(int x, int y, int radius) {
        this(new MyPoint(x, y), radius);
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ", center=" + center.toString() + "]";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center; // Note: Returning a reference, not a copy.
    }

    public void setCenter(MyPoint center) {
        this.center = center

        ; // Note: Setting a reference, not a copy.
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x); // Accessing and modifying the existing center object
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y); // Accessing and modifying the existing center object
    }

    public int[] getCenterXY() {
        return new int[] { center.getX(), center.getY() }; // Return a copy of the coordinates.
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);

    }
}

public class TestCircles {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(p1, 5);
        MyCircle c3 = new MyCircle(3, 5, 2);

        System.out.println(c1); // Output: MyCircle[radius=1, center=(0,0)]
        System.out.println(c2); // Output: MyCircle[radius=5, center=(1,2)]
        System.out.println(c3); // Output: MyCircle[radius=2, center=(3,5)]

        System.out.println("Area of c2: " + c2.getArea());
        System.out.println("Circumference of c3: " + c3.getCircumference());
        System.out.println("Distance between c1 and c2: " + c1.distance(c2));

        c1.setRadius(10);
        c2.setCenter(new MyPoint(10, 10)); // Setting a new center point
        c3.setCenterX(7); // Modifying the x-coordinate of the existing center
        c3.setCenterY(9);

        int[] centerXY = c3.getCenterXY(); // Get a copy
        System.out.println("Center of c3: (" + centerXY[0] + "," + centerXY[1] + ")");

        c3.setCenterXY(12, 15); // Set new coordinates

        System.out.println(c1); // Output: MyCircle[radius=10, center=(0,0)]
        System.out.println(c2); // Output: MyCircle[radius=5, center=(10,10)]
        System.out.println(c3); // Output: MyCircle[radius=2, center=(12,15)]

        System.out.println("Distance between two points: " + p1.distance(p2)); // Example using MyPoint.distance()

    }
}