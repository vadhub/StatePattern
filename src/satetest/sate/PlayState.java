package satetest.sate;

import satetest.Player;

public class PlayState implements PlayerState {
    @Override
    public void next(Player pack) {
        pack.setState(new PauseState());
    }

    @Override
    public void prev(Player pack) {
        pack.setState(new StopState());
    }

    @Override
    public void printStatus() {
        System.out.println("Player is playing. \n");
    }
}
