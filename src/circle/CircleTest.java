package circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(10,"Blue",false);
        System.out.println(circle);

        System.out.println("Diện tích hình tròn là : "+circle.getArea());
        System.out.println("Chu vi hình tròn là : "+circle.getPerimeter());
    }
}
