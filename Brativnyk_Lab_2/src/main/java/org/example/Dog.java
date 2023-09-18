package org.example;

import java.io.*;

/**
 * Клас представляє собою об'єкт собаки.
 */
public class Dog {
    private String name;
    private int age;
    private String breed;
    private boolean isTrained;
    private PrintWriter logFile;

    /**
     * Конструктор з параметрами для створення собаки з вказаними характеристиками.
     *
     * @param name      Ім'я собаки.
     * @param age       Вік собаки.
     * @param breed     Порода собаки.
     * @param isTrained Прапорець, що вказує, чи навчена собака.
     * @throws FileNotFoundException Виникає, якщо не вдається створити файл журналу.
     */
    public Dog(String name, int age, String breed, boolean isTrained) throws FileNotFoundException {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.isTrained = isTrained;
        logFile = new PrintWriter(new File("DogLog.txt"));
    }

    /**
     * Конструктор за замовчуванням для створення собаки з ініціальними значеннями.
     *
     * @throws FileNotFoundException Виникає, якщо не вдається створити файл журналу.
     */
    public Dog() throws FileNotFoundException {
        this.name = "Невідомо";
        this.age = 0;
        this.breed = "Невідома";
        this.isTrained = false;
        logFile = new PrintWriter(new File("DogLog.txt"));
    }

    /**
     * Метод для зміни імені собаки.
     *
     * @param name Нове ім'я собаки.
     */
    public void setName(String name) {
        this.name = name;
        logFile.println("Змінено ім'я собаки на: " + name);
        logFile.flush();
    }

    /**
     * Метод для отримання імені собаки.
     *
     * @return Ім'я собаки.
     */
    public String getName() {
        return name;
    }

    /**
     * Метод для зміни віку собаки.
     *
     * @param age Новий вік собаки.
     */
    public void setAge(int age) {
        this.age = age;
        logFile.println("Змінено вік собаки на: " + age);
        logFile.flush();
    }

    /**
     * Метод для отримання віку собаки.
     *
     * @return Вік собаки.
     */
    public int getAge() {
        return age;
    }

    /**
     * Метод для зміни породи собаки.
     *
     * @param breed Нова порода собаки.
     */
    public void setBreed(String breed) {
        this.breed = breed;
        logFile.println("Змінено породу собаки на: " + breed);
        logFile.flush();
    }

    /**
     * Метод для отримання породи собаки.
     *
     * @return Порода собаки.
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Метод для навчання собаки.
     */
    public void train() {
        isTrained = true;
        logFile.println("Собаку навчено");
        logFile.flush();
    }

    /**
     * Метод для перевірки, чи навчена собака.
     *
     * @return true, якщо собака навчена; false, якщо не навчена.
     */
    public boolean isTrained() {
        return isTrained;
    }

    /**
     * Метод для запису в журнал завершення роботи з файлом.
     */
    public void closeLogFile() {
        logFile.close();
    }

    /**
     * Метод для відображення інформації про собаку.
     */
    public void displayInfo() {
        System.out.println("Ім'я собаки: " + name);
        System.out.println("Вік собаки: " + age);
        System.out.println("Порода собаки: " + breed);
        System.out.println("Навчена: " + (isTrained ? "Так" : "Ні"));
        System.out.print("\n");
    }
}
