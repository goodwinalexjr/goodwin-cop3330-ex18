package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //inputs
        Scanner numbers = new Scanner(System.in);
        System.out.println("Press 1 to convert from Fahrenheit to Celsius.");
        System.out.println("Press 2 to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        String input = numbers.nextLine();
        if(!input.matches("[1-2]")){
            while(!input.matches("[1-2]")){
                System.out.println("Invalid number");
                System.out.print("Your choice: ");
                input = numbers.nextLine();
            }
        }

        //int and Strings
        String Fer = "";
        String Cel = "";
        int temperature = 0;
        int inputs = Integer.parseInt(input);

        //if statement for what is done
        if(inputs == 1){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            String Fahrenheit = numbers.nextLine();
            int F = Integer.parseInt(Fahrenheit);
            temperature = (F - 32) * (5/9);
            Cel = "Celsius";

        }
        else{
            System.out.print("Please enter the temperature in Celsius: ");
            String Celsius = numbers.nextLine();
            int C = Integer.parseInt(Celsius);
            temperature = (C * (9/5)) + 32;
            Fer = "Fahrenheit";
        }
        System.out.println("Th temperature in " + Cel + Fer + " is " + temperature + ".");
    }
}
