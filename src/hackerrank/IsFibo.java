package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IsFibo {
    public static void main(String[] args) {
        long maxN = 10000000000L;
        ArrayList<Long> fibs = new ArrayList<Long>(10);

        long f0 = 0;
        long f1 = 1;
        long sum;
        fibs.add(f0);
        fibs.add(f1);
        while(f1 <= maxN){
            sum = f0 + f1;
            fibs.add(sum);
            f0 = f1;
            f1 = sum;
        }

        //System.out.println(Arrays.toString(fibs.toArray()));


        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; ++i){
            long N = in.nextLong();
            boolean found = false;
            for(int j = 0; j < fibs.size(); ++j){
                if(fibs.get(j) == N){
                    found = true;
                    System.out.println("IsFibo");
                    break;
                }
            }
            if(!found)
                System.out.println("IsNotFibo");
        }
    }
}
