package oopFour;

public class Triangle extends Shape{
    private Double sideA;
    private Double sideB;
    private Double sideC;
    private Double height;
    private Double circumference;
    private Double area;

    public Triangle (Double sideA,Double sideB,Double sideC,Double height) {
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
        this.height=height;
    }
    @Override
    public double circumference (){
        circumference=sideA+sideB+sideC;
        if (circumference<0)
            throw new IllegalArgumentException("Circumference of Triangle is less then 0, please check your Inputs!!");
        return circumference;
        }
    @Override
    public double area (){
        area=0.5*sideC*height;
        if (area<0)
            throw new IllegalArgumentException("Area of Triangle is less then 0, please check your Inputs!!");
        return area;
        }
    }
