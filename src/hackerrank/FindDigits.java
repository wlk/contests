package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; ++i){
            int N = in.nextInt();
            int tmp = N;
            int result = 0;
            while(tmp > 0){
                int div = tmp%10;
                tmp /= 10;
                if(div == 0) continue;
                if(N%div == 0) ++result;
            }
            System.out.println(result);
        }
    }
}
