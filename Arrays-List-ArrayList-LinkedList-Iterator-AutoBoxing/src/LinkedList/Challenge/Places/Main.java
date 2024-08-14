package LinkedList.Challenge.Places;

import org.jetbrains.annotations.NotNull;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Places> placesToVisit = new LinkedList<Places>();
        Places place = new Places("Adelaide",1374);
        addPlaces(placesToVisit,place);
        addPlaces(placesToVisit,new Places("Adelaide",1374));
        addPlaces(placesToVisit,new Places("Brisbane",917));
        addPlaces(placesToVisit,new Places("Perth",3923));
        addPlaces(placesToVisit,new Places("Alice Springs",2771));
        addPlaces(placesToVisit,new Places("Darwin",3972));
        addPlaces(placesToVisit,new Places("Melbourne",877));
        addPlaces(placesToVisit,new Places("Sydney",0));

        var iterator = placesToVisit.listIterator();
        Scanner input = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;
        printMenu();
        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }

            if (!iterator.hasNext()) {
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }

            System.out.println("Enter value...");
            String menuItem = input.nextLine().toUpperCase().substring(0,1);
            switch (menuItem) {
                case "F" -> {
                    System.out.println("User wants go forward...");
                    if (!forward) {
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()) {
                            System.out.println(iterator.next());
                        }
                    }
                case "B" -> {
                    System.out.println("User wants go backward...");
                    if (forward) {
                        forward=false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                }
                case "L" -> {
                    System.out.println("User wants to print list of places...");
                    System.out.println(placesToVisit);
                }
                case "M" -> {
                    System.out.println("User wants to print the menu...");
                    printMenu();
                }
                case "Q" -> {
                    System.out.println("User wants to quit...");
                    quitLoop=true;
                }
                default ->  {
                    System.out.println("Invalid option provided by user...");
                }
            }
        }
    }

    public static void addPlaces(@NotNull LinkedList<Places> list, Places place) {
        if (list.contains(place)) {
            System.out.println("Already present!");
            return;
        } else {
            for (Places p: list) {
                if (p.name().equalsIgnoreCase(place.name())) {
                   System.out.println("Already Present");
                   return;
                }
            }

            int matchedIndex=0;
            for (var listPlace: list) {
                if (place.distance() < listPlace.distance()) {
                    list.add(matchedIndex,place);
                    return;
                }
                matchedIndex++;
            }

            list.add(place);
        }

    }

    public static void printMenu() {
        System.out.println("Available actions (select word or letter):");
        System.out.println("(F)orward | (B)ackward | (L)ist Places | (M)enu | (Q)uit");
    }
}
