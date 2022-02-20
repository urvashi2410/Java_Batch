import java.lang.*;
import java.util.*;

class arraylists{
    public static void main(String args[]){
        int n = 5;
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        ArrayList<Double> b = new ArrayList<Double>(3);

        // it adds the element at the end of the arraylist 
        arr.add(9);
        arr.add(0);
        arr.add(8);
        arr.add(0);
        arr.add(9);
        arr.add(4);
        arr.add(1);
        arr.add(2);

        // [8.9, 9.0, 0.7]
        // System.out.println(arr);
        // remove either takes an element or its index 
        // arr.remove(1);
        // arr.remove(9.0);
        // System.out.println(arr);

        // it is used to change the value 
        // arr.set(1, 4.5);
        // System.out.println(arr);

        // int s = arr.size();
        // System.out.println(s);

        // it shifts already present element to the right 
        // arr.add(1, 5.6);
        // System.out.println(arr);

        // collection = arraylist 
        b.add(8.4);
        b.add(5.0);
        b.add(0.3);
        // arr.addAll(b);
        // System.out.println(arr);

        // arr.addAll(1, b);
        // System.out.println(arr);

        // deletes all the element 
        // arr.clear();
        // System.out.println(arr);

        // ArrayList<Double> a = new ArrayList<Double>(n);
        // a = (ArrayList)arr.clone();

        // System.out.println(a);

        // returns true/false 
        // System.out.println(arr.contains(7));

        ArrayList<Double> a = new ArrayList<Double>(n);
        a.add(8.9);
        a.add(9.0);

        // System.out.println(arr.containsAll(a));

        // it returns true/ false 
        // System.out.println(arr.equals(a));

        // C++ = vectors 
        // java = arraylist 

        // object = arraylist, single element 

        // returns first occurrence of the element to be searched 
        // System.out.println(arr.indexOf(0.7));


        // break;
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] == num){
        //         int j = i;
        //         break;
        //     }
        // }
        // System.out.println(j);

        // for(int i = arr.length-1; i >= 0; i--){
        //     if(arr[i] == num){
        //         int j = i;
        //         break;
        //     }
        // }
        // System.out.println(j);

        // returns last occrrence of the element 
        // System.out.println(arr.lastIndexOf(0.7));

        // removing more than one element at a time 
        // arr.removeAll(a);
        // System.out.println(arr);

        // arr.removeIf(R->(R > 8.0));
        // System.out.println(arr);

        // arrays = Arrays.sort(arr);
        // arraylist = Collections.sort(arr);

        // ascending order 
        // Collections.sort(arr);
        // System.out.println(arr);

        // descending order 
        // Collections.sort(arr, Collections.reverseOrder());
        // System.out.println(arr);


        // Comparator 
        // if(){

        // }
    }
}