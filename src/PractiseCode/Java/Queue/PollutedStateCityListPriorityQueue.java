package PractiseCode.Java.Queue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
class City{
    String cityName;
    int pollutionLevel;
}

public class PollutedStateCityListPriorityQueue {
    public static void main(String args[]) {
        System.out.println("Enter how many record you will pass: after that provide id country state city and " +
                "pollution in next line");
        try {
            Scanner input = new Scanner(System.in);
            int inputRowsCount = Integer.parseInt(input.nextLine());

            Comparator<City> comparatorByPollutionLevel = Comparator
                    .comparing(City::getPollutionLevel)
                    .thenComparing(City::getCityName);

            HashMap<String, HashMap<String, PriorityQueue<City>>> stateCityPollutionMap = new HashMap<>();

            while (inputRowsCount > 0) {
                String country = input.next();
                String state = input.next();
                String city = input.next();
                int pollution = input.nextInt();

                //If we don't want to get top three polluted city
                //stateCityPollutionMap.computeIfAbsent(country, k-> new HashMap<>())
                //        .computeIfAbsent(state, k-> new PriorityQueue<>(comparatorByPollutionLevel))
                //        .add(new City(city, pollution));

                stateCityPollutionMap.computeIfAbsent(country, k -> new HashMap<>())
                        .computeIfAbsent(state, k -> new PriorityQueue<>(comparatorByPollutionLevel));

                PriorityQueue<City> cityPQ = stateCityPollutionMap.get(country).get(state);

                if (cityPQ.size() < 3) {
                    City city1 = new City(city, pollution);
                    stateCityPollutionMap.get(country).get(state).add(city1);
                } else {
                    if (cityPQ.peek().getPollutionLevel() < pollution) {
                        cityPQ.poll();
                        cityPQ.add(new City(city, pollution));
                    }
                }

                    inputRowsCount--;
            }

    //        System.out.println(stateCityPollutionMap);

            // using for-each loop for iteration over Map.entrySet()
    //        for (Map.Entry<String, HashMap<String, PriorityQueue<City>>> entry : stateCityPollutionMap.entrySet()) {
    //            for (Map.Entry<String, PriorityQueue<City>> entry1 : entry.getValue().entrySet()) {
    //                System.out.println("Key = " + entry.getKey() + " Key = " + entry1.getKey() + " Value = " + entry1.getValue());
    //            }
    //        }


            // forEach(action) method to iterate map
            stateCityPollutionMap.forEach((k,v) ->
                    v.forEach((k1, v1) ->
                            System.out.println("Key = " + k + " Key = " + k1 + " Value = " + v1)
                    )
            );
        }
        catch(NumberFormatException | InputMismatchException nfe){
            nfe.getMessage();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
/*
10
India UP Kanpur 40
India UP Agra 70
India UP Meerut 40
India UP Lucknow 50
India Haryana Sonipat 40
India Haryana Jhajjhar 80
India Haryana Faridabad 60
India Haryana Hisar 50
India Haryana Gurgaon 90
India Punjab Chandigarh 60
 */
