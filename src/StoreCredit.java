import com.sun.deploy.util.ArrayUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StoreCredit {

    public static void main(String args[]) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n =  Integer.parseInt(in.readLine());

            for (int i = 0; i < n; ++i){
                int c =  Integer.parseInt(in.readLine());
                int itemsCount =  Integer.parseInt(in.readLine());

                String line  = in.readLine();
                String[] stringItems = line.split(" ");
                int[] items = new int[itemsCount];
                for(int j = 0; j< itemsCount; ++j){
                   items[j] = Integer.parseInt(stringItems[j]);
                }


                int max1 = 0;
                int max2 = 1;

                for(int j = 0; j < itemsCount; ++j){
                    for(int k = j+1; k < itemsCount; ++k){
                        if(items[j] + items[k] == c) {
                            max1 = j;
                            max2 = k;
                            //System.out.println("update max1 na " + j + " max2 na : " + k + "val: " + sortedItems[j] + " val2: " + sortedItems[k] );

                        }
                    }
                }
                ++max1; ++max2;
                System.out.println("Case #" + (i+1) + ": "  + max1 + " " + max2);
                //System.out.println(items[max1-1] + " "  + items[max2-1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}