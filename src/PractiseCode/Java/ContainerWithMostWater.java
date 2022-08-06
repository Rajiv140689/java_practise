package PractiseCode.Java;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int width = 0;
        while(left < right){
            width = right - left;
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * width);
            if(height[left] < height[right])
                left ++;
            else
                right--;
        }
        return maxArea;
    }
}

