package command;

import fundamental.MagicBoard;

public class GiveMeAMountainBike implements Command {

    public MagicBoard magicBoard;

    public GiveMeAMountainBike(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        magicBoard.requestToyFromDwarfs("mountain bike");
    }
}
