// heron's formula 

// s = semi area = (a + b + c) / 2

// area = underroot(s(s-a)(s-b)(s-c))

import java.lang.*;
import java.util.*;
import java.lang.Math;

class heronsFormula{
    public static void main(String args[]){
        int a, b, c;
        System.out.println("Enter three sides : ");
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        float area, s;
        // to increase precedence enclose it within parenthesis 
        s = (a + b + c) / 2;

        area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
}
}

// not a number = NAN 
// if math.sqrt have any -ve value then it returns NAN 

// sqrt(-2) = NAN = complex number 