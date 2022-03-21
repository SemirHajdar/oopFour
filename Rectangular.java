package oopFour;

public class Rectangular extends Shape {
    private Double length;
    private Double width;
    private Double circumference;
    private Double area;

    public Rectangular (Double length,Double width) {
        this.length=length;
        this.width=width;
    }
    @Override
    public double Circumference (){
        circumference = 2*(length+width);
        if (circumference<0)
            throw new IllegalArgumentException("Circumference of Rectangular is less then 0, please check your Inputs!!");
        return circumference;
    }

    @Override
    public double Area (){
        area = length*width;
        if (area<0)
            throw new IllegalArgumentException("Area of Rectangular is less then 0 please check your Inputs!!");
        return area;
        }
    }
