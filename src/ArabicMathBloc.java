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
            double x = Double.parseDouble(arr[0]) / Double.parseDouble(arr[2]);
            result = Math.round(x * 100.0) / 100.0;
        }

    return result;
    }
}
