package Workshop_06;

import java.util.ArrayList;

public class Menu {

    public static int getChoice(ArrayList<String> options) {
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + " - " + options.get(i));
        }

        return Inputter.inputInt("Choose 1.." + options.size() + ": ", 1, options.size());
    }

    public static int getChoice(Object[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + " - " + options[i]);
        }

        return Inputter.inputInt("Choose 1.." + options.length + ": ", 1, options.length);
    }

    public static int getChoice(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + " - " + options[i]);
        }

        return Inputter.inputInt("Choose 1.." + options.length + ": ", 1, options.length);
    }
}
