import java.lang.*;
import java.util.*;

class area_volume{
    public static void main(String args[]){
        int totalArea, volume;

        System.out.println("Enter length, breadth and height of the cuboid: ");
        Scanner sc = new Scanner(System.in);
        int length, breadth, height;
        length = sc.nextInt();
        breadth  = sc.nextInt();
        height = sc.nextInt();

        totalArea = 2*(length*breadth + breadth*height + height*length);

        volume = length*breadth*height;
        System.out.println("Area is " + totalArea);
        System.out.println("volume is " + volume);

    }
}

// unary operators = ++x , x++
