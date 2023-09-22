package org.example;

import java.io.*;
/**
 * Клас, який представляє дослідницьку собаку, який розширює клас Dog та реалізує BehaviorResearch.
 */
public class ResearchDog extends Dog implements BehaviorResearch {
    private PrintWriter experimentLogFile;

    public ResearchDog(String name, int age, String breed, boolean isTrained) throws FileNotFoundException {
        super(name, age, breed, isTrained);
        experimentLogFile = new PrintWriter(new File("ExperimentLog.txt"));
    }
    /**
     * Починає спостереження за поведінкою собаки.
     */
    @Override
    public void observeBehavior() {
        System.out.println("Початок спостереження за поведінкою собаки " + getName() + "\n");
        // Тут реалізуйте спостереження за поведінкою собаки
        System.out.println("Завершено спостереження за поведінкою собаки " + getName());
        experimentLogFile.println("Спостереження за поведінкою собаки " + getName());
        experimentLogFile.flush();
    }
    /**
     * Аналізує дані, зібрані під час спостереження за поведінкою.
     */
    @Override
    public void analyzeData() {
        System.out.println("Початок аналізу даних про поведінку собаки " + getName() + "\n");
        // Тут реалізуйте аналіз даних про поведінку собаки
        System.out.println("Завершено аналіз даних про поведінку собаки " + getName());
        experimentLogFile.println("Аналіз даних про поведінку собаки " + getName());
        experimentLogFile.flush();
    }
    /**
     * Проводить експеримент з собакою.
     */
    public void performExperiment() {
        System.out.println("Початок експерименту над собакою " + getName() + "\n");
        // Тут реалізуйте дослід, який ви хочете провести над собакою
        System.out.println("Завершено експеримент над собакою " + getName());
        experimentLogFile.println("Експеримент над собакою " + getName());
        experimentLogFile.flush();
    }
    /**
     * Реєструє результати експерименту.
     */
    public void recordResults() {
        System.out.println("Початок запису результатів експерименту над собакою " + getName() + "\n");
        // Тут реалізуйте запис результатів експерименту
        System.out.println("Завершено запис результатів експерименту над собакою " + getName());
        experimentLogFile.println("Запис результатів експерименту над собакою " + getName());
        experimentLogFile.flush();
    }
    /**
     * Закриває файл журналу, використовуваний для записів.
     */
    @Override
    public void closeLogFile() {
        super.closeLogFile();
        experimentLogFile.close();
    }
}
