package command;

import fundamental.MagicBoard;

public class GiveMeATouringBike implements Command {

    public MagicBoard magicBoard;

    public GiveMeATouringBike(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        magicBoard.requestToyFromDwarfs("touring bike");
    }
}
