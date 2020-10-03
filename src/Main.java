import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] arr = StringConverter.getSplitString(s);
        CheckString.checkStringLength(arr);

        if (java.util.regex.Pattern.matches("\\d+", arr[0])) {
            CheckString.checkAllArabic(arr);
            double result = ArabicMathBloc.getResult(arr);
            System.out.println(result);
        }
        else if (arr[0].matches("^(X{0,3})(IX|IV|V?I{0,3})$")) {
            CheckString.checkAllRoman(arr);
            int result = RomanMathBloc.getResult(arr);
            System.out.println(result);
        }
    }
}
