package DuplicateNumber;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MissingNumFromArray {
    public static void main(String args[]){

        List<Integer> input =  new ArrayList<>();
        for(int i=1; i<=30; i++){
            input.add(i);
        }
        Collections.shuffle(input);
        System.out.println("Removed number: " + input.remove(0));
        Integer[] inputArr = new Integer[input.size()];
        input.toArray(inputArr);

        MissingNumFromArray missingNumFromArray = new MissingNumFromArray();
        System.out.println("The missing number is: " + missingNumFromArray.findMissingNumber(inputArr));
    }

    private int findMissingNumber(Integer[] input){

        int totalArrSum = 0;
        for(int i:input){
            totalArrSum=totalArrSum+i;
        }
        /*
        * Formula for sum of 1 to n numbers:
        * n*(n+1)/2
         */
        int numberSize = input.length + 1;
        int sumOfNNum = numberSize*(numberSize+1)/2;
        return sumOfNNum - totalArrSum;
    }


}
