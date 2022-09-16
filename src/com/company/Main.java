package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        count(userInput());


    }

    static void count(String sentence) {
        String[] opl = sentence.split(" ");
        System.out.println("počet slov je: ");
        System.out.print(opl.length);

    }

    static String userInput() {
        return sc.nextLine();
    }
}
