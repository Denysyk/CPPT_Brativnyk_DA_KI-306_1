package org.example;

import java.io.*;
import java.util.*;

public class Lab1 {
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();

        int nSubArrays = (int) Math.ceil((double) nRows / 2.0); // Кількість підмасивів

        arr = new char[nSubArrays][];
        int numElements = nRows;
        for (int i = 0; i < nSubArrays; i++) {
            arr[i] = new char[numElements];
            numElements -= 2;
            if (numElements < 1) {
                numElements = 1;
            }
        }

        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();

        int leadingSpaces = 0; // Змінна для визначення кількості пробілів перед символом

        exit:
        for (int i = 0; i < nSubArrays; i++) {
            // Додаємо пробіли перед підмасивом
            for (int k = 0; k < leadingSpaces; k++) {
                System.out.print(" ");
                fout.print(" ");
            }

            for (int j = 0; j < arr[i].length; j++) {
                if (filler.length() == 1) {
                    arr[i][j] = (char) filler.codePointAt(0);
                    System.out.print(arr[i][j] + " ");
                    fout.print(arr[i][j] + " ");
                } else if (filler.length() == 0) {
                    System.out.print("\nНе введено символ заповнювач");
                    break exit;
                } else {
                    System.out.print("\nЗабагато символів заповнювачів");
                    break exit;
                }
            }
            System.out.print("\n");
            fout.print("\n");

            leadingSpaces += 2; // Збільшуємо кількість пробілів перед наступним підмасивом
        }
        //System.out.println("Останній елемент масиву: " + arr[nSubArrays - 1][arr[nSubArrays - 1].length - 1]);
        fout.flush();
        fout.close();
    }
}
