package co.com.globant.java.mentoring;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
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
public class BasicAlgorithmExercises4 {
    final Integer [] NUMBERS ={3,5,7,9,11, 2,4,6,8,};

    public BasicAlgorithmExercises4(){}

    public boolean evenFunction(int number){
        return (number % 2) == 0 ? true: false;
    }
    public boolean oddFunction(int number){
        return (number % 2) == 0 ? false: true;
    }

    public void detachanlyArraged(){
        List results = Arrays.stream(NUMBERS)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("detachanlyArraged -> " + results);
    }

    public void assiduouslyArraged(){
        List results = Arrays.stream(NUMBERS)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("assiduouslyArraged -> " + results);
    }
    public void evenNumbers(){
        List results = Arrays.stream(NUMBERS)
                .filter(number -> this.evenFunction(number))
                .collect(Collectors.toList());

        System.out.println("even Numbers -> " + results);
    }

    public void oddNumbers(){
        List results = Arrays.stream(NUMBERS)
                .filter(number -> this.oddFunction(number))
                .collect(Collectors.toList());
        System.out.println("Odd Numbers -> " + results);
    }



    public static void main(String[] args) {
        BasicAlgorithmExercises4 lm4 = new BasicAlgorithmExercises4();
        lm4.evenNumbers();
        lm4.oddNumbers();
        lm4.detachanlyArraged();
        lm4.assiduouslyArraged();

    }

}