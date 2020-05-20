package org.docksidestage.bizfw.basic.objanimal;

public class HitPoint {
    private int point;
    private String barkWord;
    public HitPoint(int point, String barkWord) {
        point = point;
        barkWord = barkWord;
    }

    public void down(){
        point--;
    }

    void downHitPoint() {
        --point;
        if (point== 0) {
            throw new IllegalStateException("I'm very tired, so I want to sleep" + barkWord );
        }
    }

    public int get(){
        return point;
    }
}
