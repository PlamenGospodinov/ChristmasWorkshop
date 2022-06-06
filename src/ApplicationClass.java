import fundamental.Dwarf;
import fundamental.MagicBoard;
import fundamental.Santa;

public class ApplicationClass {

    public static Santa santaInstance = Santa.getInstance();

    static class Workshop {

        public MagicBoard magicBoard;

        public Dwarf dwarf;

        public Workshop(String dwarfName) {
            magicBoard = new MagicBoard();
            dwarf = new Dwarf(dwarfName);
            magicBoard.subscribe(dwarf);
        }

        public MagicBoard getMagicBoard() {
            return magicBoard;
        }
    }


    public static void main(String[] args) {
        Workshop santasWorkshop = new Workshop("Pesho The Dwarf");
        santaInstance.requestAToy("mountain bike", santasWorkshop.getMagicBoard());
        santaInstance.requestAToy("road bike", santasWorkshop.getMagicBoard());
        santaInstance.requestAToy("touring bike", santasWorkshop.getMagicBoard());
        santaInstance.requestAToy("wooden doll", santasWorkshop.getMagicBoard());
        santaInstance.requestAToy("barbie doll", santasWorkshop.getMagicBoard());

        santaInstance.showAllToys();
    }
}
