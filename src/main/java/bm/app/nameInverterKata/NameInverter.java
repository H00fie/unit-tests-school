package bm.app.nameInverterKata;

import java.util.ArrayList;
import java.util.List;

public class NameInverter {

    public String invert(String name) {
        if (StringSupporter.ifEmptyOrSpaces(name)) {
            return "";
        }
        ArrayList<String> splitName = splitTheName(name);
        return StringSupporter.createInversion(splitName);
    }

    private ArrayList<String> splitTheName(String name){
        return new ArrayList<>(List.of(name.split(" ")));
    }

}

class StringSupporter {

    public static String createInversion(ArrayList<String> splitName) {
        splitName.removeIf(n -> List.of("Lord", "Lady").contains(n));
        return String.format("%s %s", splitName.get(1), splitName.get(0));
    }


    public static boolean ifEmptyOrSpaces(String name) {
        return name.trim().isEmpty();
    }

}
