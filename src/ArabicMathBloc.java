public class ArabicMathBloc {
    public static double getResult(String[] arr) {
        String operator = arr[1];
        double result = 0;
        if (operator.equals("+")) {
            result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
        }
        else if (operator.equals("-")) {
            result = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
        }
        else if (operator.equals("*")) {
            result = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
        }
        else if (operator.equals("/")) {
            result = (double) Integer.parseInt(arr[0]) / Integer.parseInt(arr[2]);
        }

    return result;
    }
}
