package escaperoom.player;

import project.escaperoom.items.Item;

import java.util.HashMap;
import java.util.Map;

public class Player {

    private String name;
    private int hp;
    private LvlThreshold level;
    private int xp;
    private int xpToNextLvl = LvlThreshold.LVL2.xp;
    private final Map<Attribute, Integer> attributes = new HashMap<>();
    private int defense;
    private final HashMap<String, Item> inventory = new HashMap<>();

    public Player() {
        this.level = LvlThreshold.LVL1;
        setAttributes();
    }

    public void addItem(Item item) {
        inventory.put(item.getName(), item);
        System.out.println("Added " + item.getName() + " to your inventory");
    }

    public String showInventory() {
        return inventory.keySet().toString();

    }

    public String showStats() {
        return attributes.toString();
    }

    public void setAttributes() {
        for (Attribute attribute : Attribute.values()) {
            attributes.put(attribute, 1);
        }
    }

    public void setAttribute(Attribute attribute, int value) {
        attributes.put(attribute, value);
    }

    private void raiseAttribute(Attribute attribute) {
        attributes.put(attribute, attributes.get(attribute) + 1);
    }

    public void addXp(int xp) {
        System.out.println("You gained " + xp + "xp");
        this.xp += xp;
        if (this.xpToNextLvl <= this.xp) {
            levelUp();
        }
    }

    public void levelUp() {
        switch (level) {
            case LVL1:
                this.level = LvlThreshold.LVL2;
                this.xpToNextLvl = LvlThreshold.LVL3.xp;
                break;
            case LVL2:
                this.level = LvlThreshold.LVL3;
                this.xpToNextLvl = LvlThreshold.LVL4.xp;
                break;
            case LVL3:
                this.level = LvlThreshold.LVL4;
                this.xpToNextLvl = LvlThreshold.LVL5.xp;
                break;
            case LVL4:
                this.level = LvlThreshold.LVL5;
                break;
        }
        System.out.println("\nYou leveled up to: " + level + "\n");
    }

    @Override
    public String toString() {
        return "\nPlayer" +
                "\n level=" + level +
                "\n xp=" + xp +
                "\nXp to next lvl" + xpToNextLvl +
                "\nAttributes= " + showStats() +
                "\n Inventory= " + showInventory() + "\n";
    }
}
