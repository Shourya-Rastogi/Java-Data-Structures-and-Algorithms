package Strings.BasicAndEasy;

public class RotateString {
    static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);

    }
}
