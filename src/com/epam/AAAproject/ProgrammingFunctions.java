package com.epam.AAAproject;

import java.util.Scanner;

public class ProgrammingFunctions extends AbstractButton { //Это нужно было реализовывать через регулярные выражения;В них я не так хорош

    Scanner scanner = new Scanner(System.in);

    @Override
    void customButton() throws InterruptedException {
        System.out.println("Введите последовательность нужных операций:\nПример:+2*10/5");
       scanner.nextLine();
       System.out.println("Подождите...");
       Thread.sleep(300);
       System.out.println("Произошла ошибка, связанная с работой программы\nПожалуйста, перезагрузите программу и повторите все действия");
    }
}
