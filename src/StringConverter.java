public class StringConverter {
    public static String[] getSplitString(String s) {
        s = s.replaceAll("\\s+", "");
        String array[] = s.split("");
        return array;
    }
}
