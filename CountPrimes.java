package Arrays;

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(5));
    }
    
    public static int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n];
        for (int i = 2; i * i < notPrimes.length; ++i) {
            if (!notPrimes[i]) {
                for (int j = i; j * i < notPrimes.length; ++j) {
                    notPrimes[i * j] = true;
                }
            }
        }
        int primesCount = 0;
        for (int i = 2; i < notPrimes.length; ++i) {
            if (!notPrimes[i]) {
                primesCount++;
            }
        }
        return primesCount;
    }
}