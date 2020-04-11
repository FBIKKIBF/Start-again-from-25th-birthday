import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by HelenHan on 3/6/20.
 */
public class Solution {

    public static int solve(int[][] matrix, int R, int C) {
        return 1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] t = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int T = Integer.parseInt(t[0]);

        for (int j = 1; j <= T; j++) {
            String[] n = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            int R = Integer.parseInt(n[0]);
            int C = Integer.parseInt(n[1]);

            int[][] matrix = new int[R][C];
            for (int r = 0; r < R; r++) {
                String[] Items = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                for (int c = 0; c < C; c++) {
                    int temp = Integer.parseInt(Items[c]);
                    matrix[r][c] = temp;
                }
            }

            int res = solve(matrix, R,C);
            System.out.println("Case #" + j + ": " + res);
        }

        bufferedReader.close();
    }
}
