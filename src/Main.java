import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] arr = StringConverter.getSplitString(s);
        CheckString.checkStringLength(arr);
        //return java.util.regex.Pattern.matches("\\d+", s);
        if(java.util.regex.Pattern.matches("\\d+", arr[0])) {
            CheckString.checkAllArabic(arr);
            double result = ArabicMathBloc.getResult(arr);
            System.out.println(result);
        }
          else if (CheckString.checkAllRoman(arr)) {
            System.out.println("ROMAN!!!!!!!!!");
        }






    }
}
