package bm.app.textConverterKata;

public class TextConverter {

    public String removeUnderscores(String providedWord) {
        return providedWord.replaceAll("_", "");
    }

    public String convertToCamelCase(String providedWord) {
        String[] parts = providedWord.split("-|\\_");
        String camelCaseString = "";
        for (String part : parts){
            camelCaseString = camelCaseString + toProperCase(part);
        }
        camelCaseString = camelCaseString.substring(0, 1).toLowerCase() + camelCaseString.substring(1);
        return camelCaseString;
    }

    public String toProperCase(String providedString) {
        return providedString.substring(0, 1).toUpperCase() +
                providedString.substring(1).toLowerCase();
    }

    public String maskify(String stringToMaskify) {
        if (stringToMaskify.length() > 4) {
            String partToMaskify = stringToMaskify.substring(0, stringToMaskify.length() - 4);
            partToMaskify = "#".repeat(partToMaskify.length());
            String partToNotMaskify = stringToMaskify.substring(stringToMaskify.length() - 4);
            return partToMaskify + partToNotMaskify;
        } else {
            return stringToMaskify;
        }
    }

}
