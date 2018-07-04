package hw.lesson1;

public class Lesson1 {
    public static void main (String[] args){
        Point p1 = new Point(5.0, -1.0);
        Point p2 = new Point(-3, 2);

        System.out.println("Distance by function = " + distance(p1,p2));
        System.out.println("Distance by method = " + p1.distance(p2));

    }

    public static double distance (Point p1, Point p2){
        double dist;
        dist = Math.sqrt((p2.x - p1.x)*(p2.x - p1.x)+ (p2.y - p1.y)*(p2.y - p1.y));
        return dist;
    }
}
