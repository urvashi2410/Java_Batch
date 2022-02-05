import java.lang.*;

class Arrays{
    public static void main(String args[]){
        int A[] = {1, 2,4, 5,6 };
        // int A[] = new int[10];

        // size() = C 
        // length = java 
        // for(int i : A){
        //     System.out.println(i);
        // }

        // for(int i = 0; i < A.length; i++){
        //     System.out.println(A[i]);
        // }

        A[2] = 34;
        // System.out.println(A[2]);

        // stack array, it doesn't affect the real values of the array as there is no pointer type of thing here 
        for(int value : A){
            value++;
            System.out.println(value);
        }


        // for(int i : A){
        //     System.out.println(i);
        // }

        // array is stored in heap, and pointers/index are used to change the real value of the array 
        for(int i = 0; i < A.length; i++){
            A[i]++;
            System.out.println(A[i]);
        }

        for(int i = 0; i < A.length; i++){
            System.out.println(A[i]);
        }
        
    }
}