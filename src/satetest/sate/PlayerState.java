package satetest.sate;

import satetest.Player;

public interface PlayerState {
    void next(Player player);
    void prev(Player player);
    void printStatus();
}
