package co.com.globant.java.mentoring;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  From a set of names the following operations must be performed
 *    Organize alphabetically.
 *    Determine the longest name
 *   Determine the shortest name
 *    Remove the vowels of each name
 */
public class BasicAlgorithmExercises3 {

    String [] namesList = {"Juan", "Valentin", "Sara", "Sidney"};
    public BasicAlgorithmExercises3(){}

    public void longestName(){
        String longest = Arrays.stream(namesList).max(String::compareTo).get();
        System.out.println("Longest -> " + longest);
    }

    public void shortestName(){
        String shortest = Arrays.stream(namesList).min(String::compareTo).get();
        System.out.println("Shortest -> " + shortest);
    }

    public void arrangeNames(){
        List nameListSorted = Arrays.stream(namesList).sorted().collect(Collectors.toList());
        System.out.println("Arranged -> " +  nameListSorted);
    }

    public static void main(String[] args) {
        BasicAlgorithmExercises3 lm3 = new BasicAlgorithmExercises3();
        lm3.shortestName();
        lm3.longestName();
        lm3.arrangeNames();

    }
}