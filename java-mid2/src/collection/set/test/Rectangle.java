package collection.set.test;

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

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object object) {
        System.out.println("equals() 호출");
        if (object == null || getClass() != object.getClass()) return false;

        Rectangle rectangle = (Rectangle) object;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode() 호출");
        int result = width;
        result = 31 * result + height;
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
