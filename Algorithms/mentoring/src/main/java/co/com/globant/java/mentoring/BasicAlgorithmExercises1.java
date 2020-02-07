package co.com.globant.java.mentoring;
import java.util.*;

/**
 * Basic Algorithm Exercises 1:
 * Description: Given the following array, solve the following process.
 * Get the highest Age.
 * Get the lowest Age.
 * Get the Average Age.
 * Get the number of persons under 18.
 * Get the number of persons over 18.
 * Get the number of persons of the same age.
 * Every process must print the expected result on the console.*
 */
public class BasicAlgorithmExercises1{


    final int[] AGE = {87,6,17,37,11,89,34,26,25,21,21,37,55,33,81,6};

    public void loopSolution(){
        // Variables Definition
        int highestAge = 0, lowestAge = 0, avarageAge = 0, personsUnder18 = 0, personsOver18 = 0, sameAgeCounter = 0;
        Hashtable<Integer,Integer> personsSameAge = new Hashtable<Integer,Integer>();

        // Temporal variable. Only used to sum all numbers in order to generate the avarageAge.
        int tempSumAges = 0;
        // Assuming that the first age at the list is the older and the youngest of the list.
        // This is inloy to have a initialization.
        highestAge = AGE[0];
        lowestAge = AGE[0];

        for (int actualAge : AGE){

            // Get the highest Age.
            if (actualAge > highestAge){
                highestAge = actualAge;
            }

            // Get the lowest Age.
            if (actualAge < lowestAge){
                lowestAge = actualAge;
            }

            //Get the Average Age.
            tempSumAges += actualAge;

            // Get the number of persons under 18.
            if (actualAge < 18) {
                personsUnder18 += 1;
            }

            // Get the number of persons over 18.
            if (actualAge > 18) {
                personsOver18 += 1;
            }

            // Get the number of persons with the same age

            if ( personsSameAge.get(actualAge) == null){
                personsSameAge.put(actualAge,1);
            }else{
                int actualPersonCounter = personsSameAge.get(actualAge);
                sameAgeCounter += 1;
                personsSameAge.put(actualAge, actualPersonCounter + 1);
            }
        }

        // Generate the avg
        avarageAge = tempSumAges/AGE.length;

        String response = " -- Results \n" +
                "* The highest age -> " + highestAge  + "\n" +
                "* The lowest age -> " + lowestAge + "\n" +
                "* The Average age -> " + avarageAge + "\n" +
                "* Persons under 18 -> " + personsUnder18 + "\n" +
                "* Persons over 18 -> " + personsOver18 + "\n" +
                "* The same age list -> " + personsSameAge + "\n" +
                "* The same age Counter -> " +sameAgeCounter;

        System.out.println(response);
    }

}