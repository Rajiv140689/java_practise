package PractiseCode.Java;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {

    public static void main(String[] args){
        //removeDuplicatesForSorted(new int[]{1, 1, 2, 2, 2, 3});

        //Sort it using Arrays.sort() (Time complexity of Array.sort isO(n log n)) and then use method 1 but time
        // complexity will be O(n log n)
        removeDuplicatesForUnSorted(new int[]{1, 3, 2, 5, 2, 3, 5, 7, 7, 8});
    }

    public static void removeDuplicatesForSorted(int[] nums) {
        int[] expectedNums = new int[nums.length];
        for(int i=0,j=0; i< nums.length; i++){
            if (j==0){
                if(expectedNums[j] != nums[i]){
                    expectedNums[j] = nums[i];
                    j++;
                }
            }
            else{
                if(expectedNums[j-1] != nums[i]){
                    expectedNums[j] = nums[i];
                    j++;
                }
            }
        }

        for (int i = 0; i < expectedNums.length; i++) {
            System.out.print(expectedNums[i] + " ");
        }
    }


    //Time complexity is O(n)
    public static void removeDuplicatesForUnSorted(int[] nums) {
        Map<Integer, Integer> storeUniqueCharMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(storeUniqueCharMap.containsKey(nums[i])){
                storeUniqueCharMap.put(nums[i], storeUniqueCharMap.get(nums[i]) + 1);
            }else {
                storeUniqueCharMap.put(nums[i], 1);
            }
        }
        storeUniqueCharMap.forEach((k,v) -> System.out.print(k + " "));
        System.out.println();
        //or
        for(Map.Entry<Integer, Integer> entry : storeUniqueCharMap.entrySet()){
            System.out.print(entry.getKey() + " ");
        }
        System.out.println();
        //or
        for(Integer key : storeUniqueCharMap.keySet()){
            System.out.print(key + " ");
        }
        }
}
