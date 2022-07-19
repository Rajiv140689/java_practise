package PractiseCode;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String id = "12345-3546-789e-89766, abc-cde-efg-ghi";
        String[] idlist = id.split(",");
        System.out.println(idlist[0] + " ; "+ idlist[1]);

        List<String> testArrayList = new ArrayList<String>();
        testArrayList.add("kutta");
        testArrayList.add("billi");
        testArrayList.add("chuha");
        testArrayList.add("kamina");
        testArrayList.add("harami");

        System.out.println(testArrayList.get(0));

        for(String data : testArrayList){
            System.out.println("data: "+data);
        }
    }
}
