package bm.app.BlackMarketKata;

public class RidiculousExtortionException extends Throwable{

    private String message;

    public RidiculousExtortionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
