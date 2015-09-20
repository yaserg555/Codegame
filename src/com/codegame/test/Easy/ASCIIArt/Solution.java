

/**
 * Created by yaserg555 on 9/20/2015.
 */
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        in.nextLine();
        int h = in.nextInt();
        in.nextLine();
        String t = in.nextLine();
        t=t.toUpperCase();
        String answer="";
        int codeA=65;
        for (int i = 0; i < h; i++) {
            String rOW = in.nextLine();
            for (char ch: t.toCharArray()) {
                int code = ((int) ch) - codeA;
               if(code<=25&&code>=0)
                answer+=rOW.substring(code*l,code*l+l);
                
                else answer+=rOW.substring(26*l);
                  // answer+=" ";
                
            }
            answer+="\n";
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.print(answer);
    }
}