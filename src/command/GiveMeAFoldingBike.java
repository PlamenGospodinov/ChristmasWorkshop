package command;

import fundamental.MagicBoard;

public class GiveMeAFoldingBike implements Command {

    public MagicBoard magicBoard;

    public GiveMeAFoldingBike(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        magicBoard.requestToyFromDwarfs("folding bike");
    }
}
