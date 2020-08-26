package Arrays;

public class FindOddInt {
    /*
     * Given an array of integers, find the one that appears an odd number of times.
     * 
     * There will always be only one integer that appears an odd number of times.
     * 
     */
    public static void main(String[] args) {
        System.out.println(findIt(new int[] { 1, 1, 1, 3, 3, 4, 4 }));
    }
    // public static int findIt(int[] a) {
    //     Map<Integer, Integer> countMap = new HashMap<>();
    //     for (int i = 0; i < a.length; ++i) {
    //         int key = a[i];
    //         countMap.put(key, countMap.getOrDefault(key, 0) + 1);
    //     }
    //     for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
    //         if (entry.getValue() % 2 != 0) {
    //             return entry.getKey();
    //         }
    //     }
    //     return 0;
    // }
    public static int findIt(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }
}
