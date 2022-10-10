package escaperoom.items;

public class Key extends Item{


    int uses;

    public Key(String name) {
        super(name);
        this.uses = 2;
    }

    public Key(String name, int uses){
        super(name);
        this.uses = uses;
    }

    public void use() {

    }
}
