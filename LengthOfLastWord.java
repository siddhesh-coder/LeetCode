public class LengthOfLastWord {
    static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndex;
    }
    public static void main(String[] args) {
         String s = "   fly me   to   the moon  ";
         int ans = lengthOfLastWord(s);
        System.out.println(ans);
    }
}
