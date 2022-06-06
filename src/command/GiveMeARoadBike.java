package command;

import fundamental.MagicBoard;

public class GiveMeARoadBike implements Command {

    public MagicBoard magicBoard;

    public GiveMeARoadBike(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        magicBoard.requestToyFromDwarfs("road bike");
    }
}
