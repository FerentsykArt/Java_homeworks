import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        //создаем массив для номинала карт
        String[] ranks = {
                "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"
        };


        // создаем массив для мастей карт
        String[] suits = {"Пик", "Треф", "Бубен", "Червей"};

        // вводим количество карт для игрока с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество карт которое хотите получить.");
        int userInput = scanner.nextInt();


        for (int i = 0; i < ranks.length && i < suits.length; i++) {
            // выводим на экран карты


        }
        Random el = new Random(i);
        String el1 = suits[i];
        String el2 = ranks[i];
        System.out.println("Вот Ваши" + userInput + "карт " + el1 + el2);

    }
}














