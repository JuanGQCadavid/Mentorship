package co.com.globant.java.mentoring;

/**
 * This class embody the age functions used to
 * settle the age comparations
 */
public class AgeUtilities {

    final static int AGE_THRESHOLD = 18;

    /**
     * Compare two integers and return the higher.
     * @param ageOne    Int number
     * @param ageTwo    Int number
     * @return          The Higher number between them.
     */
    public static int getHigherAge(int ageOne, int ageTwo){
        if(ageOne > ageTwo){
            return ageOne;
        } else{
            return ageTwo;
        }
    }

    /**
     * Compare two integers and return the lower.
     * @param ageOne    Int number
     * @param ageTwo    Int number
     * @return          The lower number between them.
     */
    public static int getLowerAge(int ageOne, int ageTwo){
        if(ageOne < ageTwo){
            return ageOne;
        } else{
            return ageTwo;
        }
    }

    /**
     * calculate the average using the simple form.
     * @param totalSum          Int -> The sum of each units
     * @param amountOfUnits     Int -> The number of units
     * @return
     */
    public static int getAverage(int totalSum, int amountOfUnits){
        return totalSum/amountOfUnits;
    }

    public static boolean isOverAgeThreashold(int age){
        if (age >= AGE_THRESHOLD) {
            return true;
        } else {
            return false;
        }
    }
}