package org.example;

/**
 * Клас, який представляє електронний пристрій та реалізує інтерфейс Data.
 */
public class ElectronicDevice implements Data {
    private String deviceName;
    private int size;

    public ElectronicDevice(String deviceName, int size) {
        if (size > 100) {
            throw new IllegalArgumentException("Invalid size. Size cannot be more than 100.");
        }
        this.deviceName = deviceName;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int compareTo(Data otherItem) {
        return Integer.compare(this.size, otherItem.getSize());
    }

    @Override
    public void print() {
        System.out.println("Electronic Device: " + deviceName + ", Size: " + size);
    }
}
