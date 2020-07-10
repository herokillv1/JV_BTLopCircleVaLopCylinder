package cylinder;

import circle.Circle;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(){
    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double height,double radius, String color, boolean filled){
        super(radius,color,filled);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea()*getHeight();
    }


    @Override
    public String toString() {
        return "Hình trụ có :  " +
                "    -Bán kính : " + getRadius()+
                "    -Chiều cao : " + getHeight()+
                "    -Màu : " + getColor() +
                (isFilled() ? "    -filled" : "    -not filled");
    }
}
