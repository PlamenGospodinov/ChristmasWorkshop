package fundamental;

import fundamental.Observable;

public interface Observer {

    void update();

    void setMagicBoard(Observable topic);

    void removeMagicBoard();
}
