package org.example;

public class HouseholdPackageDriver {
    public static void main(String[] args) {
        HouseholdPackage<Data> package1 = new HouseholdPackage<>();
        HouseholdPackage<Data> package2 = new HouseholdPackage<>();

        HouseholdItem item1 = new HouseholdItem("Sofa", 1000);
        HouseholdItem item2 = new HouseholdItem("Microwave", 30);
        HouseholdItem item3 = new HouseholdItem("TV", 50);
        HouseholdItem item4 = new HouseholdItem("Bed", 69);
        ElectronicDevice device1 = new ElectronicDevice("Smart TV", 17);

        package1.addItem(item1);
        package1.addItem(item2);
        package1.addItem(item3);
        System.out.println();
        package2.addItem(item4);
        package2.addItem(device1);
        System.out.println();
        Data maxItem1 = package1.findMax();
        if (maxItem1 != null) {
            System.out.print("The largest item in package 1: ");
            maxItem1.print();
        } else {
            System.out.println("Package 1 is empty.");
        }

        Data maxItem2 = package2.findMax();
        if (maxItem2 != null) {
            System.out.print("The largest item in package 2: ");
            maxItem2.print();
        } else {
            System.out.println("Package 2 is empty.");
        }

        System.out.println();
        System.out.println("Removing item from package 1.");
        package1.removeItem(2);
        System.out.println();
        System.out.println("Removing item from package 2.");
        package2.removeItem(0);
    }
}
