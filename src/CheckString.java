public class CheckString {
    public static void checkStringLength(String[] arr) {
        if (arr.length <= 0) {
            throw new ArrayIndexOutOfBoundsException("Введите строку в формате " + "\"число-оператор-число\"");
        }
    }

    public static boolean checkAllArabic(String[] arr) {
        String[] sample = {arr[0], arr[2]};
        boolean isNumeric = true;
        for (String s : sample) {
            isNumeric = s.chars().allMatch(Character::isDigit);
            if (!isNumeric) {
                throw new NullPointerException("В строке допустимы только арабские числа");
            }
        }
        return isNumeric;
    }

    public static boolean checkAllRoman(String[] arr) throws Exception {
        String[] sample = {arr[0], arr[2]};
        boolean isRoman = false;

        for (String s : sample) {
            if (s.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
                isRoman = true;
            }
            else {
                throw new Exception("В строке допустимы только римские числа");
            }
        }
        return isRoman;
    }

}
