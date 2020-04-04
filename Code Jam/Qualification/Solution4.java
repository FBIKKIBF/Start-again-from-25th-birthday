import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by HelenHan on 3/6/20.
 * do not know how to do the interactive work, and how to design the algo
 */
public class Solution {


    public static String solve() {
        return "";
    }


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] t = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int T = Integer.parseInt(t[0]);
        int B = Integer.parseInt(t[1]);

        for (int j = 1; j <= T; j++) {
            char c = (char) bufferedReader.read();
            String answer = solve();
            System.out.println(answer);
        }

        bufferedReader.close();
    }
}

