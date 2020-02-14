package co.com.globant.java.mentoring;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaEx2 {
    /**
     * Basic Algorithm Exercises 2:
     * Description: Given the following matrix, solve the following process.
     * Get the highest Age per group.
     * Get Lowest Age per group.
     * Get the Average Age per group.
     * Every process must print the expected result on the console.
     */
    final int[][] GROUP_AGE = {{10,29,8},{17,9,2},{34,11,28},{9,15,33},{67,23,45},{5,10,9}};
    List grpupAge;


    public  LambdaEx2(){
        grpupAge = Arrays.asList(grpupAge);
    }
    public int highestPerGroup(){
        return grpupAge.stream().flatMap( i -> Arrays.asList(i).stream().max(Integer::compare).get());
    }
    public static void main(String[] args) {

    }


}
