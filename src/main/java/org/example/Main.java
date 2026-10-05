package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input time in [s]: ");
        long total_seconds = input.nextLong();

        final long TIME_CONVERSION_CONSTANT = 60;
        final long HOURS_PER_DAY = 24;

        long seconds = total_seconds % TIME_CONVERSION_CONSTANT;
        long total_minutes = total_seconds / TIME_CONVERSION_CONSTANT;
        long minutes = total_minutes % TIME_CONVERSION_CONSTANT;
        long total_hours = total_minutes / TIME_CONVERSION_CONSTANT;
        long hours = total_hours % HOURS_PER_DAY;
        long days = total_hours / HOURS_PER_DAY;

        System.out.println("The converted time is: " + days + "d " + hours + "h " + minutes + "m " + seconds + "s");
        }
    }

