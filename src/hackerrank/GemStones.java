package hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GemStones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int result = 0;
        in.nextLine();
        HashMap<Character, Integer> mapping = new HashMap<>();

        for(int i = 0; i < N; i++){
            String line = in.nextLine();
            Set<Character> uniqueLine = new HashSet<>();

            for(Character c : line.toCharArray()) {
                uniqueLine.add(c);
            }

            for(Character c : uniqueLine) {
                if(mapping.containsKey(c)){
                    int value = mapping.get(c);
                    mapping.put(c, value+1);
                }
                else{
                    mapping.put(c, 1);
                }
            }
        }

        for(Character c: mapping.keySet()){
            if(mapping.get(c) == N){
                ++result;
            }
        }

        System.out.println(result);
    }
}
