import java.lang.*;
import java.util.*;

// print
// println
// printf
// format
class print{
    public static void main(String args[]){
        // int x = 3;
        // int y = 4;
        // System.out.print("hello!");
        // System.out.print(5);
        // System.out.print("5" + x + "7" + y);

        // int + = addition 
        // int + string = 5374

        // System.out.println("hello!");
        // System.out.println(4.566657567657657);
        // System.out.println(4.566657567657657);
        // System.out.println(4.566657567657657);
        // System.out.println(4.566657567657657);
        // System.out.println(4.566657567657657);
        // System.out.println(4.566657567657657);

        // \n = escape char = nextline 
        // System.out.printf("hello\n");
        // System.out.printf("hello");
        // System.out.printf("hello");
        // System.out.printf("hello");
        // System.out.printf("hello");

        int x = 10;
        float y = 123.45f;
        char z = 'A';
        int a = 3;

        int b = -10;
        float c = 8915456.45f;
        // format specifiers 
        //  %d, %x, %o = int
        //   %f, %e, %g = float
        //   %c = char
        //   %s = string 
        // System.out.printf("Hello %d %f %c \n", x, y, z);

        // System.out.printf("hello %g \n", y);
        // System.out.printf("hello %e \n", y);

        // Argument index = 1$, 4$ = it is telling the position of the particular data type to be printed here 
        // System.out.printf("%1$d %2$f %1$d", x, y, a);

        // 5 = width = the amount of space it will be taking 
        // System.out.printf("%5d", a);

        // flag = 0 :- it will fill the spaces with 0s 
        // System.out.printf("%05d", a);

        // flag = ( :- it encloses the negative number in paranthesis and remove the negative sign 
        // but in case of postive number it remains same 
        // System.out.printf("%(5d", b);
        // System.out.printf("%(5d", a);

        // flag = + :- to add a + sign in front of positive numbers
        // negative numbers remain same 
        // System.out.printf("%+5d", a);

        // System.out.printf("%6.2f", y);

        // error = it will not print 
        // System.out.printf("%6.2f", c);

        // String s = "Java";
        // flag = - = it will align the output any datatype to the left 
        // System.out.printf("%-20f", y);
    }
}