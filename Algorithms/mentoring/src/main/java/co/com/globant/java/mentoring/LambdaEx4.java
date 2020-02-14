package co.com.globant.java.mentoring;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Basic Algorithm Exercises 3:
 From a list of numbers determine
 * Even numbers
 * odd numbers.
 * Organize detachantly
 * Organize assiduously.
 */
public class LambdaEx4 {
    final int [] NUMBERS ={2,4,6,8,3,5,7,9,11};

    public LambdaEx4(){}

    public boolean evenFunction(int number){
        return (number % 2) == 0 ? true: false;
    }

    public void evenNumbers(){
        List results = Arrays.stream(NUMBERS)
                .filter(number -> this.evenFunction(number))
                .collect(Collectors.toList());
        System.out.println("Partial result -> " + results);
    }

    public void oddNumber(){
    }

    public static void main(String[] args) {
        LambdaEx4 lm4 = new LambdaEx4();
        lm4.evenNumbers();
    }

}
