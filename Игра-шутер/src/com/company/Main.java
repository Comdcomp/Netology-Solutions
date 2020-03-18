package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;

        // TODO главный цикл игры:
        // запрашивать номер с клавиатуры
        // с помощью scanner.nextInt(),
        // пока не будет введено -1

        while (true) {
            slot = scanner.nextInt();
            if (slot == -1) break;
            try {
                player.shotWithWeapon(slot);
            }  catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            System.out.println("Следующий выстрел:");

        }

        System.out.println("Game over!");

    }
}
