package escaperoom.player;

public enum DiceTypes {
    D20(20),
    D12(12),
    D10(10),
    D8(8),
    D6(6),
    D4(4),
    D2(2);

    final int span;

    DiceTypes(int span){
        this.span = span;
    }
}
