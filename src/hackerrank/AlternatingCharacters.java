package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        for(int i = 0; i < T; ++i){

            int deletes = 0;

            StringBuilder line = new StringBuilder(in.nextLine());
            for(int j = 0; j < line.length()-1; ++j){
                if(line.charAt(j) == line.charAt(j+1)){
                    ++deletes;
                    //line.deleteCharAt(j+1);
                }
            }


            System.out.println(deletes);
        }
    }
}
