package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task11_19 {

    public static void main(String[] args) {
        int N = 10;
        int mas[] = new int[N];

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            mas[i] = random.nextInt(20);
            System.out.print(mas[i] + " ");
        }

// TODO: 18.06.2021 сумма  
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += mas[i];
        }

// TODO: 18.06.2021 произведение 
        int multiplication = 1;
        for (int i = 0; i < N; i++) {
            multiplication *= mas[i];
        }

// TODO: 18.06.2021 сумма квадратов 
        int sumSquare = 0;
        for (int i = 0; i < N; i++) {
            sumSquare += (int) Math.pow(mas[i], 2);
        }

// TODO: 18.06.2021 сумма первых 6 элементов 
        int sumOf6Elements = 0;
        for (int i = 0; i < N; i++) {
            sumOf6Elements = mas[0] + mas[1] + mas[2] + mas[3] + mas[4] + mas[5];
        }

// TODO: 18.06.2021 среднее арифметическое
        int avg = (int) (sum / (double) N);

        System.out.println();
        System.out.println("sum = " + sum);
        System.out.println("multiplication = " + multiplication);
        System.out.println("sumSquare = " + sumSquare);
        System.out.println("sumOf6Elements = " + sumOf6Elements);
        System.out.println("avg = " + avg);
    }
}