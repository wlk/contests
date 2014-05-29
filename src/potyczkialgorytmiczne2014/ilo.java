import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ilo {
    public static long t;
    public static int MAX_FIB = 92;
    public static long[] fibs = new long[MAX_FIB];

    public static void main(String[] args){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            long t = Long.parseLong(in.readLine());
            long[] n = new long[(int)t];
            long maxN = n[0];

            for(int i = 0; i < t; ++i){
                n[i] =  Long.parseLong(in.readLine());
            }

            //find largest fib number
            for (int i = 0; i < t; ++i){
                if(n[i] >= maxN){
                    maxN = n[i];
                }
            }

            //calculate fib up to maxN and put it in array
            fibs[0] = 0;
            fibs[1] = 1;
            for(int i = 2; i < MAX_FIB; ++i){
                fibs[i] = fibs[i-2] + fibs[i-1];
            }

            for(int i = 0; i < t; ++i){

                boolean breakout = false;
                for(int j = 0; j < MAX_FIB; ++j){
                    for(int k = j; k < MAX_FIB; ++k){
                        if(n[i] == fibs[j] * fibs[k]){
                            System.out.println("TAK");
                            breakout = true;
                            break;
                        }
                    }
                    if(breakout) break;
                }
                if(!breakout) {
                    System.out.println("NIE");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}