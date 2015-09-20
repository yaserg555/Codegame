package com.codegame.test.Optimizations.CodeSize;
import java.util.*;

class Player {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int o = in.nextInt(), t = in.nextInt(), k = in.nextInt(), l = in.nextInt();

        while (true) {

            System.out.println((l > t ? "N" : l < t ? "S" : "") + (k > o ? "W" : k < o ? "E" : ""));
            k += k > o ? -1 : k < o ? 1 : 0;
            l += l > t ? -1 : l < t ? 1 : 0;
        }
    }
}