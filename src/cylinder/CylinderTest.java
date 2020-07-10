package cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(10,20,"Black",false);
        System.out.println(cylinder);

        System.out.println("Thể tích hình trụ là : "+cylinder.getVolume());
    }
}
