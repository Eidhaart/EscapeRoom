package escaperoom.items;

import project.escaperoom.player.Dice;
import project.escaperoom.player.DiceTypes;

public class Weapon extends Item{

    public double effect;
    Dice dice = new Dice();
    DiceTypes damage;

    public Weapon(String name) {
        super(name);
        this.damage = DiceTypes.D4;
    }

    @Override
    public void use() {
        super.use();
    }
}
