package codejam.africa2010;

import com.sun.deploy.util.ArrayUtil;
import com.sun.deploy.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ReverseWords {
    public static void main(String args[]) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n =  Integer.parseInt(in.readLine());

            for (int i = 0; i < n; ++i){

                String line  = in.readLine();
                String[] stringItems = line.split(" ");

                List<String> arraylist =        Arrays.asList(stringItems);
                Collections.reverse(arraylist);
                String output = StringUtils.join(arraylist, " ");

                System.out.println("Case #" + (i+1) + ": " + output);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
