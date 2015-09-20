package com.codegame.test.Easy.ChuckNorris;

/**
 * Created by yaserg555 on 9/20/2015.
 */


import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String mESSAGE = in.nextLine();
        String binary="";
        for (char ch: mESSAGE.toCharArray()) {
            int code = ((int) ch);
           String binChar=Integer.toBinaryString((int)ch);
            if(binChar.length()<7) binChar="0"+binChar;
            binary+=binChar;
        }

         binary = binary.replace ("10","1 00 0");

         binary =  binary.replace ("01","0 0 1");
        if(binary.charAt(0)=='1') binary="0 " + binary; else binary="00 " + binary;

        binary =  binary.replace ("1","0");
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");


        System.out.println(binary);
    }
}