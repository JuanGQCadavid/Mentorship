package co.com.globant.java.mentoring;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Basic Algorithm Exercises 1:
 * Description: Given the following array, solve the following process.
 * Get the highest Age.                         D
 * Get the lowest Age.                          D
 * Get the Average Age.                         D
 * Get the number of persons under 18.          D
 * Get the number of persons over 18.           D
 * Get the number of persons of the same age.
 * Every process must print the expected result on the console.*
 */
public class BasicAlgorithmExercises1 {

    final Integer [] AGE = {87,6,17,37,11,89,34,26,25,21,21,37,55,33,81,6};
    final static int AGE_THRESHOLD = 18;
    List<Integer> ageList;

    public BasicAlgorithmExercises1(){
        ageList = Arrays.asList(AGE);
    }

    public void highestAge(){
        Integer highest = ageList.stream().max(Integer::compare).get();
        System.out.println("Highest -> " + highest);
    }
    public void lowestAge(){
        int response =  ageList.stream().min(Integer::compare).get();
        System.out.println("Lowest -> " + response);
    }
    public void avgAge(){
        int response =  ageList.stream().reduce(Integer::sum).get()/ageList.size();
        System.out.println("Avg -> " +response);
    }
    public void underThreshold(){
        long response = ageList.stream().filter( age -> age < AGE_THRESHOLD ).count();
        System.out.println("Under Threshold -> " + response);
    }
    public void  overThreshold(){
        long response = ageList.stream().filter( age -> age > AGE_THRESHOLD ).count();
        System.out.println("Over Threshold -> " + response);
    }

    /*
    public int sameAge(){
        return ageList.stream().flatMap( i -> ageList.stream().filter(j -> j.equals(i)).count());
    }
     */


    public static void main(String[] args) {
        BasicAlgorithmExercises1 lm1 = new BasicAlgorithmExercises1();
        lm1.avgAge();
        lm1.highestAge();
        lm1.lowestAge();
        lm1.underThreshold();
        lm1.overThreshold();

    }


}