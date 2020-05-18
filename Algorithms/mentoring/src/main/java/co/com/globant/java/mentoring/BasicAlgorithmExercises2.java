package co.com.globant.java.mentoring;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Basic Algorithm Exercises 2:
 * Description: Given the following matrix, solve the following process.
 * Get the highest Age per group.                           D
 * Get Lowest Age per group.                                D
 * Get the Average Age per group.
 * Every process must print the expected result on the console.
 */
public class BasicAlgorithmExercises2 {

    final int[][] GROUP_AGE = {{10,29,8},{17,9,2},{34,11,28},{9,15,33},{67,23,45},{5,10,9}};


    public  BasicAlgorithmExercises2(){
    }

    public void highestPerGroup(){
        List <Integer>  response = Arrays.stream(GROUP_AGE)
                .map(subList -> Arrays.stream(subList).max())
                .map(x ->  x.getAsInt() )
                .collect(Collectors.toList());

        System.out.println("Highest -> " + response);
    }

    public void lowestPerGroup(){
        List <Integer> response = Arrays.stream(GROUP_AGE)
                .map(subList -> Arrays.stream(subList).min())
                .map(x -> x.getAsInt())
                .collect(Collectors.toList());

        System.out.println("Lowest -> " +  response);
    }

    public void avgPerGrup(){
        List <Integer> response = Arrays.stream(GROUP_AGE)
                .map(subList -> Arrays.stream(subList).sum() / subList.length )
                .collect(Collectors.toList());
        System.out.println("Avg ->" +  response);
    }

    public static void main(String[] args) {
        BasicAlgorithmExercises2 lm2 = new BasicAlgorithmExercises2();
        lm2.highestPerGroup();
        lm2.lowestPerGroup();
        lm2.avgPerGrup();
    }


}