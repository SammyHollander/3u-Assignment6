
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);

        //asks the user how many students are in the class
        System.out.println("Please enter the number of students in the class");
        int classSize = input.nextInt();

        //new array for the class size
        double[] marks = new double[classSize];

        //new 'placeholder variables to use as temp variable storage when swapping values to sort
        double temp1 = 0;
        double temp2 = 0;

        //asks the user to input ten marks
        System.out.println("please input the student's marks to be sorted.");

        //have the user input the marks to fill the array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }
        //sorting the marks
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
        //telling the user the lowest mark
        System.out.println("The lowest mark in the class is: " + marks[0]);

        //telling the user the highest mark
        System.out.println("The highest mark in the class is: " + marks[marks.length - 1]);

        //new mark sum variable
        double markSum = 0;

        //calculate the class average
        for (int i = 0; i < marks.length; i++) {
            markSum = markSum + marks[i];
        }
        //divide by the number of marks inputed to get the average
        double average = markSum / (marks.length);

        //tell the user the class average
        System.out.println("The class average is: " + average);
    }
}
