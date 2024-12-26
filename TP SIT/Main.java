class Point2D {
    private float x;
    private float y;

    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[] { this.x, this.y };
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}

class Point3D extends Point2D {
    private float z;

    public Point3D() {
        super();
        this.z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] { this.getX(), this.getY(), this.z };
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + "," + this.z + ")";
    }

}

public class Main {
    public static void main(String[] args) {

        Point2D point2D = new Point2D();
        System.out.println("Default Point2D: " + point2D);

        point2D.setX(5.0f);
        point2D.setY(3.0f);
        System.out.println("Updated Point2D: " + point2D);

        float[] coordinates2D = point2D.getXY();
        System.out.println("Coordinates of Point2D: " + coordinates2D[0] + ", " + coordinates2D[1]);

        Point3D point3D = new Point3D();
        System.out.println("Default Point3D: " + point3D);

        point3D.setX(1.0f);
        point3D.setY(2.0f);
        point3D.setZ(3.0f);
        System.out.println("Updated Point3D: " + point3D);

        float[] coordinates3D = point3D.getXYZ();
        System.out.println(
                "Coordinates of Point3D: " + coordinates3D[0] + ", " + coordinates3D[1] + ", " + coordinates3D[2]);

        point2D.setXY(4.0f, 5.0f);
        System.out.println("Point2D after setXY: " + point2D);

        point3D.setZ(6.0f);
        System.out.println("Point3D after setZ: " + point3D);
    }
}
