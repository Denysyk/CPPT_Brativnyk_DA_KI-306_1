package org.example;

import java.io.*;

public class DogApp {
    public static void main(String[] args) throws FileNotFoundException {
        // Створення об'єкту собаки
        Dog myDog = new Dog("Рекс", 3, "Лабрадор", false);
        // Виведення інформації про собаку
        myDog.displayInfo();
        // Зміна імені та віку собаки
        myDog.setName("Бакс");
        myDog.setAge(5);
        // Виведення інформації про собаку
        myDog.displayInfo();
        // Навчання собаки
        myDog.train();

        // Виведення інформації про собаку
        myDog.displayInfo();
        // Закриття файлу журналу
        myDog.closeLogFile();
    }
}
