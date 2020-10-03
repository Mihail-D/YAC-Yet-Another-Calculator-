import javafx.beans.binding.MapExpression;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RomanNumeric {
    private static MapExpression<String, Integer> romanNumericSet;
    Map<String, Integer> romanNumeric = new HashMap<String, Integer>() {{
        put("I", 1);
        put("II", 2);
        put("III", 3);
        put("IV", 4);
        put("V", 5);
        put("VI", 6);
        put("VII", 7);
        put("VIII", 8);
        put("IX", 9);
        put("X", 10);
    }};

    public static int getArabicFromRoman(String s) {
        int arabicInt = 0;
        Iterator<String> itr = romanNumericSet.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            int value = romanNumericSet.get(key);

            if(key.equals(s)) {
                arabicInt = value;
            }
        }
        return arabicInt;
    }
}
