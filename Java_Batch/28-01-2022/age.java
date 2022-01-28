import java.lang.*;
import java.util.*;

class Temp{
    private int age;

    private int realAge(){
        return age - 5;
    }

    public void setAge(int value){
        age = value;
    }

    public void displayAge(){
        System.out.println("Age is " + realAge());
    }
}

class age{
    public static void main(String args[]){
        Temp a = new Temp();
        System.out.println("Enter the age of the user: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a.setAge(n);
        a.displayAge();
    }
}