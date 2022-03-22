package oopFour;

public class Circle extends Shape {
    private Double radius;
    static Double PI=Math.PI;
    private Double circumference;
    private Double area;

    public Circle (Double radius) {
        this.radius=radius;
    }
    @Override
    protected double circumference () {
        circumference = 2*radius*PI;
        if (circumference<0)
            throw new IllegalArgumentException("Circumference of Circle is less then 0, please check your Input!!");
        return circumference;
        }

    @Override
    protected double area () {
        area = PI*radius*radius;
        if (area<0)
            throw new IllegalArgumentException("Area of Circle is less then 0, please check your Input!!");
        return area;
        }
    }
