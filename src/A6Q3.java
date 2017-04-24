
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a new scanner for user input
        Scanner input = new Scanner(System.in);

        //creating a new array A, with two spots in it
        int[] A = new int[2];

        //asks the user to input the values for the intager array A
        System.out.println("Please input two integers");
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }

        //if the two values were entered in order already, just print them
        if (A[0] < A[1]) {
            //print the values in the array A
            System.out.print("The Two values in order are: ");
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i] + " ");
            }
        } //if the two values are not in order, then sort them
        else if (A[0] > A[1]) {
            //set the values in the array to temp second array, then swap them back into first array
            int[] B = new int[2];
            B[0] = A[1];
            B[1] = A[0];

            A[0] = B[0];
            A[1] = B[1];
            
            //print them out in order
            System.out.println("The two values in order are: ");
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i] + " ");
            }


        }
    }
}
