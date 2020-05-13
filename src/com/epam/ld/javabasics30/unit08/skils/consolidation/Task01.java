package com.epam.ld.javabasics30.unit08.skils.consolidation;

import com.epam.ld.javabasics30.unit08.skils.consolidation.task01.Counter;

public class Task01 {

    public static void main(String[] args) {
        System.out.println("Counter: range[-1; 3], initial value 0(default):");
        Counter cnt = new Counter(-1, 3);
        System.out.println("State is " + cnt.getState());
        for (int i = 0; i < 5; i++) {
            System.out.print("Do Increment: State is ");
            cnt.inc();
            System.out.println(cnt.getState());
        }
        for (int i = 0; i < 7; i++) {
            System.out.print("Do Decrement: State is ");
            cnt.dec();
            System.out.println(cnt.getState());
        }
        System.out.println("Counter: range[-1; 3], initial value 2:");
        cnt = new Counter(-1, 3, 2);
        System.out.println("State is " + cnt.getState());
        for (int i = 0; i < 5; i++) {
            System.out.print("Do Increment: State is ");
            cnt.inc();
            System.out.println(cnt.getState());
        }
        for (int i = 0; i < 7; i++) {
            System.out.print("Do Decrement: State is ");
            cnt.dec();
            System.out.println(cnt.getState());
        }
    }
}
