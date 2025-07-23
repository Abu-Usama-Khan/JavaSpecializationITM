public class Constants {
    public static String Monday = "Monday";
    public static String Tuesday = "Tuesday";
    public static String Wednesday = "Wednesday";
    public static String Thursday = "Thursday";
    public static String Friday = "Friday";
    public static String Saturday = "Saturday";
    public static String Sunday = "Sunday";

    public boolean helper(String str) {
        if (str == null) return false;
        return !str.isBlank();
    }

    public StringBuilder utility(StringBuilder str) {
        StringBuilder tempSb = new StringBuilder("");
        int lim = str.length();
        for (int i = 0; i<lim; i++) {
            tempSb.append(str.deleteCharAt(str.length()-1));
        }
        return tempSb;
    }
}
