import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jed {

    private static String repeatAddition(int n) {
        if(n == 1) {
          return "1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < n; ++i) {
            sb.append("1+");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append(")");
        return sb.toString();
    }

    private static String option1(int k) {
        StringBuilder sb = new StringBuilder();

        int onesCounter = 0;
        int j = 2;
        int e = (int)(Math.sqrt(k));
        while (j <= e) {
            while ((k % j) == 0) {
                k /= j;
                e = (int)(Math.sqrt(k));
                sb.append(repeatAddition(j) + "*");
                onesCounter += j;
            }
            j++;
        }
        if (k >= 1) {
            sb.append(repeatAddition(k) + "*");
            onesCounter += k;
        }

        if (onesCounter > 100) {
            return "NIE";
        } else {
            String s = sb.toString();
            String updated = s.endsWith("*") ? s.substring(0, s.length() - 1) : s;
            return updated.endsWith("*1") ? updated.substring(0, updated.length() - 2) : updated;
        }
    }

    private static String repeatAddition2(int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; ++i){
            sb.append("(1+1)*");
        }
        String s = sb.toString();
        return s.endsWith("*") ? s.substring(0, s.length()-1) : s;
    }

    private static String option2(int k) {
        StringBuilder sb = new StringBuilder();
        int onesCounter = 0;
        int j = 0;
        while (k > 0) {
            if (k % 2 != 0) {
                if (j == 0) {
                    sb.append("1+");
                    onesCounter += 1;
                } else {
                    sb.append(repeatAddition2(j) + "+");
                }
            }
            k /= 2;
            ++j;
        }
        if(onesCounter > 100){
            return "NIE";
        } else {
            String s = sb.toString();
            return s.endsWith("+") ? s.substring(0, s.length()-1) : s;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());

        for (int i = 0; i < t; ++i) {

            int k = Integer.parseInt(in.readLine());
            String result1 = option1(k);
            if(result1.equals("NIE")){
                System.out.println(option2(k));
            } else {
                System.out.println(result1);
            }

        }
    }
}