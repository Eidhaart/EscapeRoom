package escaperoom;


import project.escaperoom.items.Item;
import project.escaperoom.objects.Intractable;

import java.util.HashMap;

public class Room {

    private String name;
    private String description;
    private int size;
    private final HashMap<String, Intractable> objects = new HashMap<>();
    private final HashMap<String, Item> items = new HashMap<>();

    public Room(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public void addObject(Intractable object) throws Exception {
            objects.put(object.getName(), object);

    }

    public String listObjects(){
       return objects.keySet().toString();
    }
}
