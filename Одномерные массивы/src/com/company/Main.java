package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] products = new String[]{"Хлеб", "Яблоки", "Молоко"};
        int[] prices = new int[]{100, 200, 300};
        System.out.println("Список продуктов возможных для покупки");
        int i = 0;
        for (i=0;i<products.length;++i) {
            System.out.println((i+1)+". "+products[i]+" - "+prices[i]+" руб.");
        }

        System.out.println("Выберите товар и количество или введите `end`");
        Scanner scanner = new Scanner(System.in);
        String input = "";

        int [] sumProducts = new int [3];
        int productNumber = 0;
        int productCount = 0;

        while (true) {
            input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            try {
                String[] words = input.split("\\s");
                productNumber = Integer.parseInt(words[0]);
                productCount = Integer.parseInt(words[1]);
            }   catch (NumberFormatException e) {
                productCount = 0;
                System.out.println("Введите целое число");
            }

            sumProducts [productNumber-1] = sumProducts [productNumber-1] + productCount ;

        }

        System.out.println("Ваша корзина:");
        System.out.println("Наименование товара   Количество  Цена/за.ед  Общая стоимость");
        for (i=0;i<sumProducts.length;++i) {
            if (sumProducts[i]!=0) {
                System.out.print(products[i]);
                System.out.print(" - ");
                System.out.println(sumProducts[i]*prices[i]);
                //System.out.printf("%s %18d %14d %12d%n",products[i],sumProducts[i],prices[i],(sumProducts[i]*prices[i]));
            }
        }


    }
}
