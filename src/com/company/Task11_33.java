package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task11_33 {
    public static void main(String[] args) {
        int N = 10;
        int passingScore = 20;
        int mas[] = new int[N];

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            mas[i] = random.nextInt(5);
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += mas[i];
        }
        System.out.println(sum);

        if (sum >= passingScore) {
            System.out.println(sum + " - Спортсмен вышел в следующий этап соревнований");
        }else {
            System.out.println(sum + " - Спортсмен не вышел в следующий этап соревнований");
        }
    }
}
