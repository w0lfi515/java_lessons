package hw.lesson1;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p1) {
        double dist;
        dist = Math.sqrt((p1.x - this.x) * (p1.x - this.x) + (p1.y - this.y) * (p1.y - this.y));
        return dist;
    }
}
