
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);

        //asking how many students are in the class
        System.out.println("How many students are in the class?");

        //user input for the nuber of students in a class
        int numStudents = input.nextInt();

        //new array that's size is equal to the number of students in the class
        double[] classSize = new double[numStudents];

        //asks the user to enter the classes marks
        System.out.println("Please enter the marks:");

        //runs a for loop to fill in the marks into the array as the user inputs them
        for (int i = 0; i < numStudents; i++) {
            classSize[i] = input.nextDouble();
        }
        //setting the sum of the marks to zero
        double markSum = 0;
        //adds up all the marks
        for (int i = 0; i < numStudents; i++) {
            markSum = classSize[i] + markSum;
        }
        //averages all the marks by dividing by the number of students;
        double markAv = markSum/ numStudents;
        
        //tell the user what the class average is (and round to two decimal places)
        System.out.printf("The class average is %.2f\n", markAv);

    }
}
