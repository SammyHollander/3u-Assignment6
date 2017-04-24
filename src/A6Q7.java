/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author holls9719
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating an array of the list of values to check if they are prime
        int list[] = new int[999];

        //setting list at 0 to the first number of two
        list[0] = 2;

        //filling the array with the list of values to check if they are prime
        for (int i = 1; i < list.length; i++) {
            list[i] = list[i - 1] + 1;
        }
        //new variable p for each prime number
        int p = 2;

        //make a new array to store the prime numbers
        int prime[] = new int[999];

        // new counter to determine position of prime to add value to
        int count = 0;

        //run this equal to the length of the list of prime numbers
        for (int i = 0; i < list.length; i++) {
            //determine the number of multiples of p that fit into 1000
            int itterations = (int) Math.ceil(1000 / p);
            //determine all the multiples of p
            for (int k = 2; k < itterations; k++) {
                int check = p * k;
                //check the values of p against the values in the list
                for (int j = 0; j < list.length; j++) {
                    if (check == list[j]) {
                        //'mark' the value (let it = 0)
                        list[j] = 0;
                    }

                }

            }
            //check the next value
            p = p + 1;
        }
        //now take all values in the list array that do not equal zero and add them to the prime array
        for (int i = 0; i < list.length; i++) {
            if (!(list[i] == 0)) {
                //set this to next value
                prime[count] = list[i];
                count = count + 1;
            }

        }
        //create a new array to store the prime values that only has as many spaces as prime values
        int primeNum[] = new int[count];

        //fill the primNum array witht the prime number values in the prime array
        //the '-2' is so that 999 and 1000 are not included,(for some reason they are...)
        for (int i = 0; i < count - 2; i++) {
            primeNum[i] = prime[i];
        }


        //tell the user the prime values
        System.out.println("prime values between two and a thousand are: ");
        for (int i = 0; i < count - 2; i++) {
            System.out.println(primeNum[i]);

        }

    }
}
