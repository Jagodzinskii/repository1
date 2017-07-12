import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-07-07.
 */
public class Main {
    public static void main(String[] args) {
        String stringValue = "ABC";
        List<String> stringList = new ArrayList<>();
        stringList.add(stringValue);
        stringList.add("DEF");
        System.out.println(stringList.get(0));
        System.out.println(stringList.contains(stringValue));
        stringList.remove(stringValue);
        stringList.remove(0);

        stringList.add(stringValue);
        stringList.add(stringValue);
        stringList.add(stringValue);

        for (String text: stringList) {
            System.out.println(text);
        }

        System.out.println(stringList);
    }
}