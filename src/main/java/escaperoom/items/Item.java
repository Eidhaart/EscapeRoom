package escaperoom.items;

public abstract class Item {

    private double effect;
    private final String name;
    private String description;
    private int neededInt;

    public Item(String name) {
        this.name = name;

    }

    public Item(String name, double effect) {
        this.name = name;
        this.effect = effect;
    }

    public Item(String name, int neededInt) {
        this.name = name;
        this.neededInt = neededInt;
    }

    public Item(String name, int neededInt, double effect) {
        this.name = name;
        this.neededInt = neededInt;
        this.effect = effect;
    }

    public void use(){

    }

    public double getEffect() {
        return effect;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNeededInt() {
        return neededInt;
    }
}
