import java.lang.*;
import java.util.*;

class area{
    public static void main(String args[]){
        float base, height;
        System.out.println("enter base and height: ");

        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();
        
        // 45 67
        // hello world the jsfsdkf 
        // nextline  
        double area;
        // it will result in 0 
        // area = 1/2*base*height;
        // typecasted into float 
        // area = (float)1/2*base*height;
        // area = 0.5*base*height;
        area = (float)1/2*(base*height);
        System.out.println(area);
        // System.out.println(((Object)(area)).getClass(). getSimpleName());
    }
}
