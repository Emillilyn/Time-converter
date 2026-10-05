package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input time in [s]: ");
        double input_seconds = input.nextDouble();
        final double TIME_CONVERSION_CONSTANT = 60;

        double day;
        double hours;
        double minutes;
        double spare_seconds;

        minutes = input_seconds/TIME_CONVERSION_CONSTANT;
        hours = minutes/TIME_CONVERSION_CONSTANT;
        day = hours/TIME_CONVERSION_CONSTANT;
        spare_seconds = input_seconds/TIME_CONVERSION_CONSTANT;

        System.out.println("The converted time is: " + day + "d " + hours + "h " + minutes + "m " + spare_seconds + "s");
        }
    }

