package escaperoom.objects;

import project.escaperoom.items.Item;

public class Window extends Intractable {

    public Window(String name, String description) {
        super(name, description, InteractionType.PASSAGE);
    }

    public void interact(Item item) {
        super.interact(item);
        if (this.isActive()){
            System.out.println("You used" + item.getName());
            System.out.println("The window opens");
        }
    }
}
