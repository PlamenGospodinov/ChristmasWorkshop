package fundamental;

import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable {

    private String requestedToy;

    private final List<Observer> dwarfsInService;

    public MagicBoard() {
        dwarfsInService = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        if(observer != null) {
            dwarfsInService.add(observer);
            observer.setMagicBoard(this);
        } else {
            throw new IllegalArgumentException("The dwarf cannot be null!");
        }
    }

    @Override
    public void unsubscribe(Observer observer) {
        if(observer != null) {
            dwarfsInService.remove(observer);
            observer.removeMagicBoard();
        } else {
            throw new IllegalArgumentException("The dwarf cannot be null!");
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer dwarf : dwarfsInService) {
            dwarf.update();
        }
    }

    @Override
    public String getToy() {
        return requestedToy;
    }

    public void requestToyFromDwarfs(String requestedToyFromSanta) {
        if(requestedToyFromSanta == null || requestedToyFromSanta.isBlank()) {
            throw new IllegalArgumentException("The requested toy cannot be null or blank!");
        }
        requestedToy = requestedToyFromSanta;
        System.out.printf("%s is written on the board! \n", requestedToyFromSanta);
        notifyObservers();
        System.out.println("---------------------------------------------------");
    }
}
