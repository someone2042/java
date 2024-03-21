import java.lang.Math;

public class Point {
    private double x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        this.x=0;
        this.x=0;
    }
    public void translation(int  dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    public static boolean sameAs(Point a, Point b){
        return(a.x==b.x && a.y == b.y);
    }
    public void homothetie(double  coef){
        this.x*=coef;
        this.y*=coef;
    }
    public void rotation(double theta){
        theta=Math.toRadians(theta);
        double angel=Math.acos(this.x/Math.sqrt(x*x + y*y));
        double rayon=Math.sqrt(this.x*this.x+this.y*this.y);
        angel+=theta;
        this.x=rayon*Math.cos(angel);
        this.y=rayon*Math.sin(angel);
    }
    public void afficheCart(){
        System.out.println("x:"+this.x);
        System.out.println("y:"+this.y);
    }
    public void affichePol(){
        System.out.println("angle:"+Math.acos(this.x/Math.sqrt(x*x + y*y)));
        System.out.println("rayon:"+Math.sqrt(this.x*this.x+this.y*this.y));
    }
    public static void main(String[] args) {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(0, 0);
    
        p1.translation(3, 4);
        System.out.println("After Translation: X=" + p1.x + " Y=" + p1.y);
    
        System.out.println(sameAs(p1, p2));
    
        p1.homothetie(2);
        System.out.println("After Homothety: X=" + p1.x + " Y=" + p1.y);
    
        p1.rotation(Math.PI / 4);
        System.out.println("After Rotation: X=" + p1.x + " Y=" + p1.y);
        p1.affichePol();
        p1.afficheCart();
    }
    
}
