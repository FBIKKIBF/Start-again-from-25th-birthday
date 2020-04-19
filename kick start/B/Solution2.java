import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by HelenHan on 3/6/20.
 */
public class Solution {

    public static int solve(int[] array, int N, int D) {
        if (array == null || array.length < 3) return 0;
        int min = D;
        int res = D;
        for (int i = array.length - 1; i >=0; i--) {
            int k = min/array[i];
            min = k*array[i];
            res = Math.min(min,res);
        }
        return res;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] t = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int T = Integer.parseInt(t[0]);

        for (int j = 1; j <= T; j++) {
            String[] n = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            int N = Integer.parseInt(n[0]);
            int D = Integer.parseInt(n[1]);
            int[] array = new int[N];
            String[] Items = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            for (int i = 0; i < N; i++) {
                int temp = Integer.parseInt(Items[i]);
                array[i] = temp;
            }
            int res = solve(array, N, D);
            System.out.println("Case #" + j + ": " + res);
        }

        bufferedReader.close();
    }
}
