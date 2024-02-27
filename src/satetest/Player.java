package satetest;

import satetest.sate.PlayerState;
import satetest.sate.StopState;

public class Player {
    private PlayerState state = new StopState();

    public PlayerState getState() {
        return state;
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void previousSate() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
