package satetest.sate;

import satetest.Player;

public class ResumeState implements PlayerState {
    @Override
    public void next(Player player) {
        player.setState(new StopState());
    }

    @Override
    public void prev(Player player) {
        player.setState(new PauseState());
    }

    @Override
    public void printStatus() {
        System.out.println("Playing is Resume. \n");
    }
}
