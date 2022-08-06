package PractiseCode.Java;

public class RemoveDuplicate {

    public static void main(String[] args){
        removeDuplicates(new int[]{1, 1, 2, 2, 2, 3});
    }

    public static void removeDuplicates(int[] nums) {
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
}
