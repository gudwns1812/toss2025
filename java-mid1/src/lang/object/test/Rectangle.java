package lang.object.test;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        Rectangle rectangle = (Rectangle) object;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        int result = width;
        result = 31 * result + height;
        return result;
    }
}
