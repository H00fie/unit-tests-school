package bm.app.nameInverterKata;

public class NameInverter {

    public String invert(String name){
        if (ifEmptyOrSpaces(name)){
            return "";
        }
        throw new NullPointerException();
    }

    private boolean ifEmptyOrSpaces(String name){
        return name.trim().isEmpty();
    }


}
