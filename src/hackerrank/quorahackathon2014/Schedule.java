package hackerrank.quorahackathon2014;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//TODO doesn't work
public class Schedule {
    static class Test implements Comparable<Test>{
        int duration;
        double passProbability;
        public double getValue(){return duration*passProbability;}
        public Test(int duration, double passProbability){
            this.duration = duration;
            this.passProbability = passProbability;
        }

        @Override
        public int compareTo(Test other) {
            if(other.duration > duration) return -1;
            if(other.duration < duration) return 1;

            return 0;
        }

        @Override
        public String toString() {
            return "Test(" + duration +", " + passProbability + ", " + getValue() + ")";
        }
    }

    static ArrayList<Test> T;

    public static double addTest(int i){
        if(i < T.size()-1){
            return T.get(i).duration + (T.get(i).passProbability * addTest(i+1));
        }
        else{
            return T.get(i).duration;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        T = new ArrayList<>(N);

        for(int i = 0; i < N; ++i){
            Test t = new Test(in.nextInt(), in.nextDouble());
            if(t.passProbability >= 1.0) continue;
            if(t.passProbability <= 0.0) {
                System.out.println("0.0");
                return;
            }
            T.add(t);
        }

        Collections.sort(T);

        System.out.println(Arrays.toString(T.toArray()));

        double result = addTest(0);

        System.out.println(result);
    }
}
