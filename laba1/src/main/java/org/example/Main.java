package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int today_year = 2026;
        int date_of_birth;

        System.out.print("введите вашу дату рождения: ");
        Scanner in = new Scanner(System.in);
        date_of_birth = in.nextInt();

        if (date_of_birth > today_year) {
            System.out.println("ошибка в дате рождения!");
        }

        int age = today_year - date_of_birth;

        if (age < 18) {
            System.out.println("вы несовершеннолетний");
        }
        else if (age >= 65) {
            System.out.println("вы пенсионер");
        }
        else {
            System.out.println("вы взрослый");
        }
    }
}