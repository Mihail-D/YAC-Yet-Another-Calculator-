import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RomanNumeric {
    static Map<String, Integer> romanNumeric = new HashMap<String, Integer>() {{
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
        Set<String> set = romanNumeric.keySet();
        for (String key : set) {
            int value = romanNumeric.get(key);

            if (key.equals(s)) {
                arabicInt = value;
            }
        }
        return arabicInt;
    }
}
