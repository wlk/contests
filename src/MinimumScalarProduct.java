import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class MinimumScalarProduct {
    public static void main(String args[]) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            int t =  Integer.parseInt(in.readLine());

            for (int i = 0; i < t; ++i){
                int n =  Integer.parseInt(in.readLine());

                String line  = in.readLine();
                String[] v1s = line.split(" ");
                line  = in.readLine();
                String[] v2s = line.split(" ");


                ArrayList<Long> v1 = new ArrayList<Long>();
                ArrayList<Long> v2 = new ArrayList<Long>();

                for(int j = 0; j< n; ++j){
                    v1.add(Long.parseLong(v1s[j]));
                    v2.add(Long.parseLong(v2s[j]));
                }
                Collections.sort(v1);
                Collections.sort(v2, new Comparator<Long>() {
                    @Override
                    public int compare(Long i1, Long i2) {
                        return (int) (i2-i1);
                    }
                })  ;

                long sum = 0;
                for(int j = 0; j < v1.size(); ++j){
                    sum += (v1.get(j) * v2.get(j));
                }



                System.out.println("Case #" + (i + 1) + ": " + sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
