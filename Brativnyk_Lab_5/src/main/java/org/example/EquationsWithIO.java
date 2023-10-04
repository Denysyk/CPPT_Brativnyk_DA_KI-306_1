package org.example;

import java.io.*;
import java.util.Scanner;

/**
 * Клас EquationsWithIO містить методи для роботи з рівняннями та введенням/виведенням результатів у текстовій та бінарній форматах.
 */
public class EquationsWithIO {
    /**
     * Записує результат обчислення рівняння у текстовий файл.
     *
     * @param fName ім'я файлу, у який записується результат
     * @param x значення для обчислення рівняння
     * @throws FileNotFoundException виникає, якщо файл не знайдено
     */
    public void writeResultTxt(String fName, int x) throws FileNotFoundException {
        PrintWriter f = new PrintWriter(fName);
        Equations eq = new Equations();
        try {
            double result = eq.calculate(x);
            f.printf("%f", result);
        } catch (CalcException ex) {
            f.print(ex.getMessage());
        }
        f.close();
    }

    /**
     * Записує результат обчислення рівняння у бінарний файл.
     *
     * @param fName ім'я файлу, у який записується результат
     * @param x значення для обчислення рівняння
     * @throws IOException виникає, якщо сталася помилка вводу/виводу
     */
    public void writeResultBin(String fName, int x) throws IOException {
        Equations eq = new Equations();
        try (DataOutputStream f = new DataOutputStream(new FileOutputStream(fName))) {
            double result = eq.calculate(x);
            f.writeDouble(result);
        } catch (CalcException ex) {
            System.out.println("Exception reason: " + ex.getMessage());
        }
    }

    /**
     * Читає результат обчислення рівняння з бінарного файлу та виводить його на консоль.
     *
     * @param fName ім'я файлу, з якого читається результат
     * @throws IOException виникає, якщо сталася помилка вводу/виводу
     */
    public void readResultBin(String fName) throws IOException {
        try (DataInputStream f = new DataInputStream(new FileInputStream(fName))) {
            double result = f.readDouble();
            System.out.println("Result from binary file: " + result);
        }
    }

    /**
     * Читає результат обчислення рівняння з текстового файлу та виводить його на консоль.
     *
     * @param fName ім'я файлу, з якого читається результат
     * @throws FileNotFoundException виникає, якщо файл не знайдено
     */
    public void readResultTxt(String fName) throws FileNotFoundException {
        File file = new File(fName);
        if (file.exists()) {
            try (Scanner scanner = new Scanner(file)) {
                if (scanner.hasNextDouble()) {
                    double result = scanner.nextDouble();
                    System.out.println("Result from text file: " + result);
                } else {
                    System.out.println(scanner.nextLine());
                }
            }
        } else {
            throw new FileNotFoundException("File not found: " + fName);
        }
    }

    /**
     * Точка входу у програму. Демонструє використання методів класу EquationsWithIO.
     *
     * @param args аргументи командного рядка
     */
    public static void main(String[] args) {
        EquationsWithIO equationsWithIO = new EquationsWithIO();

        try {
            // Запис результату у текстовий файл
            equationsWithIO.writeResultTxt("result.txt", 90);
            // Запис результату у бінарний файл
            equationsWithIO.writeResultBin("result.bin", 45);
            // Читання результату з бінарного файлу
            equationsWithIO.readResultBin("result.bin");
            // Читання результату з текстового файлу
            equationsWithIO.readResultTxt("result.txt");
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
    }
}
