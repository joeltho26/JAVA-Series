public class PaintJobChallenge {
    public static void main(String[] args) {
        System.out.println(paintJob(-3.4, 2.1, 1.5, 2));
        System.out.println(paintJob(3.4, 2.1, 1.5, 2));
        System.out.println(paintJob(2.75, 3.25, 2.5, 1));
        System.out.println("---------------");
        System.out.println(paintJob(-3.4, 2.1, 1.5));
        System.out.println(paintJob(3.4, 2.1, 1.5));
        System.out.println(paintJob(7.25, 4.3, 2.35));
        System.out.println("---------------");
        System.out.println(paintJob(3.4, 1.5));
        System.out.println(paintJob(6.26, 2.2));
        System.out.println(paintJob(3.26, 0.75));
    }

    public static int paintJob(double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width>0 && height>0 && areaPerBucket>0) && (extraBuckets>=0)) {
            double area = width*height;
            return (int) Math.ceil((area/areaPerBucket)-extraBuckets);
        } else {
            return -1;
        }
    }

    public static int paintJob (double width, double height, double areaPerBucket) {
        if (width>0 && height>0 && areaPerBucket>0) {
            double area = width*height;
            return (int) Math.ceil(area/areaPerBucket);
        } else {
            return -1;
        }
    }

    public static int paintJob (double area, double areaPerBucket) {
        if (area>0 && areaPerBucket>0) {
            return (int) Math.ceil(area/areaPerBucket);
        } else {
            return -1;
        }
    }
}
