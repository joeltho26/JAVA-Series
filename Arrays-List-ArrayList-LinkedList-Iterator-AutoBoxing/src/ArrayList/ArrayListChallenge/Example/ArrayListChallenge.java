package ArrayList.ArrayListChallenge.Example;

import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {
    public static void main(String[] args) throws NumberFormatException{
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        ArrayList<String> items = new ArrayList<>();
        ArrayList<String> itemsListFinal = new ArrayList<>();
        String option;
        while(flag) {
            System.out.println("Please choose the option below...");
            System.out.println("0 - shutdown | 1 - add item to list (comma separated) | 2 - remove item to list (comma separated)");
            try {
                option = input.nextLine();
                if (Integer.parseInt(option) == 0) {
                    break;
                }
                if (Integer.parseInt(option) == 1) {
                    System.out.println("Please enter the item to be added to the list (comma separated)");
                } else if (Integer.parseInt(option) == 2) {
                    System.out.println("Please enter the item to be removed from the list (comma separated)");
                } else {
                    System.out.println("Invalid option");
                    continue;
                }
                var itemRawData = input.nextLine();
                if (itemRawData.isBlank() || itemRawData.isEmpty()) {
                    continue;
                }
                if (itemRawData.contains(",")) {
                    items = new ArrayList<>(List.of(itemRawData.split(",")));
                } else {
                    items = new ArrayList<>(List.of(itemRawData.trim()));
                }
                switch (Integer.parseInt(option)) {
                    case 1 ->
                        addItems(items, itemsListFinal);
                    case 2 -> {
                        if (itemsListFinal.isEmpty()) {
                            System.out.println("The List is empty!");
                        } else {
                            removeItems(items, itemsListFinal);
                        }
                    }
                    default -> {
                        System.out.println("Invalid Option...please try again...");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid option!");
            }

        }

    }

    public static void addItems (@NotNull ArrayList<String> items,
                                 ArrayList<String> finalList) {
        StringBuilder itemsList = new StringBuilder();
        System.out.print("The items to be added are ");
        for (String i: items) {
            itemsList.append(i).append(", ");
            finalList.add(i);
        }
        System.out.println(itemsList.substring(0,itemsList.length()-2));
        printItems(finalList);
    }

    public static void removeItems (@NotNull ArrayList<String> items,
                                    ArrayList<String> finalList) {
        StringBuilder itemsList = new StringBuilder();
        System.out.print("The items to be removed are ");
        ArrayList<String> notAvailable = new ArrayList<>();
        for (String i: items) {
            itemsList.append(i).append(", ");
            if (finalList.contains(i)) {
                finalList.remove(i);
            } else {
                notAvailable.add(i);
            }
        }
        System.out.println(itemsList.substring(0,itemsList.length()-2));
        if (!notAvailable.isEmpty()) {
            printNonAvailableItems(notAvailable);
        }
        printItems(finalList);

    }

    public static void printItems (@NotNull ArrayList<String> items) {
        StringBuilder totalListItems = new StringBuilder();
        items.sort(String::compareTo);
        System.out.print("The total items in the list are ");
        for (String i: items) {
            totalListItems.append(i).append(", ");
        }

        System.out.println(totalListItems.substring(0,totalListItems.length()-2));
        System.out.println("-".repeat(30));

    }

    public static void printNonAvailableItems (@NotNull ArrayList<String> items) {
        System.out.print("The items not available in the list to delete ");
        items.sort(String::compareTo);
        StringBuilder unavailableListItems = new StringBuilder();
        for (String i: items) {
            unavailableListItems.append(i).append(", ");
        }
        System.out.println(unavailableListItems.substring(0,unavailableListItems.length()-2));
    }

}
