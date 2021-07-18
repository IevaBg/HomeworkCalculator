package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Please  write the first number!");
        int num1 = myScan.nextInt();
        System.out.println("Please  write the second number!");
        int num2 = myScan.nextInt();
        System.out.println("Please  write the operator!");
        String myString = myScan.next();
        char userOption = myString.charAt(0);


        //int num1 = 10;
        //int num2 = 12;
        //char userOption = '+';

        switch (userOption) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            case 'p':
                System.out.println(num1 + " " + num2);
                break;
            case 'b':
                if (num1 >num2) {
                    System.out.println(num1 + " is bigger than " + num2);
                }
                else if (num2 > num1) {
                    System.out.println(num2 + " is bigger than " + num1);
                }
                else {
                    System.out.println(num1 + " is equal " + num2);
                }
                break;
            case 's':
                if (num1 >num2) {
                    System.out.println(num2 + " is smaller than " + num1);
                }
                else if (num2 > num1) {
                    System.out.println(num1 + " is smaller than " + num2);
                }
                else {
                    System.out.println(num1 + " is equal " + num2);
                }
                break;
        }
    }
}

/**
 Write a program to do multiple calculation options with two numbers:

 ●      Create two numerical variables with initial values.
 ●      Create an char type variable which represents the user option (please use the switch control):

 a.      ‘+’ sum both elements;
 b.     ’-’: do subtraction;
 c.      ’/’: do dividing;
 d.     ‘*’: do multiplication;
 e.      ‘%’: get remainder when the first element is divided by the second element;
 f.      ‘p’: print out both elements;
 g.     ‘b’: verify which element is bigger;
 h.     ‘s’:verify which element is smaller;

 ●      * additionally - please do add the possibility to write both variable values and the option in the console. Read, verify and do an algorithm
 * */