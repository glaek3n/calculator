package com.kodilla;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Calculator {

    Scanner konsola = new Scanner(System.in);

    int a;
    int b;

    public Calculator(){};

    public void addAtoB() {






        System.out.println("Podaj liczbę a");
        int a = konsola.nextInt();
        System.out.println("Podaj liczbę b");
        int b = konsola.nextInt();
        System.out.println("Wynik dodawania to : " + (a + b));
    }

    public void substractAfromB() {

        System.out.println("Podaj liczbę a");
        int a = konsola.nextInt();
        System.out.println("Podaj liczbę b");
        int b = konsola.nextInt();
        System.out.println("Wynik odejmowania to : " + (a - b));
    }

    public static void main(String[] args) {
        Scanner wybor = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Wybierz operację dodawania (d) lub odejmowania (o)");

        char choice = wybor.next().charAt(0);
        if (choice == 'd') {
            calculator.addAtoB();
        }
        if (choice == 'o') {
            calculator.substractAfromB();
        }
    }
}
