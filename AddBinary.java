/*Given two binary strings a and b, return their sum as a binary string.



        Example 1:

        Input: a = "11", b = "1"
        Output: "100"
        Example 2:

        Input: a = "1010", b = "1011"
        Output: "10101"


        Constraints:

        1 <= a.length, b.length <= 104
        a and b consist only of '0' or '1' characters.
        Each string does not contain leading zeros except for the zero itself.*/

public class AddBinary {
    public String addBinary(String a,String b){
        String result = "";
        int alen = a.length();
        int blen = b.length();
        int carry = 0;
        int i = 0;
        while(i<alen||i<blen||carry!=0){
            int x = 0;
            if(i<alen&&a.charAt(alen-1-i)=='1') x = 1;
            int y = 0;
            if(i<blen&&b.charAt(blen-1-i)=='1') y = 1;
            result = (x+y+carry)%2+result;
            carry = (x+y+carry)/2;
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        AddBinary store = new AddBinary();
           String a = "11";
           String b = "1";
           String ans = store.addBinary(a,b);
        System.out.println(ans);
    }
}
