package com.codegame.test.Easy.Temperatures;

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
        int n = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526

        Scanner scanner = new Scanner(temps);

        // find the next int token and print it
        // loop for the whole scanner

        Boolean error=false;
        if(temps.isEmpty()) error=true;
        int minimumTemp=Integer.MAX_VALUE;
        while (scanner.hasNext()) {

            // if the next is a int, print found and the int
            if (scanner.hasNextInt()) {
                int temperature = scanner.nextInt();
                if (Math.abs(minimumTemp) > Math.abs(temperature)) minimumTemp = temperature;
                else if ((Math.abs(minimumTemp) == Math.abs(temperature)) && minimumTemp < temperature)
                    minimumTemp = temperature;
            } else// if no int is found, print "Not Found:" and the token
                error = true;
        }
        if (error) System.out.println(0); else
        System.out.println(minimumTemp);
        // close the scanner
        scanner.close();
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

    }
}