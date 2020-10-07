package bm.app.nameInverterKata;

import org.assertj.core.util.Lists;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


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
        return String.join(", ", revertList(splitName));
    }

    private static ArrayList<String> revertList(ArrayList<String> splitName){
        return Lists.newArrayList(splitName.stream()
                .collect(Collectors.toCollection(LinkedList::new))
                .descendingIterator());
    }


    public static boolean ifEmptyOrSpaces(String name) {
        return name.trim().isEmpty();
    }

}
