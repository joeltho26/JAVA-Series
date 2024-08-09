package PointChallenge;

public class Point {
    private int x;
    private int y;

    public Point () {

    }

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void distance () {
        double distance = Math.sqrt(Math.pow((this.x - 0.0),2) + Math.pow((this.y - 0.0),2));
        System.out.println(distance);
    }

    public void distance (Point point) {
        double distance = Math.sqrt(Math.pow((this.x - point.x),2) + Math.pow((this.y - point.y),2));
        System.out.println(distance);
    }

    public void distance (int x, int y) {
        double distance = Math.sqrt(Math.pow((this.x - x),2) + Math.pow((this.y - y),2));
        System.out.println(distance);
    }
}
