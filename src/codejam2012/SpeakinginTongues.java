package codejam2012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class SpeakinginTongues {

    private static HashMap<String, String> m = new HashMap<String, String>();

    private static void createMapping(){
        String s1 = "zqejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
        String t1 = "qzour language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";

        String[] ss1 = s1.split("");
        String[] tt1 = t1.split("");

        for(int i = 0; i < ss1.length; ++i){
            m.put(ss1[i], tt1[i]);
        }
    }

    public static void main(String args[]) {

        createMapping();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            int t =  Integer.parseInt(in.readLine());

            for (int i = 0; i < t; ++i){


                String line  = in.readLine();
                String lineArr[] = line.split("");

                StringBuffer sb = new StringBuffer();

                for(int j = 0; j < lineArr.length; ++j){
                    sb.append(m.get(lineArr[j]));
                }

                System.out.println("Case #" + (i + 1) + ": " + sb.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
