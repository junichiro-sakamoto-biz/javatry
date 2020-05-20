package org.docksidestage.bizfw.basic.objanimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BarkingProcess {
    private HitPoint hitPoint;
    private String barkWord;
    private static final Logger logger = LoggerFactory.getLogger(Animal.class);

    public BarkingProcess(HitPoint hitPoint, String barkWord) {
        this.hitPoint = hitPoint;
        this.barkWord = barkWord;
    }

    public BarkedSound bark(){
        breatheIn();
        prepareAbdominalMuscle();
        return doBark(barkWord);
    }

    protected void prepareAbdominalMuscle() {
        logger.debug("...Using my abdominal muscle"); // dummy implementation
        hitPoint.downHitPoint();
    }

    protected void breatheIn() {
        logger.debug("...Breathing in"); // dummy implementation
        hitPoint.downHitPoint();
    }

    protected BarkedSound doBark(String barkWord) {
        hitPoint.downHitPoint();
        return new BarkedSound(barkWord);
    }
}
