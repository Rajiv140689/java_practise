package PractiseCode.Java;

/**
 input={1,4,3,2,6,7,3,4,2,1,4,5}
 output=[1,4]
 [3,4]
 [1,4,5]
 [2,6,7]
 **/

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

class value {
    String value1;
    Integer value2;
}

public class SubArray {

    public static void main(String[] args) {
        int[] inputArray = {1,4,3,2,6,7,3,4,2,1,4,5};
        int i = 0;
        ArrayList<Integer> subArrayList = new ArrayList<Integer>();
        //LinkedHashMap preserves the insertion order
        LinkedHashMap<Integer, value> subArrayCountHashMap = new LinkedHashMap<>();
        String arr = "";
        int size = 0;

        for (int arrayValue : inputArray) {
            if (subArrayList.isEmpty()) {
                subArrayList.add(arrayValue);
            } else if (!subArrayList.isEmpty()){
                if (subArrayList.get(i-1) < arrayValue) {
                    subArrayList.add(arrayValue);
          } else{
                value valueObj = new value();
                arr =  subArrayList.toString();
                size = subArrayList.size();
                valueObj.value1 = arr;
                valueObj.value2 = size;

                subArrayCountHashMap.put(subArrayList.hashCode(), valueObj);

                i=0;
                subArrayList.clear();
                subArrayList.add(arrayValue);
                }
            }
            i++;
        }

        value valueObj = new value();
        arr =  subArrayList.toString();
        size = subArrayList.size();
        valueObj.value1 = arr;
        valueObj.value2 = size;

        subArrayCountHashMap.put(subArrayList.hashCode(), valueObj);

        for (Map.Entry<Integer, value> entry : subArrayCountHashMap.entrySet()){
            System.out.println("Key = " + entry.getKey()
                    + ", Value1 = " + entry.getValue().value1
                    + ", Value2 = " + entry.getValue().value2);
        }
    }
}
