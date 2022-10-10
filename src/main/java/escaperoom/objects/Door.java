package escaperoom.objects;

import project.escaperoom.items.Item;

public class Door extends Intractable {


    public Door(String name, String description) {
        super(name, description, InteractionType.PASSAGE);
    }

    public void interact(Item item) {
        super.interact(item);
        if (this.isActive()){
            System.out.println("You used" + item.getName());
            System.out.println("The door opens");
        }
    }
}
