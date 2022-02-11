import java.lang.*;
import java.util.*;

class ArrayAndArrayList {
    public static int[] readArray(Scanner keyboard, int numElements) {
        int[] arr = new int[numElements];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < numElements; i++) {
            // reading array elements from the user
            arr[i] = keyboard.nextInt();
        }
        return arr;
    }

    public static int[] printArray(int arr[]){
        System.out.println("Array elements are: ");  
        // accessing array elements using the for loop  
        for (int i=0; i<arr.length; i++)   
        {  
            System.out.println(arr[i]);  
        }  
        return arr;
    }

    public static void reverseArray(int arr[])
    {
        int n = arr.length;
        int i, t;
        for (i = 0; i < n / 2; i++) {
            t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
        }

    }

    public static ArrayList<Integer> readArrayList(Scanner keyboard, int numElements){
        ArrayList<Integer> arrli = new ArrayList<Integer>(numElements);
        for (int i = 1; i <= numElements; i++){
            arrli.add(i);
        }
        return arrli;  
    }

    public static void printArrayList(ArrayList<Integer>arrli){
        for (int i = 0; i < arrli.size(); i++)
            System.out.print(arrli.get(i) + " ");
    }

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer>alist){
        for (int i = 0; i < alist.size() / 2; i++) {
            Integer temp = alist.get(i);
            alist.set(i, alist.get(alist.size() - i - 1));
            alist.set(alist.size() - i - 1, temp);
        }
        return alist;
    }
};

class array {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int numElements;
        numElements = keyboard.nextInt();

        // ArrayAndArrayList a = new ArrayAndArrayList();
        int arr[] = ArrayAndArrayList.readArray(keyboard, numElements); 
    }
}