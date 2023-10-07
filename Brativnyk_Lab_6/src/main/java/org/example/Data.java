package org.example;
/**
 * Інтерфейс, що представляє об'єкти, які можуть бути збережені та порівнювані за їхньою величиною.
 */
public interface Data extends Comparable<Data> {
    /**
     * Повертає розмір об'єкта.
     *
     * @return розмір об'єкта.
     */
    int getSize();
    /**
     * Виводить інформацію про об'єкт.
     */
    void print();
}
