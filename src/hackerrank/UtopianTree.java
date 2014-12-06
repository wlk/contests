package hackerrank;

import java.util.Scanner;


public class UtopianTree {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; ++i){
            int N = in.nextInt();
            System.out.println(heightAfterCycles(N));
        }


    }

    public static int heightAfterCycles(int n){
        int height = 1;
        for(int i = 1; i <= n; ++i){
            if(i%2 == 0){
                ++height;
            }
            else{
                height = height*2;
            }
        }
        return height;
    }
}
