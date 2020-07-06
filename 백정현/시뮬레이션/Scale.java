import java.io.*;
import java.util.*;

class Scale {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] weight = new int[N];

        for (int i=0; i<N; i++) {
            weight[i] = scanner.nextInt();
            }

        Arrays.sort(weight);

        int sum = 0;
        for (int i=0; i<N; i++) {
            if (sum + 1 < weight[i]) {
                break;
            }

            sum += weight[i];
        }

        System.out.println(sum + 1);
    }
}