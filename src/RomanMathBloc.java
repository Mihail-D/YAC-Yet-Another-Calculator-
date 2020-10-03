public class RomanMathBloc {
    public static int getResult(String[] arr) {
        String operator = arr[1];
        int result = 0;

        if (operator.equals("+")) {
            result = RomanNumeric.getArabicFromRoman(arr[0]) + RomanNumeric.getArabicFromRoman(arr[2]);
        }
        else if (operator.equals("-")) {
            result = RomanNumeric.getArabicFromRoman(arr[0]) - RomanNumeric.getArabicFromRoman(arr[2]);
        }
        else if (operator.equals("*")) {
            result = RomanNumeric.getArabicFromRoman(arr[0]) * RomanNumeric.getArabicFromRoman(arr[2]);
        }
        else if (operator.equals("/")) {
            result = RomanNumeric.getArabicFromRoman(arr[0]) / RomanNumeric.getArabicFromRoman(arr[2]);
        }

        return Math.round(result);
    }
}
