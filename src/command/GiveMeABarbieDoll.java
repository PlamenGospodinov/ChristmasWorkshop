package command;

import fundamental.MagicBoard;

public class GiveMeABarbieDoll implements Command {

    public MagicBoard magicBoard;

    public GiveMeABarbieDoll(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        magicBoard.requestToyFromDwarfs("barbie doll");
    }
}
