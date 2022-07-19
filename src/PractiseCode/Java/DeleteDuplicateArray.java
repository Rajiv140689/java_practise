package PractiseCode.Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DeleteDuplicateArray {
    public static void main(String[] args) {
        String[] arr1 = new String[5];
        arr1[0] = "rajiv";
        arr1[1] = "singh";
        arr1[2] = "rahul";
        arr1[3] = "rahul";
        arr1[4] = "singh";
        int i = 0;

        Map<String, Integer> cleanArrDataMap = new HashMap<String, Integer>();

        for(String arrData : arr1){
            if(cleanArrDataMap.get(arrData) == null){
                cleanArrDataMap.put(arrData, 1);
            }
            else{
                cleanArrDataMap.put(arrData, cleanArrDataMap.get(arrData)+1);
            }
        }

        Set<Map.Entry<String, Integer>> entrySet = cleanArrDataMap.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet)
        {
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            }
        }
    }
}
