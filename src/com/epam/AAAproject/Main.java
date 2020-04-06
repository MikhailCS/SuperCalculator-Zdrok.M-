package com.epam.AAAproject;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {



        MainFunctions mainFunctions = new MainFunctions();
        ProgrammingFunctions programmingFunctions = new ProgrammingFunctions();
        Scanner scanner = new Scanner(System.in);
while(true){ // ничего лучше я не придумал
    System.out.println("Введите два желаемых значения и нужную операцию\n(+, -, *, /, sin, cos)");
    double value1 = scanner.nextDouble();
    double value2 = scanner.nextDouble();
    String operation = scanner.next();

switch (operation) {
    case "+":
        System.out.println(mainFunctions.sum(value1,value2));
        break;

    case "-":
        System.out.println(mainFunctions.sub(value1,value2));
        break;

    case "*":
        System.out.println(mainFunctions.mul(value1,value2));
        break;

    case "/":
        System.out.println(mainFunctions.sum(value1,value2));
        break;

    case "sin":
        System.out.println(mainFunctions.sin(value1));
        break;

    case "cos":
        System.out.println(mainFunctions.cos(value1));
        break;

    default:
        programmingFunctions.customButton();
        break;
}
        }


    }
}
