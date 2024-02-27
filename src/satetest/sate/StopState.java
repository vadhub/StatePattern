package satetest.sate;

import satetest.Player;

public class StopState implements PlayerState {

    @Override
    public void next(Player pack) {
        pack.setState(new PlayState());
    }

    @Override
    public void prev(Player pack) {
        System.out.println("Stop is root state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Player is stop. \n");
    }
}
