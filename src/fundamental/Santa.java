package fundamental;

import command.*;
import factory.Toy;

import java.util.ArrayList;
import java.util.List;

public class Santa {

    private static Santa instance;

    private final List<Toy> toysWarehouse;

    public static Santa getInstance() {
        if(instance == null){
            instance = new Santa();
        }
        return instance;
    }

    private Santa(){
        toysWarehouse = new ArrayList<>();
    }

    public void addAToy(Toy toy) {
        if(toy != null) {
            toysWarehouse.add(toy);
        } else {
            throw new IllegalArgumentException("Toy cannot be null!");
        }
    }

    public void showAllToys() {
        for(Toy toy : toysWarehouse) {
            System.out.println(toy.toString() + ", ");
        }
        System.out.println("The number of toys in Santa's warehouse is: " + toysWarehouse.size());
    }

    public void requestAToy(String wantedToy, MagicBoard magicBoard) {
        Command command = null;
        switch (wantedToy.toLowerCase()) {
            case "barbie doll" -> command = new GiveMeABarbieDoll(magicBoard);
            case "wooden doll" -> command = new GiveMeAWoodenDoll(magicBoard);
            case "mountain bike" -> command = new GiveMeAMountainBike(magicBoard);
            case "road bike" -> command = new GiveMeARoadBike(magicBoard);
            case "folding bike" -> command = new GiveMeAFoldingBike(magicBoard);
            case "touring bike" -> command = new GiveMeATouringBike(magicBoard);
            default -> System.out.println("Santa cannot ask for such toy!");
        }
        if(command == null) {
            throw new IllegalArgumentException("Null toy given!");
        }
        command.execute();
    }
}
