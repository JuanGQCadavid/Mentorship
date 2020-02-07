package co.com.globant.java.mentoring;

/**
 * Basic Algorithm Exercises 2:
 * Description: Given the following matrix, solve the following process.
 * Get the highest Age per group.
 * Get Lowest Age per group.
 * Get the Average Age per group.
 * Every process must print the expected result on the console.
 */
public class BasicAlgorithmExercises2{

    final int[][] GROUP_AGE = {{10,29,8},{17,9,2},{34,11,28},{9,15,33},{67,23,45},{5,10,9}};

    public void loopSolution(){
        // Data about the group
        int groupsNumber =0, agesPerGroup = 0;

        groupsNumber = GROUP_AGE.length;
        agesPerGroup = GROUP_AGE[0].length;

        // The answerd is gonna be store in a list, each position represents a age group
        int [] lowestAgePerGroup = new int [groupsNumber];
        int [] highestAgePerGroup = new int [groupsNumber];
        int [] averageAgePerGroup = new int [groupsNumber];

        // String format
        String lowestAgePerGroupString = "",highestAgePerGroupString = "", averageAgePerGroupString = "";

        // Index tha helps to know wich group is it iterating.
        int groupIndex = 0;

        // This loop jumps group by group
        for (int [] group: GROUP_AGE){
            // Temp variables used to store the answerd founded at the inner loop
            int tempGroupAgeSum = 0, tempHighestAge = 0, tempLowestAge = 0;

            tempHighestAge = group[0];
            tempLowestAge = group[0];

            for (int age: group){

                // Get the highest age
                if (age > tempHighestAge){
                    tempHighestAge = age;
                }

                // Get the lowest Age.
                if (age < tempLowestAge){
                    tempLowestAge = age;
                }

                // Kepp summing the ages
                tempGroupAgeSum += age;
            }
            // Store the results.
            lowestAgePerGroup[groupIndex] = tempLowestAge;
            highestAgePerGroup[groupIndex] = tempHighestAge;
            lowestAgePerGroup[groupIndex] = tempGroupAgeSum / agesPerGroup;

            // Same aproach but using Strings
            lowestAgePerGroupString = lowestAgePerGroupString + tempLowestAge + ",";
            highestAgePerGroupString = highestAgePerGroupString + tempHighestAge + ",";
            averageAgePerGroupString = averageAgePerGroupString + (tempGroupAgeSum / agesPerGroup) + ",";

            // Update the index.
            groupIndex++;
        }

        String response = " -- Results \n" +
                "* The lowest age per group -> " + lowestAgePerGroupString  + "\n" +
                "* The highest age per group -> " + highestAgePerGroupString + "\n" +
                "* The Average age per group-> " + averageAgePerGroupString;

        System.out.println(response);
    }

}
