package PractiseCode.Java;

/**
 * Given an array of N integers. The task is to print the elements from the array which are greater than their
 * immediate previous and next elements.
 * Examples :
 * Input : arr[] = {2, 3, 1, 5, 4, 9, 8, 10, 8}
 * Output : 3, 5, 9, 10
 */
public class GreaterThanPreviousAndNextElement {

    public static void main(String[] args){
        int[] inputArr = {2, 3, 1, 5, 4, 9, 8, 10, 8};
        int arrayLength = inputArr.length;
        System.out.println("array length: "+arrayLength);
        printElementgreaterThanPreviousAndNextElement(inputArr, arrayLength);
    }

    private static void printElementgreaterThanPreviousAndNextElement(int[] input, int length){
        for(int i=1; i < length-1; i++){
            if(input[i] > input[i-1] && input[i] > input[i+1]){
                //System.out.println(i + " : "+ (length-2));
                if(i < length-2){
                    System.out.print(input[i] + ", ");
                }
                else{
                    System.out.print(input[i]);
                }
            }
        }

    }
}
