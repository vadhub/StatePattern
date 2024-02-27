package satetest;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.printStatus(); // Player is stop.

        player.nextState();
        player.printStatus(); // Player is playing.

        player.nextState();
        player.printStatus(); // Player is pause.

        player.previousSate();
        player.printStatus(); // Playing is Resume.

        player.nextState();
        player.printStatus(); // Player is stop.

    }
}