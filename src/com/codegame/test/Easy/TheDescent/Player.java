package com.codegame.test.Easy.TheDescent;

/**
 * Created by yaserg555 on 9/20/2015.
 */
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int spaceX = in.nextInt();
            int spaceY = in.nextInt();

            int maxH = 0;
            int iOfMax = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
                if (maxH < mountainH) {
                    iOfMax = i;
                    maxH = mountainH;
                }
            }


            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            if (spaceX == iOfMax) {
                System.out.println("FIRE");
            } else {
                System.out.println("HOLD");
            } // either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).
        }
    }
}