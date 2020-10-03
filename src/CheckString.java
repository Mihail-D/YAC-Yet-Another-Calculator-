public class CheckString {
    public static void checkStringLength(String[] arr) {
        if (arr.length != 3) {
            throw new ArrayIndexOutOfBoundsException("Введите строку в формате " + "\"число-оператор-число\"");
        }
    }

    public static void checkAllArabic(String[] arr) {
        String[] sample = {arr[0], arr[2]};
        for (int i = 0; i < sample.length; i++) {
            boolean isNumeric = sample[i].chars().allMatch(Character::isDigit);
            if (!isNumeric) {
                throw new NullPointerException("В строке допустимы только арабские числа");
            }
        }

    }
}
