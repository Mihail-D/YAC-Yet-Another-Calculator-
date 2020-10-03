public class ArabicMathBloc {
    public static double getResult(String[] arr) {
        String operator = arr[1];
        double result = 0;
        switch (operator) {
            case "+":
                result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
                break;
            case "-":
                result = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
                break;
            case "*":
                result = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
                break;
            case "/":
                double x = Double.parseDouble(arr[0]) / Double.parseDouble(arr[2]);
                result = Math.round(x * 100.0) / 100.0;
                break;
        }

        return result;
    }
}
