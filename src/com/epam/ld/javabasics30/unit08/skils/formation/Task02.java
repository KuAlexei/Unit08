package com.epam.ld.javabasics30.unit08.skils.formation;

import com.epam.ld.javabasics30.unit08.skils.formation.task02.Fraction;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = readNaturalNumberFromConsole(sc, "Введите количество дробей: ");

        Fraction[] fractions = new Fraction[k];
        for (int i = 0; i < k; i++) {
            System.out.println("Введите дробь №" + i);
            fractions[i] = new Fraction(
                    readIntFromConsole(sc, "Введите числитель: "),
                    readIntFromConsole(sc, "Введите знаменатель: "));
        }

        System.out.println("\nВывод дробей:");
        for (Fraction f : fractions) {
            System.out.println(f.asString());
        }
    }

    public static int readIntFromConsole(Scanner sc, String message) {
        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }

    public static int readNaturalNumberFromConsole(Scanner sc, String message) {
        int n = 0;
        do {
            n = readIntFromConsole(sc, message);
        } while (n <= 0);
        return n;
    }

}
