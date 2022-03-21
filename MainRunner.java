package oopFour;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRunner {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Shape> myShapes = new ArrayList<>();

        Double radius = 0.00;
        Double length = 0.00;
        Double width = 0.00;
        Double sideA = 0.00;
        Double sideB = 0.00;
        Double sideC = 0.00;
        Double height = 0.00;

        do {
            menu();
            int shapeAnswer = numberFromMenu();
            if (shapeAnswer == 1) {
                int numberOfRepeat = secondMenu();
                for (int i = 0; i < numberOfRepeat; i++) {
                    System.out.println("Please Enter the Radius of Circle:");
                    radius = reader.nextDouble();
                    myShapes.add(new Circle(radius));
                }
                finalResult(myShapes);
            } else if (shapeAnswer == 2) {
                int numberOfRepeat = secondMenu();
                for (int i = 0; i < numberOfRepeat; i++) {
                    System.out.println("Please enter length of Rectangular: ");
                    length = reader.nextDouble();
                    System.out.println("Please enter width of Rectangular: ");
                    width = reader.nextDouble();
                    myShapes.add(new Rectangular(length, width));
                }
                finalResult(myShapes);
            } else if (shapeAnswer == 3) {
                int numberOfRepeat = secondMenu();
                for (int i = 0; i < numberOfRepeat; i++) {
                    System.out.println("Please enter length of SideA - Triangle: ");
                    sideA = reader.nextDouble();
                    System.out.println("Please enter length of SideB- Triangle: ");
                    sideB = reader.nextDouble();
                    System.out.println("Please enter length of SideC- Triangle: ");
                    sideC = reader.nextDouble();
                    System.out.println("Please enter height - Triangle: ");
                    height = reader.nextDouble();
                    myShapes.add(new Triangle(sideA, sideB, sideC, height));
                }
                finalResult(myShapes);
            }
        } while (true);
    }
    public static void menu (){
        System.out.println('\n' + "MENU:" + '\n');
        System.out.println("1.Circle");
        System.out.println("2.Rectangular");
        System.out.println("3.Triangle"+ '\n');
    }
    public static int numberFromMenu () {
        System.out.println("Please enter which shape you want to use: ");
        int answer = reader.nextInt();
        if(answer !=1 && answer !=2 && answer !=3) {
            System.out.println("Please enter valid input 1,2 or 3");
        } return answer;
    }
    public static int secondMenu (){
        System.out.println("Please enter how many times you want to do calculation: ");
        int answer = reader.nextInt();
        if (answer<=0) {
            System.out.println("Please enter input greater then 0 !");
        }
        return answer;
    }
    public static void finalResult (ArrayList<Shape>shape){
        for (Shape finalResult:shape){
            try {
                System.out.println("Area of shape is:" + finalResult.Area());
                System.out.println("Circumference of shape is:" + finalResult.Circumference());
            } catch (IllegalArgumentException error){
                System.out.println(error.getMessage());
            }
        }
    }
}