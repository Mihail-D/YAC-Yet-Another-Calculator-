import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите арабские числа от 1 до 10 или римские числа от I до X.");
        System.out.println("Между числами и оператором необходимо ставить пробел.");
        String s = reader.readLine();
        String[] arr = StringConverter.getSplitString(s);
        CheckString.checkStringLength(arr);

        if (java.util.regex.Pattern.matches("\\d+", arr[0])) {
            CheckString.checkRangeArabic(arr);
            CheckString.checkAllArabic(arr);
            double result = ArabicMathBloc.getResult(arr);
            System.out.println(result);
        }
        else if (arr[0].matches("^(X{0,3})(IX|IV|V?I{0,3})$")) {
            CheckString.checkAllRoman(arr);
            int result = RomanMathBloc.getResult(arr);
            System.out.println(IntegerConverter.intToRoman(result));
        }
        else {
            throw new Exception("Строка не соответсвуте заданному формату");
        }
    }
}
