
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);

        //asks the user how many marks they want to input into the array
        System.out.println("Please enter the number of marks you want sorted");
        int numMarks = input.nextInt();

        //new array for the inputed number of marks
        double[] marks = new double[numMarks];

        //new 'placeholder variables to use as temp variable storage when swapping values to sort
        double temp1 = 0;
        double temp2 = 0;

        //asks the user to input the number of marks marks
        System.out.println("please input the marks to be sorted.");

        //have the user input the marks to fill the array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }
        //sorting
        //run the first for loop equal to the number of marks inputed
        for (int a = 0; a < marks.length; a++) {
            //check the position at 'a' with each other position
            for (int b = 0; b < marks.length; b++) {
                //if a is less than 'b', swap the values
                if (marks[a] < marks[b]) {
                    //save values in marks to temp
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


        //if there are an even number of marks in the array
        if ((marks.length % 2) == 0) {
            int temp3 = marks.length / 2;
            int temp4 = temp3 + 1;
            //average the two middle marks
            double median = (marks[temp3] + marks[temp4]) / 2;
            //tell the user the median
            System.out.println("The median is " + median);
        }
        //if there are an odd number of marks in the array
        if (!((marks.length % 2) == 0)) {
            //take the middle mark in the array and tell the user what the median is
            double temp3 = marks.length / 2;
            int temp4 = (int) Math.ceil(temp3);
            double median = (marks[temp4]);
            //tell the user the median
            System.out.println("The median is " + median);

        }


    }
}