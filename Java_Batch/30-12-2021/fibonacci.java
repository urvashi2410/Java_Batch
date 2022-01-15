import java.lang.*;
import java.util.*;

class fibonacci{
    public static void main(String args[]){
        int a = 0;
        int b = 1;
        int c;
        System.out.println("Enter number upto which you want to find fibonacci sum:");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        
        System.out.print(a + " " + b);
        // 0 1 
        for(int i = 2; i < n; i++){
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}