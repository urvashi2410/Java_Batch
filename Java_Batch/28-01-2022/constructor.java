import java.lang.*;

// Constructor -
// 1. uska naam same hoga class k name se 
// 2. uska koi datatype nhi hoga
// 3. no return statement
// 4. usko call krne ki zarurat nhi h 

class Temp{
    // Constructor 
    public Temp(){
        System.out.println("Default constructor is called");
    }
}

class constructor{
    public static void main(String args[]){
        Temp t = new Temp();
    }
}