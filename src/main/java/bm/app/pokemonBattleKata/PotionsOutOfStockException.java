package bm.app.pokemonBattleKata;

public class PotionsOutOfStockException extends Throwable {

    private String message;

    public PotionsOutOfStockException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
