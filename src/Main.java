import application.AlphabetService;
import application.AlphabetServiceImpl;
import infrastructure.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        AlphabetService alphabetService = new AlphabetServiceImpl();
        ConsoleUI consoleUI = new ConsoleUI(alphabetService);
        consoleUI.run();
    }
}
