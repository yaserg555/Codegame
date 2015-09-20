package com.codegame.test.Easy.OnboardingTutorial;

import java.util.*;
import java.io.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) throws IOException {


        // game loop
        while (true) {
            Scanner in = new Scanner(System.in);
            String nextName  = "";
            int nextDist=0;
            List<Enemy> enemies = new ArrayList<Enemy>();

            nextName=in.next();
            nextDist = in.nextInt();
                enemies.add(new Enemy(nextName, nextDist));
            nextName=in.next();
            nextDist = in.nextInt();
            enemies.add(new Enemy(nextName, nextDist));

            Collections.sort(enemies);
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(enemies.iterator().next().getName());
        }
    }
}


class Enemy implements Comparable<Enemy> {
    private final String name;
    private final int range;

    public Enemy(String name, int range) {
        this.name = name;
        this.range = range;
    }

    @Override
    public int compareTo(Enemy right) {
        return this.range < right.range ? -1
                : this.range > right.range ? 1
                : 0;
    }

    public String getName() {
        return name;
    }

    // implement equals and hashCode too
    // if a.compareTo(b) == 0, then a.equals(b) should return true.

}