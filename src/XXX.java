/**import java.util.*;
 * Created by RENT on 2017-07-07.
 */
public class XXX {
}


/**
 * Created by RENT on 2017-07-07.
 */
public class Main {
    public static void main(String[] args) {
//        String stringValue = "ABC";
//        List<String> stringList = new ArrayList<>();
//        stringList.add(stringValue);
//        stringList.add("DEF");
//        System.out.println(stringList.get(1));
//        System.out.println(stringList.contains(stringValue));
//        stringList.remove(stringValue);
//        stringList.remove(0);
//
//        stringList.add(stringValue);
//        stringList.add(stringValue);
//        stringList.add(stringValue);
//
//        for (String text: stringList) {
//            System.out.println(text);
//        }
//Zbiory
//       Set<Integer> integerSet = new HashSet<>();
//        integerSet.add(5);
//        integerSet.add(5);
//        integerSet.add(6);
//
//        System.out.println(integerSet);
//
//        integerSet.remove(5);
//        System.out.println(integerSet);
//
//        for(Integer element: integerSet) {
//            System.out.println(element);
//        }
//
//        System.out.println("Liczba elementow zbioru: "
//                + integerSet.size());
//        System.out.println("Czy w zbiorze zawarta jest wartość 6: "
//                + integerSet.contains(6));
//        System.out.println("Czy zbior jest pusty: "
//                + integerSet.isEmpty());

        //Mapy
        System.out.println("\n\nZbiory");
        Map<String, String> capitalCityByCountry = new HashMap<>();
        capitalCityByCountry.put("Polska", "Warszawa");
        capitalCityByCountry.put("Niemcy", "Berlin");
        capitalCityByCountry.put("Czechy", "Praga");

        System.out.println(capitalCityByCountry.get("Polska"));

        capitalCityByCountry.remove("Niemcy");
        System.out.println(capitalCityByCountry);

        for(String key: capitalCityByCountry.keySet()) {
            System.out.println("Dla klucza " + key +
                    "mamy wartość " + capitalCityByCountry.get(key));
        }

        for(String value: capitalCityByCountry.values()) {
            System.out.println("W mapie mamy wartość: " + value);
        }


    }
}