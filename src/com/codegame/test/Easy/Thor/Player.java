package com.codegame.test.Easy.Thor;

/**
 * Created by yaserg555 on 9/20/2015.
 */
import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position
        int thorX=initialTX;
        int thorY=initialTY;
        String directionX ="";

        String directionY ="";
        // game loop
        while (true) {
            directionX = "";
            directionY = "";

            if (thorX > lightX) {
                directionX = "W";
                thorX--;
            } else if (thorX < lightX) {
                directionX = "E";
                thorX++;
            }


            if (thorY > lightY) {
                directionY = "N";
                thorY--;
            } else if (thorY < lightY) {
                directionY = "S";
                thorY++;
            }

            int remainingTurns = in.nextInt();

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(directionY+directionX); // A single line providing the move to be made: N NE E SE S SW W or NW
        }
    }
}