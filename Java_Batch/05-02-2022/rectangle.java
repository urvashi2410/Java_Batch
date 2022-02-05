// function overloading 

// functions 
// void test(){
//     printf(....);
// }

// void test(int a, int b){
//     printf("".....);
// }

import java.lang.*;

class Rect{
    private double len;
    private double bred;

    // Default Constructor 
    public Rect(){
        System.out.println("Default constructor is called");
        len = 1;
        bred = 1;
    }

    public Rect(double l, double b){
        len = l;
        bred = b;
    }

    public Rect(double s){
        len = bred = s;
    }

    public double getLength(){
        return len;
    }

    public double getBreadth(){
        return bred;
    }

    public void setLength(double l){
        if(l >= 0){
            len = l;
        }
        else{
            len = 0;
        }
    }

    public void setBreadth(double b){
        if(b >= 0){
            bred = b;
        }
        else{
            bred = 0;
        }
    }

    public void display(){
        System.out.println("Length is " + len + "\n");
        System.out.println("Breadth is " + bred);
    }

    public double area(){
        return getLength()*getBreadth();
    }

    public double perimeter(){
        return 2*(len+bred);
    }

    public boolean isSquare(){
        if(len == bred){
            return true;
        }
        else{
            return false;
        }
    }

}

class rectangle{
    public static void main(String args[]){
        Rect r = new Rect();
        // r.display();
        // Rect r = new Rect(2.3, 3.4);
        // r.display();
        // Rect r = new Rect(3.2);
        // r.display();
        System.out.println(r.getLength()) ;
        System.out.println(r.getBreadth()) ;
        
        r.setLength(5.6);
        r.setBreadth(6.8);
        System.out.println(r.area());
        System.out.println(r.perimeter());

        if(r.isSquare() == true){
            System.out.println("Yes, it is a square");
        }
        else{
            System.out.println("It is not a square");
        }
    }
}