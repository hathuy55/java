package day4a.donggoi;

public class Circle {
    private double radius;
    private String color;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {  // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }
    public Circle(double r) {  // 2nd constructor
        radius = r;
        color = "red";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}




