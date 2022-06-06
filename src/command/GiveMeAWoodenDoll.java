package command;

import fundamental.MagicBoard;

public class GiveMeAWoodenDoll implements Command {

    public MagicBoard magicBoard;

    public GiveMeAWoodenDoll(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        magicBoard.requestToyFromDwarfs("wooden doll");
    }
}
