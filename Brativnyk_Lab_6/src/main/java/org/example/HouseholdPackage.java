package org.example;

import java.util.ArrayList;

/**
 * Клас, який представляє пакет для зберігання об'єктів, які реалізують інтерфейс Data.
 *
 * @param <T> тип об'єктів, які можуть бути додані до пакету.
 */
public class HouseholdPackage<T extends Data> {
    private ArrayList<T> items;

    public HouseholdPackage() {
        items = new ArrayList<>();
    }

    public T findMax() {
        if (!items.isEmpty()) {
            T max = items.get(0);
            for (int i = 1; i < items.size(); i++) {
                if (items.get(i).compareTo(max) > 0) {
                    max = items.get(i);
                }
            }
            return max;
        }
        return null;
    }

    public void addItem(T item) {
        items.add(item);
        System.out.print("Item added: ");
        item.print();
    }

    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            T removedItem = items.remove(index);
            System.out.print("Item removed: ");
            removedItem.print();
        } else {
            System.out.println("Invalid index. Item not removed.");
        }
    }
}
