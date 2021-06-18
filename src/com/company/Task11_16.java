package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task11_16 {
    public static void main(String[] args) {
        Random random = new Random();
        int N = 10;
        int elementMass[] = new int[N];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            elementMass[i] = random.nextInt(100);
        }

        for (int i = 0; i < N; i++) {
            System.out.printf("%d-%d\n", i, elementMass[i]);
        }
        System.out.println();

        int inputNumberS;
        System.out.println("Введите число S: ");
        inputNumberS = input.nextInt();

        if (elementMass[inputNumberS] > 0) {
            System.out.println(elementMass[inputNumberS] + " - положительное число ");
        } else {
            System.out.println(elementMass[inputNumberS] + " - отрицательное число ");
        }

        int inputNumberK;
        System.out.println("Введите число K: ");
        inputNumberK = input.nextInt();

        if (elementMass[inputNumberK] % 2 == 0) {
            System.out.println(elementMass[inputNumberK] + " - четное число ");
        } else {
            System.out.println(elementMass[inputNumberK] + " - нечетное число ");
        }

        System.out.printf("%d-%d\n",elementMass[inputNumberS], elementMass[inputNumberK]);

        int numberS;
        int numberK;

        numberS = elementMass[inputNumberS];
        numberK = elementMass[inputNumberK];

        if (numberS > numberK) {
            System.out.print("S > K");
        }
        else if(numberS < numberK){
            System.out.print("K > s");
        }
    }
}