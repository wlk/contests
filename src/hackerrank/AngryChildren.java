package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//TODO: doesn't work
//https://www.hackerrank.com/challenges/angry-children
public class AngryChildren {
    public static int getUnfairness(List<Integer> l){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(Integer elem: l){
            if(elem < min){
                min = elem;
            }
            if(elem > max){
                max = elem;
            }
        }

        return max-min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        ArrayList<Integer> X = new ArrayList<>(N);

        for(int i = 0; i < N; ++i){
            X.add(in.nextInt());
        }

        Collections.sort(X);

        System.out.println(Arrays.toString(X.toArray()));

        LinkedList<Integer> sublist = new LinkedList<>();

        for(int i = 0; i < K; ++i){
            sublist.addLast(X.get(i));
        }

        int min = getUnfairness(sublist);
        System.out.print(Arrays.toString(sublist.toArray()));    System.out.println("--->" + min);
        for(int i = K; i < N-K; ++i){
            sublist.removeFirst();
            sublist.addLast(X.get(i));
            int uf = getUnfairness(sublist);
            System.out.print(Arrays.toString(sublist.toArray()));    System.out.println("--->" + uf);
            if(uf < min){
                min = uf;

            }
        }
        System.out.println(min);
    }
}
