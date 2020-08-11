package bm.app.nameInverterKata;

public class NameInverter {

    public String invert(String name) {
        if (StringSupporter.ifEmptyOrSpaces(name)) {
            return "";
        }
        return StringSupporter.createInversion(name);
    }

}

class StringSupporter {

    public static boolean ifEmptyOrSpaces(String name) {
        return name.trim().isEmpty();
    }

    public static String createInversion(String name) {
        String[] splitName = name.split(" ");
        if (splitName.length > 2) {
            return String.format("%s %s", splitName[2], splitName[1]);
        } else {
            return String.format("%s %s", splitName[1], splitName[0]);
        }
    }

}
