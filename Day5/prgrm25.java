import java.util.Scanner;
import java.util.HashMap;

public class prgrm25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int smallestValue = Integer.MAX_VALUE;

        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (freq > maxFreq) {
                maxFreq = freq;
                smallestValue = key;
            } else if (freq == maxFreq && key < smallestValue) {
                smallestValue = key;
            }
        }

        System.out.println(smallestValue + " " + maxFreq);
    }
}