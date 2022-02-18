import java.lang.*;
import java.util.*;

// parent class 
class Car{
    public String color;
    public int capacity;

    private int i;
    protected int x;
};

// child class 
class sportsCar extends Car{
    public int r;
    public String t;
    private int y;
    protected int g;
};

class test extends Car{

}

class inheritance{
    public static void main(String args[]){
        Car c = new Car();
        c.capacity = 1200;
        c.color = "black";
        // c.i = 5;
        c.x = 0;

        sportsCar s = new sportsCar();
        s.capacity = 3400;
        s.color = "orange";
        // s.i = 4;
        s.x = 5;

        test t = new test();
        t.capacity = 456;
    }
}

// car = parent class 
// sportsCar = child class / derived class

// Types of inheritance: 
// 1. single inheritance = one parent class, one child class
// 2. multilevel inheritance  = more than one child and parent class, levels 
// 3. multiple inheritence doesnt work in java  = one child class but inherited from more than one parent class 
// 4. hierarchical inheritance = one parent class is inherited by more than one child class 
// 5. hybrid inheritance = mixture of more than one inheritance 


// Availability vs accessiblity 

// is a relationship 

// banana is a fruit 
// sportsCar is a car 