public class NumberComplement {
 /*
     * Given a positive integer num, output its complement number. The complement
     * strategy is to flip the bits of its binary representation.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: num = 5 Output: 2 Explanation: The binary representation of 5 is 101
     * (no leading zero bits), and its complement is 010. So you need to output 2.
     * 
     * Example 2:
     * 
     * Input: num = 1 Output: 0 Explanation: The binary representation of 1 is 1 (no
     * leading zero bits), and its complement is 0. So you need to output 0.
     * 
     */
    
    public static int findComplement(int num) {
        int power = 1, sum = 0;;
        
        while (num > 0) {
            sum += ((num % 2) ^ 1) * power;
            power <<= 1;
            num >>= 1;
        }
        return sum;
    }
    
    /*
    This is what I originally typed.
    public class NumberComplement {

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
    
    public static int findComplement(int num) {
        int power = 0, sum = 0;;
        
        while (num > 0) {
            sum += getComplement(num % 2) * (int) Math.pow(2, power++);
            
            num >>= 1;
        }
        return sum;
    }

    private static int getComplement(int i) {
        return i == 0 ? 1 : 0;
    }
}
    */

}
