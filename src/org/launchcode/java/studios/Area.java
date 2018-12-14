package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);
        System.out.println("Enter the radius:");
        Double r = radius.nextDouble();
        Double area = 3.14 * r * r;
        System.out.println(area);
    }
}