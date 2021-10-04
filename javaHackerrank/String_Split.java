// import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class String_Split {
    public static void main(String[] args) {
        String st = "Aayush Kumar Pandey";

        // M.01.

        // String[] n = st.split(" ");
        // for (String s : n) {
        // System.out.println(s);
        // }

        // M.02.

        // String[] n = st.split("\\s");
        // for (String s : n) {
        // System.out.println(s);
        // }

        // M.03.
        // String[] n = st.split(" ", 3);
        // for (String s : n) {
        // System.out.println(s);
        // }

        // String[] n = st.split(" ");
        // int len = n.length;
        // System.out.println(len);

        // To split string character by character
        String[] n = st.split("");
        for (String s : n) {
            System.out.println(s);
        }
        int len = n.length;
        System.out.println("\nArray length = " + len);
    }
}
