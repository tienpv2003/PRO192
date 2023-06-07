package GUI;

import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;

import java.util.Scanner;

public class AntiqueShop {
    enum Option {
        CREATE_VASE,
        CREATE_STATUE,
        CREATE_PAINTING,
        DISPLAY_ITEM
    }

    public static Option getChoice() {
        Option[] options = Option.values();
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + "-" + options[i]);
        }

        System.out.println("Choice 1.." + options.length + ": ");

        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());

        if (choice >= 1 && choice <= options.length) {
            return options[choice - 1];
        } else {
            throw new IllegalArgumentException("Invalid choice");
        }
    }

    public static void main(String[] args) {
        Item item = null;
        Option choice;

        Scanner sc = new Scanner(System.in);

        do {
            choice = getChoice();

            switch (choice) {
                case CREATE_VASE:
                    item = new Vase();
                    ((Vase) item).inputVase();
                    break;

                case CREATE_STATUE:
                    item = new Statue();
                    ((Statue) item).inputStatue();
                    break;

                case CREATE_PAINTING:
                    item = new Painting();
                    ((Painting) item).inputPainting();
                    break;

                case DISPLAY_ITEM:
                    if (item != null) {
                        if (item instanceof Vase) {
                            ((Vase) item).outputVase();
                        } else if (item instanceof Statue) {
                            ((Statue) item).outputStatue();
                        } else if (item instanceof Painting) {
                            ((Painting) item).outputPainting();
                        }
                    } else {
                        System.out.println("You need to create an object");
                    }
                    break;
            }
        } while (choice != Option.DISPLAY_ITEM);
    }
}
