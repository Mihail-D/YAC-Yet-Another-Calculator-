import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] arr = StringConverter.getSplitString(s);
        CheckString.checkStringLength(arr);

        CheckString.checkAllArabic(arr);


        double result = ArabicMathBloc.getResult(arr);



        System.out.println(result);
    }
}
