package escaperoom;

import project.escaperoom.player.Player;

import java.util.Scanner;

public class Gameplay {

    public boolean exit = false;
    Player player = new Player();
    Scanner scanner = new Scanner(System.in);

    Room room = new Room("Main room", "Big nice room");

    public void story() throws InterruptedException {
        System.out.println("""
                You find yourself in a poorly lit room. The interior seems to be clean and tidy.
                There is a small desk standing next to the fireplace and a leather chair right in front of the fireplace.
                 On the right side of the room there is a big wooden bookcase \s""");

        Thread.sleep(5000);

        System.out.println("""
                                What do you do?
                \s""");

        while (!exit) {
            String choice = scanner.next();

        }
    }
}
