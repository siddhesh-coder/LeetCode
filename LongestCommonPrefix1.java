
import java.util.Arrays;

public class LongestCommonPrefix1{
    static String longestCommonPrefix(String[] strs) {
    StringBuilder result = new StringBuilder();
    Arrays.sort(strs);
    char[] first = strs[0].toCharArray();
    char[] lasr = strs[strs.length-1].toCharArray();

    for(int i=0;i<first.length;i++){
        if(first[i]!=lasr[i]){
            break;
        }
        result.append(first[i]);
    }
    return result.toString();
  }

    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"};
       String ans = longestCommonPrefix(strs);
        System.out.println(ans);
    }
}
