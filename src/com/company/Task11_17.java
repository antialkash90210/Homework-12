package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task11_17 {
    public static void main(String[] args) {
        Random random = new Random();
        int N = 10;
        int elementMass[] = new int[N];
        int A = 2;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            elementMass[i] = random.nextInt(20);
            System.out.printf("%d-%d\n", i, elementMass[i]);
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            elementMass[i] *= 2;
            System.out.printf("%d-%d\n", i, elementMass[i]);
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            elementMass[i] -= A;
            System.out.printf("%d-%d\n", i, elementMass[i]);
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            elementMass[i] /= elementMass[0];
            System.out.printf("%d-%d\n", i, elementMass[i]);
        }
        System.out.println();

    }
}