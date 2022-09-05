package edu.sfsu.cs1.Project4;

import java.util.Scanner;

public class Temp {

    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        System.out.println("First Num:");
        sum += s.nextInt();
        System.out.println("sec Num:");
        sum += s.nextInt();
        System.out.println("Sum is: "+sum);
    }
}
