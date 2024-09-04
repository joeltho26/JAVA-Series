package Example.Composition;

public class Dimensions {
    private int width;
    private int depth;
    private int height;

    public Dimensions(int width, int depth, int height) {
        if (width >= 0) {
            this.width = width;
        } else {
            this.width = 0;
        }

        if (height >= 0) {
            this.height = height;
        } else {
            this.height = 0;
        }

        if (depth >= 0) {
            this.depth = depth;
        } else {
            this.depth = 0;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
