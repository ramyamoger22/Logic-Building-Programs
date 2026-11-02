import java.util.Scanner;

public class prgrm50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        String prefix = strs[0];

        for (int i = 1; i < n; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    System.out.println("");
                    sc.close();
                    return;
                }
            }
        }

        System.out.println(prefix);
        sc.close();
    }
}
