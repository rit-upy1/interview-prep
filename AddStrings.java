package Strings;

/*
Adds two Strings. 
For eg if s1 = "305" and s2 = "43", 
the output is going to be 348 in string format. 
*/
public class AddStrings {
    public static void main(String[] args) {
        
    }

    public String addStrings(String s1, String s2) {
        // if(s1.equals("0")){
        // return s2;
        // }
        // else if(s2.equals("0")){
        // return s1;
        // }
        StringBuilder answer = new StringBuilder();
        int carry = 0;
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        for (; i >= 0 || j >= 0;) {
            int sum = carry;
            if (i >= 0) {
                sum += s1.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += s2.charAt(j--) - '0';
            }
            carry = sum / 10;
            answer.insert(0, sum % 10);
        }
        if (carry != 0) {
            answer.insert(0, carry);
        }
        return answer.toString();
    }
}