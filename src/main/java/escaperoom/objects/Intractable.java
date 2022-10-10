package escaperoom.objects;

import project.escaperoom.items.Item;

import java.util.Objects;

public abstract class Intractable {

    private final String name;
    private String description;
    private boolean isActive;
    private InteractionType type;
    private String neededItem;

    public Intractable(String name, String description, InteractionType type) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.isActive = false;
    }

    public void interact(Item item) {
        if (Objects.equals(neededItem, item.getName())){
            isActive = true;
        }
    }

    public String getName() {
        return this.name;
    }

    public boolean isActive() {
        return this.isActive;
    }
}
