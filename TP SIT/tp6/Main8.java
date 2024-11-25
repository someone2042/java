import java.awt.Point; // Use java.awt.Point for simplicity

class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(double x1, double y1, double x2, double y2) {
        this.begin = new Point((int) x1, (int) y1); //Explicit cast
        this.end = new Point((int) x2, (int) y2); //Explicit cast
    }

    @Override
    public String toString() {
        return "Ligne de (" + begin.getX() + "," + begin.getY() + ") au (" + end.getX() + "," + end.getY() + ")";
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getLongueur() {
        return begin.distance(end);
    }

    public Point getMidPoint() {

        double midX = (begin.getX() + end.getX()) / 2.0;
        double midY = (begin.getY() + end.getY()) / 2.0;

        return new Point((int) midX, (int) midY); // Casting to int for Point constructor

    }

    public double getGradient() {
        double deltaX = end.getX() - begin.getX();
        double deltaY = end.getY() - begin.getY();

        if (deltaX == 0) {
            return Double.POSITIVE_INFINITY; // Or throw an exception if vertical lines are not allowed.
        }

        return deltaY / deltaX;

    }
}

public class Main8 {
    public static void main(String[] args) {
        Line line1 = new Line(new Point(1, 2), new Point(4, 6));
        System.out.println(line1); // Output: Ligne de (1.0,2.0) au (4.0,6.0)
        System.out.println("Longueur : " + line1.getLongueur());

        Line line2 = new Line(0, 0, 3, 4); // Using the (double, double, double, double) constructor
        System.out.println(line2);
        System.out.println("Longueur : " + line2.getLongueur());
        System.out.println("Point milieu: " + line2.getMidPoint());
        System.out.println("Gradient: " + line2.getGradient());

        // Test vertical line:
        Line verticalLine = new Line(1, 1, 1, 5);
        System.out.println("Gradient (vertical): " + verticalLine.getGradient()); // Should output Infinity

    }
}