package satetest.sate;

import satetest.Player;

public class PauseState implements PlayerState {
    @Override
    public void next(Player player) {
        player.setState(new StopState());
    }

    @Override
    public void prev(Player player) {
        player.setState(new ResumeState());
    }

    @Override
    public void printStatus() {
        System.out.println("Player is pause. \n");
    }
}
