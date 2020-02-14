package co.com.globant.java.mentoring;
import java.util.Hashtable;
import java.util.Dictionary;
import java.lang.StringBuilder;


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
            highestAge = AgeUtilities.getHigherAge(actualAge, highestAge);

            // Get the lowest Age.
            lowestAge = AgeUtilities.getLowerAge(actualAge, lowestAge);

            //Get the Average Age.
            tempSumAges += actualAge;

            // Get the number of persons under and over 18.
            if (AgeUtilities.isOverAgeThreashold(actualAge)) {
                personsOver18 ++;
            }else{
                personsUnder18 ++;
            }

            // Get the number of persons with the same age
            sameAgeCounter += sameAgeDiscover(personsSameAge, actualAge);
        }

        // Generate the avg
        avarageAge = AgeUtilities.getAverage(tempSumAges, AGE.length);

        // Generate the string output and printed
        printResponse(generateResponse(highestAge,lowestAge,avarageAge,personsUnder18,personsOver18,personsSameAge,sameAgeCounter));
    }

    /**
     * Display response at console
     * @param response
     */
    public void printResponse(StringBuilder response){
        System.out.println(response);
    }

    /**
     * Generate a StringBuilder that has the output message that shows the
     * variables listed at the firm.
     * @param highestAge        Int
     * @param lowestAge         Int
     * @param avarageAge        Int
     * @param personsUnder18    Int
     * @param personsOver18     Int
     * @param personsSameAge    Dictionary
     * @param sameAgeCounter    Int
     * @return                  StringBuilder Response
     */
    public StringBuilder generateResponse(int highestAge,int lowestAge,int avarageAge,int personsUnder18,int personsOver18,Dictionary personsSameAge,int sameAgeCounter){
        StringBuilder response = new StringBuilder("-- Results");
        response.append("\n* The highest age -> ");
        response.append(highestAge);

        response.append("\n* The lowest age -> ");
        response.append(lowestAge);

        response.append("\n* The Average age -> ");
        response.append(avarageAge);

        response.append("\n* Persons under 18 -> ");
        response.append(personsUnder18);

        response.append("\n* Persons over 18 -> ");
        response.append(personsOver18);

        response.append("\n* The same age list -> ");
        response.append(personsSameAge);

        response.append("\n* The same age Counter -> ");
        response.append(sameAgeCounter);

        return response;

    }

    /**
     *
     * @param ageDictionary     -> Java Dictionary Object that store <Age, AgeCounter>
     * @param age               -> Age to compare with previus ages.
     * @return                  -> 0 if it is the only age, 1 if there is another same age at the dictonary
     */
    public int sameAgeDiscover(Dictionary ageDictionary, int age){

        if ( ageDictionary.get(age) == null){
            ageDictionary.put(age,1);

            return 0;
        }else{
            int actualPersonCounter = ((Integer) ageDictionary.get(age)).intValue();
            ageDictionary.put(age, actualPersonCounter + 1);

            return 1;
        }
    }

}