package PointChallenge;

public class PointCalling {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        first.distance();
        first.distance(second);
        first.distance(2,2);
        Point third = new Point();
        third.distance();
    }
}
