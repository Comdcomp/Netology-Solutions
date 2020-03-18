package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];

        Random random = new Random();
        for (int i = 0; i< SIZE; i++) {
            for (int j = 0; j< SIZE; j++) {
                // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
                colors[i][j] = random.nextInt(256);
            }
        }

        for (int i = 0; i< SIZE; i++) {
            for (int j = 0; j< SIZE; j++) {
                // %4d означает, что мы под каждый номер резервируем 4 знака
                // (незанятые будут заполнены пробелами)
                // таким образом, у нас получится ровная таблица
                System.out.format("%4d", colors[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }


        int[][] rotatedColors = new int[SIZE][SIZE];
        int[][] rotatedColors180 = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[i][j] = colors[SIZE - j - 1][i];
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors180[i][j] = rotatedColors[SIZE - j - 1][i];
            }
        }


        System.out.println(""); System.out.println(""); System.out.println("");
        for (int i = 0; i< SIZE; i++) {
            for (int j = 0; j< SIZE; j++) {
                // %4d означает, что мы под каждый номер резервируем 4 знака
                // (незанятые будут заполнены пробелами)
                // таким образом, у нас получится ровная таблица
                System.out.format("%4d", rotatedColors[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }


        System.out.println(""); System.out.println(""); System.out.println("");
        for (int i = 0; i< SIZE; i++) {
            for (int j = 0; j< SIZE; j++) {
                // %4d означает, что мы под каждый номер резервируем 4 знака
                // (незанятые будут заполнены пробелами)
                // таким образом, у нас получится ровная таблица
                System.out.format("%4d", rotatedColors180[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }

    }
}
