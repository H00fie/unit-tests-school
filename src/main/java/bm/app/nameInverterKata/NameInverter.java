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
        return String.format("%s %s", splitName[1], splitName[0]);
    }

}
