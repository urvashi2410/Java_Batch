import java.lang.*;
import java.util.*;

class arraylist{
    public static void main(String[] args){
        int n = 5;
        ArrayList<Integer> arr = new ArrayList<Integer>(n);

        for(int i = 0; i < n; i++){
            arr.add(i);
        }

        // System.out.println(arr);

        // it takes index 
        // arr.remove(3);
        // System.out.println(arr);

        // for(int i = 0; i < n; i++){
        //     System.out.println(arr.get(i));
        // }
    }
}