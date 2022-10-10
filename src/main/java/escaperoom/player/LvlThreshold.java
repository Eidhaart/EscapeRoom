package escaperoom.player;

public enum LvlThreshold {
    LVL1(0),
    LVL2(300),
    LVL3(900),
    LVL4(2_700),
    LVL5(6_500),
    ;

    final int xp;

    LvlThreshold(int xp) {
        this.xp = xp;
    }


}
