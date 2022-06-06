package fundamental;

import factory.BikeFactory;
import factory.DollFactory;
import factory.Toy;

public class Dwarf implements Observer {

    private String name;

    private Observable observedMagicBoard;

    private final BikeFactory bikeFactory;

    private final DollFactory dollFactory;

    public Dwarf(String name) {
        setName(name);
        dollFactory = new DollFactory();
        bikeFactory = new BikeFactory();
    }

    @Override
    public void update() {
        if(observedMagicBoard == null) {
            throw new IllegalArgumentException("There isn't a magic board specified!");
        }

        Toy toyPreparedForSanta = null;
        String writtenToy = observedMagicBoard.getToy();

        switch (writtenToy) {
            case "barbie doll" -> toyPreparedForSanta = dollFactory.produceAToy("barbie doll");
            case "wooden doll" -> toyPreparedForSanta = dollFactory.produceAToy("wooden doll");
            case "folding bike" -> toyPreparedForSanta = bikeFactory.produceAToy("folding bike");
            case "mountain bike" -> toyPreparedForSanta = bikeFactory.produceAToy("mountain bike");
            case "road bike" -> toyPreparedForSanta = bikeFactory.produceAToy("road bike");
            case "touring bike" -> toyPreparedForSanta = bikeFactory.produceAToy("touring bike");
            default -> System.out.println("Not an existing type of a toy!");
        }

        if(toyPreparedForSanta == null) {
            throw new IllegalArgumentException("The item cannot be null!");
        }
        Santa.getInstance().addAToy(toyPreparedForSanta);
    }

    @Override
    public void setMagicBoard(Observable magicBoard) {
        if(magicBoard == null) {
            throw new IllegalArgumentException("The magic board this dwarf observes cannot be null!");
        }
        observedMagicBoard = magicBoard;
    }

    @Override
    public void removeMagicBoard() {
        observedMagicBoard = null;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name of the dwarf cannot be null or blank!");
        }
        this.name = name;
    }
}
