public class RomanMathBloc {
    public static int getResult(String[] arr) {
        String operator = arr[1];
        int result = 0;

        switch (operator) {
            case "+":
                result = RomanNumeric.getArabicFromRoman(arr[0]) + RomanNumeric.getArabicFromRoman(arr[2]);
                break;
            case "-":
                result = RomanNumeric.getArabicFromRoman(arr[0]) - RomanNumeric.getArabicFromRoman(arr[2]);
                break;
            case "*":
                result = RomanNumeric.getArabicFromRoman(arr[0]) * RomanNumeric.getArabicFromRoman(arr[2]);
                break;
            case "/":
                result = RomanNumeric.getArabicFromRoman(arr[0]) / RomanNumeric.getArabicFromRoman(arr[2]);
                break;
        }

        return Math.round(result);
    }
}
