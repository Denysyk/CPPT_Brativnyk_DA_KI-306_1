package org.example;

/**
 * Клас, який представляє побутовий предмет та реалізує інтерфейс Data.
 */
public class HouseholdItem implements Data {
    private String itemName;
    private int size;

    public HouseholdItem(String itemName, int size) {
        if (size > 100) {
            throw new IllegalArgumentException("Invalid size. Size cannot be more than 100.");
        }
        this.itemName = itemName;
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
        System.out.println("Household Item: " + itemName + ", Size: " + size);
    }
}
