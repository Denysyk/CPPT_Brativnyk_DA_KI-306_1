package org.example;
/**
 * Інтерфейс для дослідження поведінки, який визначає методи для спостереження за поведінкою та аналізу даних.
 */
public interface BehaviorResearch {
    /**
     * Спостерігає та реєструє поведінку.
     */
    void observeBehavior();
    /**
     * Аналізує зібрані дані.
     */
    void analyzeData();
    /**
     * Проводить експеримент з собакою.
     */
    void performExperiment();
    /**
     * Реєструє результати експерименту.
     */
    void recordResults();
    /**
     * Закриває файл журналу, використовуваний для записів.
     */
    void closeLogFile();
}
