package org.example;

import org.example.ResearchDog;

import java.io.FileNotFoundException;
/**
 * Проста програма для демонстрації використання класу ResearchDog.
 */
public class DogApp {
    public static void main(String[] args) throws FileNotFoundException {
        // Створення об'єкту ResearchDog для дослідження
        ResearchDog myResearchDog = new ResearchDog("Рекс", 3, "Лабрадор", false);

        // Виведення інформації про собаку
        myResearchDog.displayInfo();

        // Проведення експерименту та збір даних
        myResearchDog.observeBehavior();
        myResearchDog.analyzeData();
        myResearchDog.performExperiment();
        myResearchDog.recordResults();
        // Закриття файлу журналу
        myResearchDog.closeLogFile();
    }
}
