import java.io.IOException;
import java.util.Scanner;

/**
 * Created by HelenHan on 3/6/20.
 */
public class Solution {
    public static boolean solve(int B, Scanner input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= B; i++) {
            System.out.println(i);
            String s = input.next();
            if (s.equals("N")) {
                return false;
            } else  {
                sb.append(s);
            }
        }
        System.out.println(sb.toString());
        String response = input.next();
        return true;
    }

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int B = input.nextInt();

        for (int j = 1; j <= T; j++) {
            boolean result = solve(B, input);
            if (result) continue;
            else break;
        }
        input.close();

    }
}
