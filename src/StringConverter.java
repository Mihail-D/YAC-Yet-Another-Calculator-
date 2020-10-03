public class StringConverter {
    public static String[] getSplitString(String s) {
        s = s.replaceAll("\\s+", "");
        return s.split("");
    }
}
