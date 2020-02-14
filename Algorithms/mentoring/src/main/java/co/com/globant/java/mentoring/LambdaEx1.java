package co.com.globant.java.mentoring;
import java.util.*;
import java.util.stream.Collectors;

public class LambdaEx1 {
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

    final Integer [] AGE = {87,6,17,37,11,89,34,26,25,21,21,37,55,33,81,6};
    final static int AGE_THRESHOLD = 18;
    List<Integer> ageList;

    public LambdaEx1(){
        ageList = Arrays.asList(AGE);
    }
    public int highestAge(){
        Integer highest = ageList.stream().max(Integer::compare).get();
        return highest;
    }
    public int lowestAge(){
        return ageList.stream().min(Integer::compare).get();
    }

    public int avgAge(){
        return ageList.stream().reduce(Integer::sum).map(x -> x/ageList.size()).get();
    }
    public long underThreashold(){
        return ageList.stream().filter( age -> age < AGE_THRESHOLD ).count();
    }
    public long overThreashold(){
        return ageList.stream().filter( age -> age > AGE_THRESHOLD ).count();
    }
    /*
    public int sameAge(){
        return ageList.stream().flatMap( i -> ageList.stream().filter(j -> j.equals(i)).count());
    }
     */

    public static void main(String[] args) {
        LambdaEx1 objResponse = new LambdaEx1();
        System.out.println("Output ->  " +  objResponse.overThreashold());
    }


}
