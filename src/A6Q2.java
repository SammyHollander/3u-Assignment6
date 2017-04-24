
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holls9719
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner for user input
        Scanner input = new Scanner(System.in);

        //asking how many people are measuring their height
        System.out.println("How many people are in the group?");

        //user input for the nuber of people
        int numPeople = input.nextInt();

        //new array that's size is equal to the number of people
        double[] heights = new double[numPeople];

        //asks the user to enter the people's heights
        System.out.println("Please enter the heights:");

        //runs a for loop to fill in the heigths into the array as the user inputs them
        for (int i = 0; i < numPeople; i++) {
            heights[i] = input.nextDouble();
        }
        //setting the sum of the heights to zero
        double heightSum = 0;
        //adds up all the heights
        for (int i = 0; i < numPeople; i++) {
            heightSum = heights[i] + heightSum;
        }
        //averages all the heights by dividing by the number of people;
        double heightAv = heightSum/ numPeople;
        
        //rounds the height average to two decimal places
        heightAv = heightAv*100;
        heightAv = Math.round(heightAv);
        heightAv = heightAv/100;
        
        //tells the user what above average heights are
        System.out.println("The above average heights are:");
        //new counter to determine how many heights are above average
        int count = 0;
        //compares inputed heights to the average height
        for (int i = 0; i < numPeople; i++) {
            //prints the heights that are above average
            if(heightAv < heights[i]){
                System.out.println(heights[i]);
                count = count +1;
            }
        }
        //just in case they are all the exact same height, then no heights will be above average
        if(count == 0){
            System.out.println("Sorry, but no heights were above average.");
        }
    }
}
