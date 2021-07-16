package bm.app.battleOfMagnesiaKata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Battle {

    private static final Logger logger = LoggerFactory.getLogger(Battle.class);

    public void performBattleTactic(Unit unit) {
        unit.setTactic(true);
        switch (unit) {
            case PHALANGITES:
                logger.info("Phalangites formed a phalanx!");
        }
    }

}
