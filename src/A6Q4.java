
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);

        //new array for ten marks
        double[] marks = new double[10];

        //new 'placeholder variables to use as temp variable storage when swapping values to sort
        double temp1 = 0;
        double temp2 = 0;

        //asks the user to input ten marks
        System.out.println("please input ten marks to be sorted.");

        //have the user input ten marks to fill the array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }
        //sorting
        //run the first for loop equal to the number of marks inputed
        for (int a = 0; a < marks.length; a++) {
            System.out.println("test");
            //check the position at 'a' with each other position
            for (int b = 0; b < marks.length; b++) {
                //if a is less than 'b', swap the values
                System.out.println("test2");
                if (marks[a] < marks[b]) {
                    //save values in marks to temp
                    System.out.println("test3");
                    temp1 = marks[a];
                    temp2 = marks[b];
                    //swap the values in marks
                    marks[a] = temp2;
                    marks[b] = temp1;
                }
            }
        }
        //telling the user the marks in order
        System.out.println("The marks in order are: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
    }
}
