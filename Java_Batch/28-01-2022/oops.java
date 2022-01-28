// Object Oriented Programming
import java.lang.*;
import java.util.*;

class Circle{
    // properties =  variables 
    // Access Specifiers 
    // public - accessible outside the class 
    // private - not accessible outside the class 
    // protected - not accessible outside the class but inheritence(accessible)
    private double radius;

    // methods / functions
    public double area(){
        return Math.PI * radius * radius;
    }

    public void setRadius(double value){
        radius = value;
    }
}

// class name - first letter capital 
// object name - all letters small 
class oops{
    public static void main(String args[]){
        // object will be stored in heap 
        // dynamic memory allocation 
        Circle c1 = new Circle();
        // c1.radius = 3.2;
        // getters and setters = encapsulation 
        // encapsulation = hiding the information we don't want to show to the user
        // c1.setRadius(3.2);
        System.out.printf("Area of circle is %2.2f ", c1.area());
    }
}
