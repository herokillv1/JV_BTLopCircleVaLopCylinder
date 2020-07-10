package circle;

public class Circle {
    private String color = "green";
    private boolean filled = true;
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Hình tròn có :  " +
                "    -Bán kính : " + getRadius()+
                "    -Màu : " + getColor() +
                (isFilled() ? "    -filled" : "    -not filled");
    }
}
